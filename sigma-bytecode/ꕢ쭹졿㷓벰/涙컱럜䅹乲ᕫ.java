public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6d99\ucef1\ub7dc\u4179\u4e72\u156b {
    public void \u6d99\ucef1\ub7dc\u4179\u4e72\u156b() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u6d99\ucef1\ub7dc\u4179\u4e72\u156b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Iterator<java.lang.Object> \u51b2\u8d90\ub70c\ud36e\u8d90\u4492(java.util.List p0) {
        var_1_64 : int
        var_3_69 : Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>
        var_4_7B : \u7d52\uc229\ub113\u385b\u760c\ubded<Object>
        stack_E8_0 : \u7d52\uc229\ub113\u385b\u760c\ubded<Object> [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_64 = and:int(and:int(ldc:int(1421541402), ldc:int(1905237547)), ldc:int(-167837672))
        monitorenter(var_3_69 = getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8))
        
        try {
            var_1_64 = and:int(var_1_64:int, ldc:int(2147205144))
            var_4_7B = checkcast:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\uc229\ub113\u385b\u760c\ubded<java.lang.Object>.class, invokeinterface:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>(Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>::pollFirst, getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8)))
            
            loop {
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-326563630))
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-981198507))
                }
                else {
                    var_1_64 = and:int(var_1_64:int, ldc:int(1980729784))
                    
                    if (cmpne:boolean(var_4_7B:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>, aconstnull:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-364583588))
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-630212744))
                }
                
                Label_0192:
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(1384065948))
                    var_4_7B = initobject:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d[expected:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>](\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::<init>)
                    looporswitchbreak()
                }
            }
            
            invokeinterface:void(\u7d52\uc229\ub113\u385b\u760c\ubded<Object>::\u516c\ub113\u0b8e\u74b1\u7330\u92ee, var_4_7B:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>, p0:List<Object>)
            stack_E8_0 = var_4_7B:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>
            monitorexit(var_3_69:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>)
            return:Iterator<Object>(stack_E8_0:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>)
        }
        finally {
            monitorexit(var_3_69:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>)
        }
    }
    
    private static void \u47c2\u47c2\u3e75\ub19c\u071d\u8640(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\uc229\ub113\u385b\u760c\ubded<java.lang.Object> p0) {
        var_1_249 : int
        var_3_69 : Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_249 = and:int(and:int(ldc:int(2035411371), ldc:int(2044636647)), ldc:int(-621627258))
            monitorenter(var_3_69 = getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-1551605704))
                        goto(Label_0506)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-676250941))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(16)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1709695745))
                        goto(Label_0343)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-1621081586))
                        goto(Label_0269)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(201044629))
                        
                        if (cmpgt:boolean(invokeinterface:int(Deque<E>::size, getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8)), xor:int(ldc:int(20673), ldc:int(21289)))) {
                            goto(Label_0432)
                        }
                    }
                    
                    Label_0197:
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-36545015))
                        goto(Label_0506)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(4)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(2140213531))
                        goto(Label_0343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-1755499170))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(794855352))
                            loopcontinue()
                        }
                        
                        var_1_249 = and:int(var_1_249:int, ldc:int(-623533068))
                    }
                    
                    Label_0269:
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(754536418))
                        goto(Label_0506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-708054318))
                            goto(Label_0197)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(512)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(1567519523))
                            loopcontinue()
                        }
                        
                        var_1_249 = and:int(var_1_249:int, ldc:int(794540010))
                        invokeinterface:void(\u7d52\uc229\ub113\u385b\u760c\ubded<Object>::\u516c\ub113\u0b8e\u74b1\u7330\u92ee, p0:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>, checkcast:List<Object>(java.util.List<java.lang.Object>.class, aconstnull:List<Object>()))
                    }
                    
                    Label_0343:
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(16)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(722172371))
                        goto(Label_0506)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(512)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1528892474))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-1813245338))
                            goto(Label_0269)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-316674963))
                            goto(Label_0197)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(4096)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-1682024010))
                            loopcontinue()
                        }
                        
                        var_1_249 = and:int(var_1_249:int, ldc:int(-27408479))
                        invokeinterface:void(Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>::addLast, getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8), p0:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>)
                    }
                    
                    Label_0432:
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1708123593))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0343)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(1360449918))
                            goto(Label_0269)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(16)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-1037818297))
                            goto(Label_0197)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_249:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_249 = and:int(var_1_249:int, ldc:int(-2141996745))
                            loopcontinue()
                        }
                        
                        var_1_249 = and:int(var_1_249:int, ldc:int(-1336895605))
                        monitorexit(var_3_69:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>)
                    }
                    
                    Label_0506:
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(-1230329187))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1095796047))
                        goto(Label_0343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1331268326))
                        goto(Label_0269)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_249:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_249 = and:int(var_1_249:int, ldc:int(1354831649))
                        goto(Label_0197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_249:int, ldc:int(4096)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_249 = and:int(var_1_249:int, ldc:int(-1404283609))
                }
                
                var_1_249 = and:int(var_1_249:int, ldc:int(981201553))
            }
            finally {
                monitorexit(var_3_69:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u71f1\uae87\u983f\u3bd6\u6cfe\u3c25(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\uc229\ub113\u385b\u760c\ubded p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u47c2\u47c2\u3e75\ub19c\u071d\u8640, p0:\u7d52\uc229\ub113\u385b\u760c\ubded<Object>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        var_2_71 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_5F = and:int(ldc:int(-1015389725), ldc:int(-405039215))
            putstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8, initobject:ArrayDeque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>[expected:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>](ArrayDeque<E>::<init>))
            var_2_71 = and:int(ldc:int(-27460), ldc:int(17219))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1872322483))
                
                if (cmpge:boolean(var_2_71:int, xor:int(ldc:int(840), ldc:int(160)))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(Deque<\uc7fe\u76bc\ub6ab\u960f\u4492\u071d>::add, getstatic:Deque<\u7d52\uc229\ub113\u385b\u760c\ubded<Object>>(\u6d99\ucef1\ub7dc\u4179\u4e72\u156b::\u93a2\u4daf\ua3b4\u12cb\u16f6\uceb8), initobject:\uc7fe\u76bc\ub6ab\u960f\u4492\u071d(\uc7fe\u76bc\ub6ab\u960f\u4492\u071d::<init>))
                inc:int(var_2_71, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\ubb2b\u36d3\u4492\u183a\uc29a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_660 = and:int(ldc:int(1682107900), ldc:int(-1386700821))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\ucef1\ub7dc\u4179\u4e72\u156b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(313791962))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-1481199619))
            var_5_85 = and:int(ldc:int(-19091), ldc:int(19090))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18917), ldc:int(-27112)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(357285738))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(20737), ldc:int(10265)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4236), ldc:int(4237)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(2113379822))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(20865), ldc:int(7)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-333224707))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(951389864))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-753981164))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1192757386))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1755666736))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(525591433))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1162644843))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-747552031))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2017558859))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1538346173))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1578586026))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(199400493))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-999740711))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1235079506))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-137715716))
                            var_11_EB = and:int(ldc:int(24978), ldc:int(-30099))
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0589:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(745247673))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1908250383))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1031065066))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1226934140))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1273949591))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-598506274))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(388752313))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-873803260))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-922916246))
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-437243267))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(778175289))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-977367047))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1327041406))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1153696383))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(297427693))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1101437043))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1813564905))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(4387), ldc:int(26757))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1999054844))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1136074254))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1568339351))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1112022887))
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(109817711))
                        var_11_EB = and:int(ldc:int(-9476), ldc:int(9475))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(554750253))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(38106530))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1088026651))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(760248556))
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1328849864))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2019323927))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1481540740))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-678168510))
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1797269377))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-902507693))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1660780025))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-191701654))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1936294462))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-684590172))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-975115207))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1548133916))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(1425600510))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(242517929))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2028995814))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1273969989))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-715842691))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-82237399))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1172783868))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-143671444))
                        var_17_66B = add:int(var_16_119:int, xor:int(ldc:int(-32712), ldc:int(-32711)))
                        looporswitchbreak()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-2008001156))
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-1223713426))
                
                if (cmple:boolean(var_5_85 = var_17_66B:int, sub:int(var_6_8C:int, and:int(ldc:int(16401), ldc:int(2057))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(2035696143))
            goto(Label_0106)
        }
    }
}
