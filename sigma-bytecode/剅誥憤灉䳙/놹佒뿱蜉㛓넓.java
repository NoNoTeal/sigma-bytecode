public class \u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 {
    public void \ub1b9\u4f52\ubff1\u8709\u36d3\ub113(java.io.File p0, com.mojang.datafixers.DataFixer p1) {
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
            invokespecial:Object(Object::<init>, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113)
            putfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, invokestatic:HashMap[expected:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>](Maps::newHashMap))
            putfield:DataFixer(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ub7dc\uceb8\u99f7\u12b2\ub19c\u8cae, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p1:DataFixer)
            putfield:File(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u120d\u9255\u0b8e\u071d\u0800\u965f, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p0:File)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.io.File \u93a2\u12cb\u59ec\u7ce1\u7049\u1187(java.lang.String p0) {
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
            return:File(initobject:File(File::<init>, getfield:File(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u120d\u9255\u0b8e\u071d\u0800\u965f, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f), and:int(ldc:int(3937), ldc:int(-4070)))))))
        }
        
        goto(Label_0006)
    }
    
    public T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217 \ube23\ud523\u1833\u9af2\ud12e\ua3b4(java.util.function.Supplier<T> p0, java.lang.String p1) {
        var_5_66 : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
        var_6_7B : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
        
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
        var_5_66 = invokevirtual:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u527a\u839e\uc246\u624e\u759a\ua562, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p0:Supplier<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>, p1:String)
        
        if (cmpeq:boolean(var_5_66:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217, aconstnull:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217())) {
            var_6_7B = checkcast:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217](T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217.class, invokeinterface:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Supplier<T>::get, p0:Supplier<T>))
            invokevirtual:void(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u62da\uc910\u8d90\u760c\u40a9\u67d0, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, var_6_7B:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
            return:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(var_6_7B:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
        }
        
        return:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(var_5_66:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
    }
    
    public T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217 \u527a\u839e\uc246\u624e\u759a\ua562(java.util.function.Supplier<T> p0, java.lang.String p1) {
        var_5_6D : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
        
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
            var_5_6D = checkcast:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217.class, invokeinterface:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::get, getfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), p1:String[expected:Object]))
            
            if (cmpeq:boolean(var_5_6D:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217, aconstnull:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217())) {
                if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), p1:String[expected:Object]))) {
                    var_5_6D = invokespecial:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u0c95\ucb79\ud217\u7330\u4492\ubded, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p0:Supplier<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>, p1:String)
                    invokeinterface:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::put, getfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), p1:String, var_5_6D:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
                }
            }
            
            return:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(var_5_6D:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
        }
        
        goto(Label_0006)
    }
    
    private T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217 \u0c95\ucb79\ud217\u7330\u4492\ubded(java.util.function.Supplier<T> p0, java.lang.String p1) {
        var_3_5F : int
        var_5_6A : File
        var_6_CE : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
        var_7_E2 : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_118_0 : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217 [generated]
        var_5_124 : Exception
        
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
            var_3_5F = and:int(ldc:int(1552963735), ldc:int(-575248233))
            
            try {
                var_3_5F = and:int(var_3_5F:int, ldc:int(266182583))
                var_5_6A = invokespecial:File(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u93a2\u12cb\u59ec\u7ce1\u7049\u1187, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p1:String)
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1781996314))
                        goto(Label_0170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(498473626))
                    }
                    else {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1553443787))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_5_6A:File))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0151:
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(2122680571))
                    }
                    
                    Label_0170:
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(210754751))
                        var_6_CE = checkcast:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217](T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217.class, invokeinterface:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Supplier<T>::get, p0:Supplier<T>))
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1588292523))
                        var_7_E2 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u446c\ubefe\u61a4\u59ec\u385b\u67e9, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p1:String, invokeinterface:int(GameVersion::getWorldVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
                        
                        do {
                            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                                var_3_5F = and:int(var_3_5F:int, ldc:int(-281892685))
                                invokevirtual:void(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\u6b0d\u9af2\uf995\u385b\u9a18\u156b, var_6_CE:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_7_E2:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f), xor:int(ldc:int(-15328), ldc:int(-15327)))))
                            }
                        } while (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0)))
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1933574749))
                        stack_118_0 = var_6_CE:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1871469703))
                        return:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(stack_118_0:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1487999898))
                }
            }
            catch (java.lang.Exception var_5_124) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ub171\ub19c\uf9c5\ua3b4\u9af2\ub6ab), loadelement:String(getstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f), xor:int(ldc:int(8714), ldc:int(8712))), p1:String[expected:Object], var_5_124:Exception[expected:Object])
            }
            
            return:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(checkcast:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217.class, aconstnull:T extends \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217()))
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\uc910\u8d90\u760c\u40a9\u67d0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217 p0) {
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
            invokeinterface:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::put, getfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), invokevirtual:String(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\uceb8\u8413\uae87\u4daf\u47c2\u6ec6, p0:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217), p0:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u446c\ubefe\u61a4\u59ec\u385b\u67e9(java.lang.String p0, int p1) {
        var_6_7A : FileInputStream
        var_7_82 : Throwable
        var_8_94 : PushbackInputStream
        var_9_97 : Throwable
        var_10_A7 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_11_B9 : DataInputStream
        var_12_BC : Throwable
        var_13_F7 : Throwable
        var_15_11C : Throwable
        var_16_17C : \uc31c\uc87f\uc246\u3776\ub7dc
        var_10_1B0 : Throwable
        var_18_1D5 : Throwable
        var_8_223 : Throwable
        var_20_248 : Throwable
        
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
            var_6_7A = initobject:FileInputStream(FileInputStream::<init>, invokespecial:File(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u93a2\u12cb\u59ec\u7ce1\u7049\u1187, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, p0:String))
            var_7_82 = aconstnull:Throwable()
            
            try {
                var_8_94 = initobject:PushbackInputStream(PushbackInputStream::<init>, var_6_7A:FileInputStream[expected:InputStream], xor:int(ldc:int(16), ldc:int(18)))
                var_9_97 = aconstnull:Throwable()
                
                try {
                    if (invokespecial:boolean(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ud36e\uc4d2\u416d\u5fe1\u4e72\u51fa, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, var_8_94:PushbackInputStream)) {
                        var_10_A7 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\u4bc8\u156b\u4d85\u5f50\u51fa\u4bc8, var_8_94:PushbackInputStream[expected:InputStream])
                    }
                    else {
                        var_11_B9 = initobject:DataInputStream(DataInputStream::<init>, var_8_94:PushbackInputStream[expected:InputStream])
                        var_12_BC = aconstnull:Throwable()
                        
                        try {
                            var_10_A7 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, var_11_B9:DataInputStream[expected:DataInput])
                        }
                        catch (java.lang.Throwable var_13_F7) {
                            var_12_BC = var_13_F7:Throwable
                            athrow(var_13_F7:Throwable)
                        }
                        finally {
                            if (cmpne:boolean(var_11_B9:DataInputStream, aconstnull:DataInputStream())) {
                                if (cmpne:boolean(var_12_BC:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(FilterInputStream::close, var_11_B9:DataInputStream[expected:FilterInputStream])
                                    }
                                    catch (java.lang.Throwable var_15_11C) {
                                        invokevirtual:void(Throwable::addSuppressed, var_12_BC:Throwable, var_15_11C:Throwable)
                                    }
                                }
                                else {
                                    invokevirtual:void(FilterInputStream::close, var_11_B9:DataInputStream[expected:FilterInputStream])
                                }
                            }
                        }
                    }
                    
                    var_16_17C = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u946b\u92ee\u6fb0\ua6bd\ubefe::\ub19c\u7af6\uc238\u1833\u8709\u946b, getfield:DataFixer(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ub7dc\uceb8\u99f7\u12b2\ub19c\u8cae, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113), getstatic:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\u8308\u873d\ub102\u7e3f\u718f\u8bb0), var_10_A7:\uc31c\uc87f\uc246\u3776\ub7dc, ternaryop:int(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_10_A7:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f), and:int(ldc:int(10243), ldc:int(5723))), ldc:int(99)), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_10_A7:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f), xor:int(ldc:int(-26623), ldc:int(-26622)))), xor:int(ldc:int(-13530), ldc:int(-12775))), p1:int)
                }
                catch (java.lang.Throwable var_10_1B0) {
                    var_9_97 = var_10_1B0:Throwable
                    athrow(var_10_1B0:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_8_94:PushbackInputStream, aconstnull:PushbackInputStream())) {
                        if (cmpne:boolean(var_9_97:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(PushbackInputStream::close, var_8_94:PushbackInputStream)
                            }
                            catch (java.lang.Throwable var_18_1D5) {
                                invokevirtual:void(Throwable::addSuppressed, var_9_97:Throwable, var_18_1D5:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(PushbackInputStream::close, var_8_94:PushbackInputStream)
                        }
                    }
                }
            }
            catch (java.lang.Throwable var_8_223) {
                var_7_82 = var_8_223:Throwable
                athrow(var_8_223:Throwable)
            }
            finally {
                if (cmpne:boolean(var_6_7A:FileInputStream, aconstnull:FileInputStream())) {
                    if (cmpne:boolean(var_7_82:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(FileInputStream::close, var_6_7A:FileInputStream)
                        }
                        catch (java.lang.Throwable var_20_248) {
                            invokevirtual:void(Throwable::addSuppressed, var_7_82:Throwable, var_20_248:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(FileInputStream::close, var_6_7A:FileInputStream)
                    }
                }
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_16_17C:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    private boolean \ud36e\uc4d2\u416d\u5fe1\u4e72\u51fa(java.io.PushbackInputStream p0) {
        var_4_6B : byte[]
        var_5_74 : int
        var_6_8A : int
        
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
            var_4_6B = newarray:byte[](byte.class, and:int(ldc:int(1154), ldc:int(514)))
            var_5_74 = and:int(ldc:int(22118), ldc:int(-22119))
            var_6_8A = invokevirtual:int(PushbackInputStream::read, p0:PushbackInputStream, var_4_6B:byte[], and:int(ldc:int(-31493), ldc:int(23044)), and:int(ldc:int(66), ldc:int(14259)))
            
            if (cmpeq:boolean(var_6_8A:int, and:int(ldc:int(2074), ldc:int(67)))) {
                if (cmpeq:boolean(or:int(shl:int(and:int(loadelement:byte(var_4_6B:byte[], and:int(ldc:int(1), ldc:int(30883))), and:int(ldc:int(8959), ldc:int(23807))), ldc:int(8)), and:int(loadelement:byte(var_4_6B:byte[], and:int(ldc:int(16407), ldc:int(-16664))), and:int(ldc:int(2303), ldc:int(28927)))), ldc:int(35615))) {
                    var_5_74 = xor:int(ldc:int(-23544), ldc:int(-23543))
                }
            }
            
            if (cmpne:boolean(var_6_8A:int, ldc:int(0))) {
                invokevirtual:void(PushbackInputStream::unread, p0:PushbackInputStream, var_4_6B:byte[], and:int(ldc:int(185), ldc:int(-186)), var_6_8A:int)
            }
            
            return:boolean(var_5_74:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\uc87f\uafe7\ufe34\u6b5f\ud171() {
        var_1_61 : int
        var_3_70 : Iterator<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>
        var_4_A4 : \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217
        
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
            var_1_61 = and:int(ldc:int(-1031346751), ldc:int(-1971326521))
            var_3_70 = invokeinterface:Iterator<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(Collection<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::iterator, invokeinterface:Collection<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::values, getfield:Map<String, \uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u71f1\u759a\u61a4\u647c\u4c04\u494c, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1440516755))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_70:Iterator<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>)) {
                        var_4_A4 = checkcast:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217.class, invokeinterface:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217(Iterator<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>::next, var_3_70:Iterator<\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217>))
                        
                        if (cmpne:boolean(var_4_A4:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217, aconstnull:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217())) {
                            invokevirtual:void(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\u6d99\ub8be\ud217\ub19c\ubefe\u8389, var_4_A4:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217, invokespecial:File(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u93a2\u12cb\u59ec\u7ce1\u7049\u1187, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, invokevirtual:String(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\uceb8\u8413\uae87\u4daf\u47c2\u6ec6, var_4_A4:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217)))
                        }
                        
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1623231123))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_227 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C4_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_F3_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_122_0 : byte[] [generated]
        stack_23A_0 : byte[] [generated]
        stack_28C_0 : byte[] [generated]
        stack_308_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1C1 : byte[]
        var_4_1C2 : int
        expr_97 : int [generated]
        var_5_212 : int
        var_3_217 : byte[]
        var_4_218 : int
        var_0_2A5 : int
        expr_28C : byte [generated]
        stack_2D3_2 : byte [generated]
        stack_2A8_0 : byte [generated]
        expr_C6 : int [generated]
        expr_F5 : int [generated]
        var_3_2F6 : byte[]
        var_4_2F7 : int
        expr_308 : byte [generated]
        var_3_12E : String
        stack_1B2_0 : String[] [generated]
        expr_140 : String[] [generated]
        
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
            var_0_227 = and:int(ldc:int(1443971701), ldc:int(-671748384))
            expr_68 = var_2_6C = stack_95_0 = stack_97_0 = stack_C4_0 = stack_C6_0 = stack_F3_0 = stack_F5_0 = stack_122_0 = stack_23A_0 = stack_28C_0 = stack_308_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HclKSmMiwsPjKmLy6TOr+0pY4mLECnpiMhAj+h26snjSYi3iAej7tCwakmJR6FGA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1C1 = newarray:byte[](byte.class, expr_70:int)
                var_4_1C2 = expr_70:int
                
                loop {
                    var_0_227 = and:int(var_0_227:int, ldc:int(1446333309))
                    var_4_1C2 = add:int(var_4_1C2:int, ldc:int(-1))
                    storeelement:byte(var_3_1C1:byte[], var_4_1C2:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1C2:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1C2:int, xor:int(ldc:int(12), ldc:int(13)))), ldc:int(7)), xor:int(ldc:int(-24056), ldc:int(-24055)))))
                    
                    if (cmpne:boolean(var_4_1C2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_F3_0 = stack_F5_0 = stack_122_0 = stack_23A_0 = stack_28C_0 = stack_308_0 = var_3_1C1:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0250)
                }
                
                if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0203)
                }
                
                if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_0_227 = and:int(var_0_227:int, ldc:int(-711490617))
                expr_97 = arraylength:int(stack_97_0:byte[])
                
                if (cmpeq:boolean(expr_97:int, ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_5_212 = expr_97:int
                var_3_217 = newarray:byte[](byte.class, expr_97:int)
                var_4_218 = expr_97:int
                Label_0538:
                
                while (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_227 = and:int(var_0_227:int, ldc:int(-153266240))
                    var_4_218 = add:int(var_4_218:int, ldc:int(-1))
                    storeelement:byte(var_3_217:byte[], var_4_218:int, add:byte(xor:byte(loadelement:byte(stack_23A_0:byte[], var_4_218:int), ldc:byte(14)), ldc:byte(102)))
                    
                    if (cmpne:boolean(var_4_218:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_F3_0 = stack_F5_0 = stack_122_0 = stack_23A_0 = stack_28C_0 = stack_308_0 = var_3_217:byte[]
                    goto(Label_0156)
                }
                
                var_0_227 = and:int(var_0_227:int, ldc:int(-430711827))
                Label_0620:
                
                while (cmpne:boolean(and:int(var_0_227:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_2A5 = and:int(var_0_227:int, ldc:int(-696256823))
                    var_4_218 = add:int(var_4_218:int, ldc:int(-1))
                    expr_28C = stack_2D3_2 = loadelement(stack_28C_0, var_4_218)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_218:int, ldc:int(3)), neg:int(var_5_212:int)), ldc:int(0))) {
                        stack_2D3_2 = stack_2A8_0 = add:byte(expr_28C:byte, loadelement:byte(var_3_217:byte[], add:int(var_4_218:int, ldc:int(3))))
                        goto(Label_0696)
                    }
                    
                    Label_0665:
                    
                    if (cmpeq:boolean(and:int(var_0_2A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_2A5 = and:int(var_0_2A5:int, ldc:int(-139239564))
                        stack_2D3_2 = stack_2A8_0 = add:byte(expr_28C:byte, ldc:byte(3))
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_0_2A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_2A5 = and:int(var_0_2A5:int, ldc:int(1298186799))
                        goto(Label_0665)
                    }
                    
                    var_0_227 = and:int(var_0_2A5:int, ldc:int(1551098605))
                    storeelement:byte(var_3_217:byte[], var_4_218:int, stack_2D3_2:byte)
                    
                    if (cmpne:boolean(var_4_218:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_F3_0 = stack_F5_0 = stack_122_0 = stack_23A_0 = stack_28C_0 = stack_308_0 = var_3_217:byte[]
                    goto(Label_0203)
                }
                
                var_0_227 = and:int(var_0_227:int, ldc:int(520797247))
                goto(Label_0538)
                Label_0156:
                
                if (cmpne:boolean(and:int(var_0_227:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_227 = and:int(var_0_227:int, ldc:int(-1183788212))
                    goto(Label_0250)
                }
                
                if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_227:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_227 = and:int(var_0_227:int, ldc:int(-166621191))
                    expr_C6 = arraylength:int(stack_C6_0:byte[])
                    
                    if (cmpne:boolean(expr_C6:int, ldc:int(0))) {
                        var_5_212 = expr_C6:int
                        var_3_217 = newarray:byte[](byte.class, expr_C6:int)
                        var_4_218 = expr_C6:int
                        goto(Label_0620)
                    }
                }
                
                Label_0203:
                
                if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_227:int, ldc:int(1024)), ldc:int(0))) {
                        var_0_227 = and:int(var_0_227:int, ldc:int(970031135))
                        goto(Label_0156)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_227:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_227 = and:int(var_0_227:int, ldc:int(-188926239))
                    expr_F5 = arraylength:int(stack_F5_0:byte[])
                    
                    if (cmpne:boolean(expr_F5:int, ldc:int(0))) {
                        var_3_2F6 = newarray:byte[](byte.class, expr_F5:int)
                        var_4_2F7 = expr_F5:int
                        
                        loop {
                            var_0_227 = and:int(var_0_227:int, ldc:int(1430094557))
                            var_4_2F7 = add:int(var_4_2F7:int, ldc:int(-1))
                            expr_308 = loadelement:byte(stack_308_0:byte[], var_4_2F7:int)
                            storeelement:byte(var_3_2F6:byte[], var_4_2F7:int, or:int(and:int(shl:int(expr_308:byte, and:int(ldc:int(4484), ldc:int(10276))), ldc:int(-16)), and:int(shr:int(expr_308:byte[expected:int], and:int(ldc:int(76), ldc:int(12565))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2F7:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_F3_0 = stack_F5_0 = stack_122_0 = stack_23A_0 = stack_28C_0 = stack_308_0 = var_3_2F6:byte[]
                    }
                }
                
                Label_0250:
                
                if (cmpne:boolean(and:int(var_0_227:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0203)
                }
                
                if (cmpne:boolean(and:int(var_0_227:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_0_227:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_227 = and:int(var_0_227:int, ldc:int(-1661876831))
            }
            
            var_3_12E = initobject:String(String::<init>, stack_122_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B2_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12676), ldc:int(2565)))
            expr_140 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16389), ldc:int(132)))
            storeelement:String(expr_140:String[], and:int(ldc:int(18986), ldc:int(-20011)), invokevirtual:String[expected:String](String::substring, var_3_12E:String, and:int(ldc:int(3475), ldc:int(-15828)), and:int(ldc:int(783), ldc:int(24580))))
            storeelement:String(expr_140:String[], and:int(ldc:int(163), ldc:int(5131)), invokevirtual:String[expected:String](String::substring, var_3_12E:String, xor:int(ldc:int(-30716), ldc:int(-30720)), and:int(ldc:int(5167), ldc:int(17103))))
            storeelement:String(expr_140:String[], and:int(ldc:int(918), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_12E:String, xor:int(ldc:int(25089), ldc:int(25102)), xor:int(ldc:int(20547), ldc:int(20584))))
            storeelement:String(expr_140:String[], xor:int(ldc:int(4112), ldc:int(4113)), invokevirtual:String[expected:String](String::substring, var_3_12E:String, xor:int(ldc:int(42), ldc:int(1)), xor:int(ldc:int(4383), ldc:int(4400))))
            putstatic:String[](\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u72f1\ucef1\u5bc4\u5654\u624e\u983f, expr_140:String[])
            putstatic:Logger(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ub171\ub19c\uf9c5\ua3b4\u9af2\ub6ab, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97e6\u52d3\u8308\ud51e\u3a62\u4179(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_680 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68B : int
        
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
        var_3_680 = and:int(ldc:int(136052044), ldc:int(171431098))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
            var_3_680 = and:int(var_3_680:int, ldc:int(505274074))
            var_5_81 = and:int(ldc:int(-11096), ldc:int(2643))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1364), ldc:int(-7541)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_680:int, ldc:int(-25561748))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(16784), ldc:int(16785)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2501), ldc:int(1)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_680 = and:int(var_3_DA:int, ldc:int(-1701194707))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(33), ldc:int(16453)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1286126190))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1532818388))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1303766077))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-351457708))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1659512271))
                    }
                    else {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1532220861))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1146128727))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1291950018))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(391793158))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(363601660))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1727389257))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-102900328))
                            var_11_EB = and:int(ldc:int(12613), ldc:int(-15688))
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1420648525))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(906392640))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1948810877))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(372318529))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-186726070))
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-7088851))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1902645878))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1163900432))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(714489725))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1738539252))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(190669277))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-2055347792))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(507931520))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(2090632475))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(1363221555))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(28840715))
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-19145191))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-32494), ldc:int(-32493))
                                goto(Label_1154)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(128)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1277287362))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1912864550))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-2109621603))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-2025811600))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-1072632696))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(1763442042))
                        var_11_EB = and:int(ldc:int(-13015), ldc:int(12500))
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-826894806))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-1408698778))
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(447864633))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1387)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-1643407158))
                            goto(Label_1154)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-116323012))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(2146609677))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(217699806))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1387:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(198772434))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(128)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1507885825))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(345959097))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1839347425))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_680 = and:int(var_3_680:int, ldc:int(1486878059))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1781217742))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1245618247))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(18979702))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(597512898))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1904591771))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-459240545))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1969892184))
                        var_17_68B = add:int(var_16_119:int, and:int(ldc:int(20485), ldc:int(67)))
                        looporswitchbreak()
                    }
                }
                
                var_3_680 = and:int(var_3_680:int, ldc:int(-1978271921))
                
                if (cmple:boolean(var_5_81 = var_17_68B:int, sub:int(var_6_88:int, xor:int(ldc:int(20994), ldc:int(20995))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_680 = and:int(var_3_680:int, ldc:int(-2021067407))
            goto(Label_0108)
        }
    }
}
