1
193
186 163 417 196 332 127 111 15 31 475 199 62 293 216 12 173 119 123 402 196 50 203 420 206 464 468 65 398 354 205 190 392 367 106 439 50 232 50 64 114 376 114 27 168 329 391 340 300 13 93 347 414 295 266 471 110 85 35 7 439 239 196 182 457 153 120 6 236 169 69 201 396 34 227 415 215 469 254 366 481 198 212 247 492 477 217 101 62 252 459 352 342 6 385 299 10 4 304 245 25 225 297 420 258 376 335 324 344 440 189 177 138 400 423 481 229 491 434 142 242 392 493 436 398 377 234 407 232 389 4 256 113 300 28 223 27 214 46 371 153 235 47 142 486 321 123 214 311 56 355 405 299 347 340 196 75 73 455 307 461 458 414 426 109 441 500 136 154 45 358 159 131 404 300 117 224 274 330 386 181 185 290 480 383 129 27 310 53 481 468 366 290 381 
291
class GfG
{
    static int min=Integer.MAX_VALUE;
      public static int maxDiff(Node root, int k)
       {
           if(root==null)
           return min;
           if(min==Integer.MAX_VALUE)
           min=root.data;
           else
           {
               if(Math.abs(k-min)>Math.abs(k-root.data))
               min=root.data;
               else if(Math.abs(k-min)==Math.abs(k-root.data))
               min=Math.min(k,root.data);
           }
           if(k<root.data)
           maxDiff(root.left,k);
           if(k>root.data)
           maxDiff(root.right,k);
           return min;
       }
}