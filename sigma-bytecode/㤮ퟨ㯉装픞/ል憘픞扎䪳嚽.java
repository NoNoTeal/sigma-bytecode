public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u120d\u6198\ud51e\u624e\u4ab3\u56bd {
    public void \u120d\u6198\ud51e\u624e\u4ab3\u56bd() {
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
            invokespecial:Object(Object::<init>, this:\u120d\u6198\ud51e\u624e\u4ab3\u56bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ube23\u0800\u52d3\u69d9\u92ee\u8709 \u3776\u6198\u4179\ub70c\u4d85\uf995(int p0, java.lang.Integer[] p1) {
        var_4_7D : \u97e6\u88c5\u40a9\u61a4\u9937\u6435
        
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
        
        if (cmplt:boolean(p0:int, invokeinterface:int(List<E>::size, getstatic:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u52d3\uc2bd\u8bb0\u836c\uf9c5\ud51e)))) {
            var_4_7D = checkcast:\u97e6\u88c5\u40a9\u61a4\u9937\u6435(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97e6\u88c5\u40a9\u61a4\u9937\u6435.class, invokeinterface:\u97e6\u88c5\u40a9\u61a4\u9937\u6435(List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>::get, getstatic:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u52d3\uc2bd\u8bb0\u836c\uf9c5\ud51e), p0:int))
            return:\ube23\u0800\u52d3\u69d9\u92ee\u8709(invokevirtual:\ube23\u0800\u52d3\u69d9\u92ee\u8709(\u97e6\u88c5\u40a9\u61a4\u9937\u6435::\u4f4a\uf9c5\ubff1\u946b\u6fb0\u7873, var_4_7D:\u97e6\u88c5\u40a9\u61a4\u9937\u6435, initobject:\ube23\u0800\u52d3\u69d9\u92ee\u8709(\ube23\u0800\u52d3\u69d9\u92ee\u8709::<init>, invokevirtual:int(\u97e6\u88c5\u40a9\u61a4\u9937\u6435::\u071d\u9255\u6d99\u3711\ubff1\u8d90, var_4_7D:\u97e6\u88c5\u40a9\u61a4\u9937\u6435)), p1:Integer[]))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u6b5f\u4c04\u51fa\ub113\u3e2a\u8df4), and:int(ldc:int(19554), ldc:int(-28027)))), p0:int), loadelement:String(getstatic:String[](\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u6b5f\u4c04\u51fa\ub113\u3e2a\u8df4), xor:int(ldc:int(-26592), ldc:int(-26591)))), invokestatic:String(Arrays::toString, p1:Integer[][expected:Object[]]))))
        return:\ube23\u0800\u52d3\u69d9\u92ee\u8709(aconstnull:\ube23\u0800\u52d3\u69d9\u92ee\u8709())
    }
    
    private static void \u8389\uc84e\u0b8e\u8709\u9033\uc7fe(int p0) {
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
            invokeinterface:boolean(List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>::add, getstatic:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u52d3\uc2bd\u8bb0\u836c\uf9c5\ud51e), initobject:\u97e6\u88c5\u40a9\u61a4\u9937\u6435(\u97e6\u88c5\u40a9\u61a4\u9937\u6435::<init>, p0:int, aconstnull:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8389\uc84e\u0b8e\u8709\u9033\uc7fe(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1 p1) {
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
            invokeinterface:boolean(List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>::add, getstatic:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u52d3\uc2bd\u8bb0\u836c\uf9c5\ud51e), initobject:\u97e6\u88c5\u40a9\u61a4\u9937\u6435(\u97e6\u88c5\u40a9\u61a4\u9937\u6435::<init>, p0:int, p1:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1 \u1833\ua6bd\u5bc4\ua562\ucb79\u3504() {
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
            return:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(initobject:\uafe7\ub83f\u8c8a\u5140\u7af6\uc29a[expected:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1](\uafe7\ub83f\u8c8a\u5140\u7af6\uc29a::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \ud4fe\u3504\u61a4\u0b8e\u839e\ub1b9() {
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
            return:boolean(invokevirtual:boolean(ThreadLocalRandom::nextBoolean, invokestatic:ThreadLocalRandom(ThreadLocalRandom::current)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1 \ud36e\ub19c\u97b7\u3776\ud4fe\u647c() {
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
            return:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(initobject:\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8[expected:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1](\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1 \u51fa\ud158\u8258\u7049\u9255\u600f() {
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
            return:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(initobject:\uc910\u99f7\ud4fe\u6bb9\u6b5f\uc7fe[expected:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1](\uc910\u99f7\ud4fe\u6bb9\u6b5f\uc7fe::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u6c52\u47c2\uc4d2\u9937\uc9f6\uc9f6() {
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
            return:boolean(invokestatic:boolean(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\ud4fe\u3504\u61a4\u0b8e\u839e\ub1b9))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_30F : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_FF_0 : byte[] [generated]
        stack_101_0 : byte[] [generated]
        stack_13B_0 : byte[] [generated]
        stack_13D_0 : byte[] [generated]
        stack_16C_0 : byte[] [generated]
        stack_330_0 : byte[] [generated]
        stack_383_0 : byte[] [generated]
        stack_419_0 : byte[] [generated]
        stack_469_0 : byte[] [generated]
        stack_4BE_0 : byte[] [generated]
        var_4_2FC : int
        var_3_301 : byte[]
        var_5_302 : int
        var_0_39B : int
        expr_383 : byte [generated]
        stack_3C7_2 : byte [generated]
        stack_39E_0 : byte [generated]
        expr_419 : byte [generated]
        expr_A5 : int [generated]
        expr_CF : int [generated]
        var_2_FF : byte[]
        expr_103 : int [generated]
        var_3_458 : byte[]
        var_5_459 : int
        expr_13D : int [generated]
        var_3_4AD : byte[]
        var_5_4AE : int
        var_3_178 : String
        stack_1C6_0 : String[] [generated]
        expr_18A : String[] [generated]
        
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
        var_0_30F = and:int(ldc:int(46148122), ldc:int(785956654))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("y4K66T/W8i6+v12GurWOmscydr8myt691uKKuubPGr7OIV7mdv4J8xKxukxtTHhtzA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2FC = expr_6B:int
        var_3_301 = newarray:byte[](byte.class, expr_6B:int)
        var_5_302 = expr_6B:int
        Label_0772:
        
        while (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(512)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(222456291))
                goto(Label_0863)
            }
            
            var_0_30F = and:int(var_0_30F:int, ldc:int(180690458))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            storeelement:byte(var_3_301:byte[], var_5_302:int, add:byte(loadelement:byte(stack_330_0:byte[], var_5_302:int), ldc:byte(50)))
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = var_3_301:byte[]
            goto(Label_0112)
        }
        
        var_0_30F = and:int(var_0_30F:int, ldc:int(220992108))
        goto(Label_1005)
        Label_0863:
        
        while (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(256)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(881268725))
                goto(Label_0772)
            }
            
            var_0_39B = and:int(var_0_30F:int, ldc:int(1541335786))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            expr_383 = stack_3C7_2 = loadelement(stack_383_0, var_5_302)
            
            if (cmplt:boolean(add:int(add:int(var_5_302:int, ldc:int(6)), neg:int(var_4_2FC:int)), ldc:int(0))) {
                stack_3C7_2 = stack_39E_0 = add:byte(expr_383:byte, loadelement:byte(var_3_301:byte[], add:int(var_5_302:int, ldc:int(6))))
                goto(Label_0942)
            }
            
            Label_0912:
            
            if (cmpeq:boolean(and:int(var_0_39B:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_39B = and:int(var_0_39B:int, ldc:int(-1024328849))
                stack_3C7_2 = stack_39E_0 = add:byte(expr_383:byte, ldc:byte(6))
            }
            
            Label_0942:
            
            if (cmpne:boolean(and:int(var_0_39B:int, ldc:int(64)), ldc:int(0))) {
                var_0_39B = and:int(var_0_39B:int, ldc:int(1239593876))
                goto(Label_0912)
            }
            
            var_0_30F = and:int(var_0_39B:int, ldc:int(-84505638))
            storeelement:byte(var_3_301:byte[], var_5_302:int, stack_3C7_2:byte)
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = var_3_301:byte[]
            goto(Label_0170)
        }
        
        Label_1005:
        
        while (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(-1077186945))
                goto(Label_0772)
            }
            
            var_0_30F = and:int(var_0_30F:int, ldc:int(989538958))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            expr_419 = loadelement:byte(stack_419_0:byte[], var_5_302:int)
            storeelement:byte(var_3_301:byte[], var_5_302:int, or:int(and:int(shl:int(expr_419:byte, and:int(ldc:int(54), ldc:int(7173))), ldc:int(-16)), and:int(shr:int(expr_419:byte[expected:int], and:int(ldc:int(1382), ldc:int(24716))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = var_3_301:byte[]
            goto(Label_0212)
        }
        
        var_0_30F = and:int(var_0_30F:int, ldc:int(113856079))
        goto(Label_0863)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0322)
        }
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_30F = and:int(var_0_30F:int, ldc:int(436218132))
            goto(Label_0264)
        }
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_30F = and:int(var_0_30F:int, ldc:int(-180593654))
        }
        else {
            var_0_30F = and:int(var_0_30F:int, ldc:int(-1896305937))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_2FC = expr_A5:int
                var_3_301 = newarray:byte[](byte.class, expr_A5:int)
                var_5_302 = expr_A5:int
                goto(Label_0863)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0322)
        }
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0264)
        }
        
        if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_30F = and:int(var_0_30F:int, ldc:int(1324105439))
            expr_CF = arraylength:int(stack_CF_0:byte[])
            
            if (cmpne:boolean(expr_CF:int, ldc:int(0))) {
                var_4_2FC = expr_CF:int
                var_3_301 = newarray:byte[](byte.class, expr_CF:int)
                var_5_302 = expr_CF:int
                goto(Label_1005)
            }
        }
        
        Label_0212:
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0322)
        }
        
        if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(-2054967245))
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_30F = and:int(var_0_30F:int, ldc:int(-1092720002))
            var_2_FF = stack_FF_0:byte[]
            expr_103 = add:int(arraylength:int(stack_101_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_103:int, ldc:int(0))) {
                var_3_458 = newarray:byte[](byte.class, expr_103:int)
                var_5_459 = expr_103:int
                
                loop {
                    var_0_30F = and:int(var_0_30F:int, ldc:int(1324060635))
                    var_5_459 = add:int(var_5_459:int, ldc:int(-1))
                    storeelement:byte(var_3_458:byte[], var_5_459:int, add:int(shl:int(loadelement:byte(stack_469_0:byte[], var_5_459:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_FF:byte[], add:int(var_5_459:int, xor:int(ldc:int(2050), ldc:int(2051)))), ldc:int(6)), xor:int(ldc:int(32), ldc:int(35)))))
                    
                    if (cmpne:boolean(var_5_459:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = var_3_458:byte[]
            }
        }
        
        Label_0264:
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(-1765963602))
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(1608889701))
                goto(Label_0112)
            }
            
            var_0_30F = and:int(var_0_30F:int, ldc:int(-1344364866))
            expr_13D = arraylength:int(stack_13D_0:byte[])
            
            if (cmpne:boolean(expr_13D:int, ldc:int(0))) {
                var_3_4AD = newarray:byte[](byte.class, expr_13D:int)
                var_5_4AE = expr_13D:int
                
                loop {
                    var_0_30F = and:int(var_0_30F:int, ldc:int(-2014966822))
                    var_5_4AE = add:int(var_5_4AE:int, ldc:int(-1))
                    storeelement:byte(var_3_4AD:byte[], var_5_4AE:int, xor:byte(loadelement:byte(stack_4BE_0:byte[], var_5_4AE:int), ldc:byte(73)))
                    
                    if (cmpne:boolean(var_5_4AE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_CD_0 = stack_CF_0 = stack_FF_0 = stack_101_0 = stack_13B_0 = stack_13D_0 = stack_16C_0 = stack_330_0 = stack_383_0 = stack_419_0 = stack_469_0 = stack_4BE_0 = var_3_4AD:byte[]
            }
        }
        
        Label_0322:
        
        if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0264)
        }
        
        if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_30F = and:int(var_0_30F:int, ldc:int(1129481687))
            goto(Label_0170)
        }
        
        if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_178 = initobject:String(String::<init>, stack_16C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C6_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8459), ldc:int(8457)))
            expr_18A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8578), ldc:int(6722)))
            storeelement:String(expr_18A:String[], and:int(ldc:int(401), ldc:int(7169)), invokevirtual:String[expected:String](String::substring, var_3_178:String, and:int(ldc:int(27404), ldc:int(-28445)), xor:int(ldc:int(16384), ldc:int(16394))))
            storeelement:String(expr_18A:String[], and:int(ldc:int(-31578), ldc:int(31249)), invokevirtual:String[expected:String](String::substring, var_3_178:String, xor:int(ldc:int(-32756), ldc:int(-32762)), xor:int(ldc:int(125), ldc:int(77))))
            putstatic:String[](\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u6b5f\u4c04\u51fa\ub113\u3e2a\u8df4, expr_18A:String[])
            putstatic:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u52d3\uc2bd\u8bb0\u836c\uf9c5\ud51e, initobject:ArrayList<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>[expected:List<\u97e6\u88c5\u40a9\u61a4\u9937\u6435>](ArrayList<E>::<init>))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(34))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(19))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(18))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(21))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, xor:int(ldc:int(3145), ldc:int(3149)))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(43))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(22))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(42))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(42))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(6))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(14))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(37))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(30))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(12))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(26))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(17))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, and:int(ldc:int(18000), ldc:int(-18001)))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(44))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(10))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(9))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, and:int(ldc:int(16451), ldc:int(7953)))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(24))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(32))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(33))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(35))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(15))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(23))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(31))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(-1))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, xor:int(ldc:int(9539), ldc:int(9542)))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(11), invokestatic:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u1833\ua6bd\u5bc4\ua562\ucb79\u3504))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(29))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(34))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(28))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(25))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, xor:int(ldc:int(769), ldc:int(771)))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(27), invokestatic:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\ud36e\ub19c\u97b7\u3776\ud4fe\u647c))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, and:int(ldc:int(3), ldc:int(351)), invokestatic:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u51fa\ud158\u8258\u7049\u9255\u600f))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, xor:int(ldc:int(-22399), ldc:int(-22398)), invokestatic:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u51fa\ud158\u8258\u7049\u9255\u600f))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(36))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(-1))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(13))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(8))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(16))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(7))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(40))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(20), invokestatic:\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u51fa\ud158\u8258\u7049\u9255\u600f))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(41))
            invokestatic:void(\u120d\u6198\ud51e\u624e\u4ab3\u56bd::\u8389\uc84e\u0b8e\u8709\u9033\uc7fe, ldc:int(38))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ubff1\uc229\u8308\u72f1\ud12e\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(652829973), ldc:int(-1255018021))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\u6198\ud51e\u624e\u4ab3\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(643660587))
            var_5_81 = and:int(ldc:int(22730), ldc:int(-22991))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8502), ldc:int(8501)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67B:int, ldc:int(-1483179628))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(19), ldc:int(30753)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2183), ldc:int(12313)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DA:int, ldc:int(-60332101))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(8705), ldc:int(17569)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1027140276))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1329315605))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-127546680))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(206931385))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-986614147))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-40460098))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(24425640))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1028907388))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1089238036))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(7173064))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-91366376))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(904461640))
                            var_11_EB = and:int(ldc:int(3273), ldc:int(-19658))
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(895645015))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1752457654))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-946280931))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1370637358))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-133960524))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-150113879))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1030397536))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1147342750))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1061184811))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0835:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1796204327))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1395994758))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1522054344))
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1094630641))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1399897794))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1482222239))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1118699595))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(10373), ldc:int(4929))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-981489949))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1464794818))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(821571340))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1062532402))
                        var_11_EB = and:int(ldc:int(21171), ldc:int(-21432))
                    }
                    
                    Label_1126:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(255337885))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(21464668))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1271666240))
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-11042994))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(109039911))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1107659815))
                            goto(Label_1126)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1812760699))
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1412724677))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(729139629))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1705606636))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1382:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(852335651))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(121469617))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1592412133))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1928604808))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-733037714))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1065779244))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-284006966))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1141224848))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(74538334))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-961043407))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(968248112))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1968074745))
                        var_17_686 = add:int(var_16_119:int, and:int(ldc:int(8215), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(1716055815))
                
                if (cmple:boolean(var_5_81 = var_17_686:int, sub:int(var_6_88:int, xor:int(ldc:int(12417), ldc:int(12416))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1289846380))
            goto(Label_0108)
        }
    }
}
