let v1 = [];
let v2 = [];
for (let index = 0; index < 5; index++) {
    v1[index] = Math.floor(Math.random()*(100));
    v2[index] = Math.floor(Math.random()*(100));
    
}
v1.splice (v1.length-2,2);
v2.splice(v2.length-2,2);
alert(`Vector 1-------
${v1}
Vector 2 ---------
${v2}`);
