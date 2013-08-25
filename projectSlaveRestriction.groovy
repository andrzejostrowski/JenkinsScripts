// Copyright (c) 2013 Andrzej Ostrowski
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
// to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
// and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

import hudson.model.*
import hudson.tasks.*

for (item in Hudson.instance.items.findAll{ it instanceof Project})
{
  println("${item.name} build is ${item.getAssignedLabel() != null ? 'restricted to: ' + item.getAssignedLabel() : 'unrestricted' }.");
}


// Result:
// PRO-master build is unrestricted.
// PRO-127 build is restricted to: WindowsNodes.
// PRO-2 build is restricted to: WindowsNodes.
// PRO-223 build is unrestricted.
// PRO-234 build is restricted to: !master.
// SMT-master build is restricted to: !master.
// SMT-45 build is restricted to: LinuxNodes, master.
// SMT-61 build is unrestricted.
// SMT-72 build is restricted to: LinuxNodes.