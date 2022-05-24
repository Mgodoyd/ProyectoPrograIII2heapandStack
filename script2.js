
$("#btn2").on("click", function () {
     
        
    $("#heapbox1_3").show(5000);
    $("#heapbox2_3").show(7000);
    $("#heapbox3_3").show(9000);
    $("#heapbox4_3").show(11000);
    $("#heapbox5_3").show(13000);
    $("#heapbox6_3").show(15000);
    $("#heapbox7_3").show(17000);
    $("#heapbox8_3").show(19000);
    $("#heapbox9_3").show(21000);
    $("#heapbox10_3").show(23000);

    $("#heapbox4").show(5000);
    $("#heapbox5").show(8000);
    $("#heapbox6").show(11000);

    $("#heapbox8_2").show(5000);
    $("#heapbox9_2").show(7000);
    $("#heapbox10_2").show(9000);
    $("#heapbox11_2").show(11000);
    $("#heapbox12_2").show(13000);
    $("#heapbox13_2").show(15000);
    $("#heapbox14_2").show(17000);
    $("#heapbox15_2").show(19000);
    $("#heapbox16_2").show(21000);
    $("#heapbox17_2").show(23000);


    $("#heapbox").toggle();
    $("#heapbox2").toggle();
    $("#heapbox3").toggle();

    $("#heapbox1_1").toggle();
    $("#heapbox2_1").toggle();
    $("#heapbox3_1").toggle();
    $("#heapbox4_1").toggle();
    $("#heapbox5_1").toggle();
    $("#heapbox6_1").toggle();
    $("#heapbox7_1").toggle();

    $("#heapbox1_2").toggle();
    $("#heapbox2_2").toggle();
    $("#heapbox3_2").toggle();
    $("#heapbox4_2").toggle();
    $("#heapbox5_2").toggle();
    $("#heapbox6_2").toggle();
    $("#heapbox7_2").toggle();

let timerInterval
Swal.fire({
title: 'Ejecutando!',
html: 'Termina en <b></b> milisegundos.',
timer: 23000,
timerProgressBar: true,
didOpen: () => {
  Swal.showLoading()
  const b = Swal.getHtmlContainer().querySelector('b')
  timerInterval = setInterval(() => {
    b.textContent = Swal.getTimerLeft()
  }, 100)
},
willClose: () => {
  clearInterval(timerInterval)
}
}).then((result) => {
/* Read more about handling dismissals below */
if (result.dismiss === Swal.DismissReason.timer) {
  console.log('I was closed by the timer')

  const Toast = Swal.mixin({
      toast: true,
      position: 'top-end',
      showConfirmButton: false,
      timer: 4000,
      timerProgressBar: true,
      didOpen: (toast) => {
        toast.addEventListener('mouseenter', Swal.stopTimer)
        toast.addEventListener('mouseleave', Swal.resumeTimer)
      }
    })
    
    Toast.fire({
      icon: 'success',
      title: 'Successfully'
    })
}
})
});




