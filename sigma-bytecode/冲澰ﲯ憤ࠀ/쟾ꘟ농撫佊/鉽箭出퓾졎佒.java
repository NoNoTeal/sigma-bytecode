public interface \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u927d\u7bad\u51fa\ud4fe\uc84e\u4f52 {
    boolean \u6fb0\ubf56\u9255\u759a\u120d\u7d52(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p3) {
        var_5_61 : int
        stack_A5_0 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(-1556921901), ldc:int(1469252497))
            
            if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23))))), cmpeq:boolean(p3:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8)))) {
                stack_A5_0 = and:int(ldc:int(16681), ldc:int(5701))
            }
            else {
                var_5_61 = and:int(var_5_61:int, ldc:int(981204445))
                stack_A5_0 = and:int(ldc:int(1201), ldc:int(-1202))
            }
            
            return:boolean(stack_A5_0:int)
        }
        
        goto(Label_0006)
    }
    
    boolean \uc2bd\u6c56\u446c\u5fe1\u56bd\u6cfe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p3) {
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
        
        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23))))), cmpeq:boolean(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, p3:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8)))) {
            if (logicalnot:boolean(invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a]))) {
                invokeinterface:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23), invokestatic:Boolean(Boolean::valueOf, xor:int[expected:boolean](ldc:int(4224), ldc:int(4225))))), xor:int(ldc:int(2), ldc:int(1)))
                invokeinterface:void(\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>::\u71ae\u4bc8\u74b1\u97b7\u67e9\ud217, invokeinterface:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, p3:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), invokevirtual:int(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, p3:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a]))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(8549), ldc:int(1033)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(11164), ldc:int(-11166)))
    }
    
    \u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f \uc910\uf9c5\ubcb0\u4492\u12b2\u4bc8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23)))))) {
            return:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f))
        }
        
        invokeinterface:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-1195), ldc:int(1194))))), xor:int(ldc:int(2692), ldc:int(2695)))
        return:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8))
    }
}
