
var N = 10000;
var M = 10000;

var HEAPU32 = new Uint32Array(N*2);

for (var i = 0; i < N; i++) {
  HEAPU32[i] = (i*i*i) % (N+1);
}

for (var t = 0; t < M; t++) {
  for (var i = 0; i < N; i++) {
    HEAPU32[N+i] = (i + HEAPU32[Math.max(i-1, 0)] + HEAPU32[Math.min(i+1, N-1)]) >>> 2; // addition that flows into >>> is still safe and in 53 bits
  }
  for (var i = 0; i < N; i++) {
    HEAPU32[i] = HEAPU32[N+i];
  }
}

//print(Array.prototype.slice.call(HEAPU32.subarray(0, N/2)));

