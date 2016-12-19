$(document).ready(function () {
    var $cart = $('#selected-seats'),
            $counter = $('#counter'),
            $total = $('#total'),
            sc = $('#seat-map').seatCharts({
        map: [//Seating chart
            'ff__ff',
            'ff__ff',
            '______',
            'eee_ee',
            'eee_ee',
            'eee_ee',
            'eee_ee',
            'eee_ee',
            'eee_ee'
        ],
        seats: {//Definition seat property
            f: {
                price: 100,
                classes: 'first-class',
                category: '1st'
            },
            e: {
                price: 40,
                classes: 'economy-class',
                category: '2nd'
            }
        },
        naming: {//Define the ranks of other information
            top: true,
            columns: ['A', 'B', 'C', '', 'D', 'F'],
            rows: ['01', '02', '', '03', '04', '05', '06', '07', '08', '09'],
            getLabel: function (character, row, column) {
                return row + column;
            }
        },
        legend: {//Definition legend
            node: $('#legend'),
            items: [
                ['f', 'available', '1st'],
                ['e', 'available', '2nd'],
                ['f', 'unavailable', 'Sold']
            ]
        },
        click: function () {
            if (this.status() === 'available') {//Optional seat
                $('<li>' + this.data().category + '<br/>Car 1 No.' + this.settings.label + '<br/>$' + this.data().price + '</li>')
                        .attr('id', 'cart-item-' + this.settings.id)
                        .data('seatId', this.settings.id)
                        .appendTo($cart);
                //Update tickets
                $counter.text(sc.find('selected').length + 1);
                //calculate total money
                $total.text(recalculateTotal(sc) + this.data().price);
                return 'selected';
            } else if (this.status() === 'selected') {//choosen
                $counter.text(sc.find('selected').length - 1);
                $total.text(recalculateTotal(sc) - this.data().price);
                //Delete reservation
                $('#cart-item-' + this.settings.id).remove();
                return 'available';
            } else if (this.status() === 'unavailable') {//sold
                //sold
                return 'unavailable';
            } else {
                return this.style();
            }
        },
        focus: function () {
            if (this.status() === 'available') {
                $("#seat-info").show().html(this.settings.label);
                var cd = getMousePoint(event);
                $("#seat-info").css({"left": (cd.x + 10) + 'px', "top": (cd.y - 30) + "px"});
                return 'focused';
            } else {
                return this.style();
            }
        }
    });

    //Sold without optional seat
    sc.get(['01_A', '04_A', '07_B', '07_F']).status('unavailable');
});

//total money
function recalculateTotal(sc) {
    var total = 0;
    sc.find('selected').each(function () {
        total += this.data().price;
    });

    return total;
}

//Get the mouse coordinates
function getMousePoint(ev) {
    // Define the position of the mouse in the window of  
    var point = {
        x: 0,
        y: 0
    };

    // If the browser supports pageYOffset, get the distance between pages and windows through pageXOffset and pageYOffset 
    if (typeof window.pageYOffset !== 'undefined') {
        point.x = window.pageXOffset;
        point.y = window.pageYOffset;
    }
    // If the browser supports compatMode, and specify a DOCTYPE, get rolling distance as the distance by documentElement between pages and windows
    // IE, when the page designated DOCTYPE, value compatMode is CSS1Compat, otherwise the value compatMode is BackCompat
    else if (typeof document.compatMode !== 'undefined' && document.compatMode !== 'BackCompat') {
        point.x = document.documentElement.scrollLeft;
        point.y = document.documentElement.scrollTop;
    }
    // If the browser supports document.body, can get rolling height by document.body
    else if (typeof document.body !== 'undefined') {
        point.x = document.body.scrollLeft;
        point.y = document.body.scrollTop;
    }

    // Plus the mouse position in the window of  
    point.x += ev.clientX;
    point.y += ev.clientY;

    // Returns the mouse position in the window of  
    return point;
}  		