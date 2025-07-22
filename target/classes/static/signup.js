let icon=document.getElementById("toggleIcon");
let pass=document.getElementById("Password");
icon.onclick=function(){
    if(pass.type==="password"){
      pass.type="text";
      icon.classList.remove("bi-eye-slash");
      icon.classList.add("bi-eye");
    }else{
      pass.type="password";
      icon.classList.add("bi-eye-slash");
      icon.classList.remove("bi-eye");
    }
}