/* empty css             *//* empty css                     */import{l as V}from"./api-bE-7tO98.js";import{u as k}from"./profileStore-EL8abqdR.js";import{r as v,H as F,z as p,a as I,b as x,c as B,w as r,I as E,d as a,e as m,g as d,n as y,J as C,m as N}from"./index-Txr9QX3w.js";const h=d("h1",null,"Welcome back",-1),q=d("p",null,"Please enter your details",-1),J={__name:"LoginForm",setup(P){const i=v(),l=k(),_=F(),o=p({username:"",password:""}),c=p({username:[{required:!0,message:"请输入用户名",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"}]});async function f(n){n&&await n.validate((e,u)=>{e&&V(o.username,o.password).then(t=>{alert(t.data.msg),l.userId=t.data.data.userId,l.username=t.data.data.name,l.email=t.data.data.email,_.push("/")})})}return(n,e)=>{const u=y,t=C,g=N,b=I("router-link"),w=E;return x(),B(w,{"label-position":"top",ref_key:"ruleFormRef",ref:i,rules:c,model:o},{default:r(()=>[h,q,a(t,{label:"用户名",prop:"username"},{default:r(()=>[a(u,{modelValue:o.username,"onUpdate:modelValue":e[0]||(e[0]=s=>o.username=s)},null,8,["modelValue"])]),_:1}),a(t,{label:"密码",prop:"password"},{default:r(()=>[a(u,{modelValue:o.password,"onUpdate:modelValue":e[1]||(e[1]=s=>o.password=s)},null,8,["modelValue"])]),_:1}),a(g,{color:"#456442",onClick:e[2]||(e[2]=s=>f(i.value))},{default:r(()=>[m("登录")]),_:1}),d("p",null,[m(" 还没有注册账号？点此 "),a(b,{to:"/auth/register"},{default:r(()=>[m("注册")]),_:1})])]),_:1},8,["rules","model"])}}};export{J as default};