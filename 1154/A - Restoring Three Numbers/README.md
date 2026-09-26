<h2><a href="https://codeforces.com/contest/1154/problem/A" target="_blank" rel="noopener noreferrer">1154A — Restoring Three Numbers</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1154A](https://codeforces.com/contest/1154/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Restoring Three Numbers</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Polycarp has guessed three positive integers $$$a$$$, $$$b$$$ and $$$c$$$. He keeps these numbers in secret, but he writes down four numbers on a board in arbitrary order — their pairwise sums (three numbers) and sum of all three numbers (one number). So, there are four numbers on a board in random order: $$$a+b$$$, $$$a+c$$$, $$$b+c$$$ and $$$a+b+c$$$.</p><p>You have to guess three numbers $$$a$$$, $$$b$$$ and $$$c$$$ using given numbers. Print three guessed integers in any order.</p><p>Pay attention that some given numbers $$$a$$$, $$$b$$$ and $$$c$$$ can be equal (it is also possible that $$$a=b=c$$$).</p></div><div class="input-specification"><div class="section-title">Input</div><p>The only line of the input contains four positive integers $$$x_1, x_2, x_3, x_4$$$ ($$$2 \le x_i \le 10^9$$$) — numbers written on a board in random order. It is guaranteed that the answer exists for the given number $$$x_1, x_2, x_3, x_4$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Print such positive integers $$$a$$$, $$$b$$$ and $$$c$$$ that four numbers written on a board are values $$$a+b$$$, $$$a+c$$$, $$$b+c$$$ and $$$a+b+c$$$ written in some order. Print $$$a$$$, $$$b$$$ and $$$c$$$ in any order. If there are several answers, you can print any. It is guaranteed that the answer exists.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0039941320274408854" id="id0012569884536065612" class="input-output-copier">Copy</div></div><pre id="id0039941320274408854">3 6 5 4
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0018795886938010598" id="id008473496254081454" class="input-output-copier">Copy</div></div><pre id="id0018795886938010598">2 1 3
</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id009309143158539076" id="id0022876848938801309" class="input-output-copier">Copy</div></div><pre id="id009309143158539076">40 40 40 60
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id008252674952429072" id="id008224139440830194" class="input-output-copier">Copy</div></div><pre id="id008252674952429072">20 20 20
</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00511468569052204" id="id005067185997439484" class="input-output-copier">Copy</div></div><pre id="id00511468569052204">201 101 101 200
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id007003075632704924" id="id006285156473299189" class="input-output-copier">Copy</div></div><pre id="id007003075632704924">1 100 100
</pre></div></div></div>