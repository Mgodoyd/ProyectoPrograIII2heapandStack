$(document).ready(function () {
    var e = ace.edit("code");
    e.getSession().setMode("ace/mode/java");
    e.setTheme("ace/theme/github");
    e.setValue(`public class Main {
        public static void main(String[] args) {
    
        }
    }`);
    
    $("#btn2").hide();
    $("#btn").on("click", function () {

     $("#btn").hide();
     $("#btn2").show();
      

      $("#heapbox").show(3000);
      $("#heapbox2").show(5000);
      $("#heapbox3").show(7000);

      $("#heapbox1_1").show(4000);
      $("#heapbox2_1").show(6000);
      $("#heapbox3_1").show(8000);
      $("#heapbox4_1").show(10000);
      $("#heapbox5_1").show(12000);
      $("#heapbox6_1").show(14000);
      $("#heapbox7_1").show(16000);

      $("#heapbox1_2").show(4000);
      $("#heapbox2_2").show(6000);
      $("#heapbox3_2").show(8000);
      $("#heapbox4_2").show(10000);
      $("#heapbox5_2").show(12000);
      $("#heapbox6_2").show(14000);
      $("#heapbox7_2").show(16000);

     

        let timerInterval
    Swal.fire({
      title: 'Ejecutando!',
      html: 'Termina en <b></b> milisegundos.',
      timer: 16000,
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
});


