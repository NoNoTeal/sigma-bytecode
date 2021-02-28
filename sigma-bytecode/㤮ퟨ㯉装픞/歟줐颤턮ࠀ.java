public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u6b5f\uc910\u98a4\ud12e\u0800 {
    public void \u6b5f\uc910\u98a4\ud12e\u0800() {
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
            invokespecial:Object(Object::<init>, this:\u6b5f\uc910\u98a4\ud12e\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uc246\u7049\ub70c\u6b5f\ubf56(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u61a4\u5bc4\u67d0\u34df\u8258 p0) {
        var_1_5F : int
        var_3_67 : int
        var_4_71 : Iterator<Long>
        
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
            var_1_5F = and:int(ldc:int(1668950806), ldc:int(1937571732))
            var_3_67 = and:int(ldc:int(16641), ldc:int(4105))
            var_4_71 = invokeinterface:Iterator<Long>(Set<Long>::iterator, getfield:Set<Long>(\u61a4\u5bc4\u67d0\u34df\u8258::\u36d3\u5fe1\uc246\u8258\u3bd6, p0:\u61a4\u5bc4\u67d0\u34df\u8258))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1282324206))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-67621898))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_4_71:Iterator)) {
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubf56\u6c56\ubb2b\u946b\u624e\ub19c, invokevirtual:long(Long::longValue, checkcast:Long(java.lang.Long.class, invokeinterface:Long(Iterator<Long>::next, var_4_71:Iterator<Long>))))))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(1736348548))
                            loopcontinue()
                        }
                        
                        var_3_67 = and:int(ldc:int(14928), ldc:int(-14929))
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(var_3_67:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u74b1\u97e6\u7c6b\u7ce1\u873d() {
        var_0_5F : int
        stack_BA_0 : int [generated]
        
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
            var_0_5F = and:int(ldc:int(-1609175964), ldc:int(-1529680210))
            
            if (logicaland:boolean(getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654))), cmpeq:boolean(invokeinterface:long(Stream<T>::count, invokevirtual:Stream<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>(\u516c\u5bc4\u494c\ub1b9\u5245::\ucfaf\u9033\ucb79\u9255\uc31c\u7049, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u516c\u5bc4\u494c\ub1b9\u5245](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654)), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654)), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654))), ldc:double(0.0), ldc:double(1.0), ldc:double(0.0)))), ldc:long(0L)))) {
                stack_BA_0 = and:int(ldc:int(4619), ldc:int(16385))
            }
            else {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1094783120))
                stack_BA_0 = and:int(ldc:int(-17178), ldc:int(17169))
            }
            
            return:boolean(stack_BA_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc910\u98a4\ud12e\u0800::\ua068\uc84e\u7049\uc4d2\u5654, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub113\u983f\u7e3f\ud36e\uc7fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EB : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F6 : int
        
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
        var_3_5EB = and:int(ldc:int(1467306583), ldc:int(-675310987))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\uc910\u98a4\ud12e\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-142895273))
            var_5_7D = and:int(ldc:int(13536), ldc:int(-13539))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31018), ldc:int(31017)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5EB:int, ldc:int(-4350625))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4098), ldc:int(4099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-20448), ldc:int(-20447)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5EB = and:int(var_3_CA:int, ldc:int(-679915393))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5411), ldc:int(2705)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(416958425))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(658551132))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-379411656))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1588660538))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1988027255))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-550397443))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1796282589))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1498121897))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1402000194))
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-21037464))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(979295825))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-541468043))
                        var_11_DB = and:int(ldc:int(27108), ldc:int(-31717))
                        goto(Label_1399)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-317358552))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-842281712))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(573055625))
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(2035947752))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(2603781))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-870025966))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-684338345))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(985778173))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1786342651))
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1687599419))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1379729055))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-537003787))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1785322335))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1584093967))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1404958742))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-36001))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(18433), ldc:int(4129))
                                goto(Label_1023)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(571751693))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1609684053))
                        var_11_DB = and:int(ldc:int(-15094), ldc:int(15028))
                    }
                    
                    Label_1023:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1480191670))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1078160450))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1141173448))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-611692576))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1077888106))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-2018328186))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(203420063))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-679780483))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1287)
                            }
                        }
                    }
                    
                    Label_1168:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1141653424))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1023)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1551668591))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1290318146))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1462858879))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1287:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1369307441))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-194091184))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5EB = and:int(var_3_5EB:int, ldc:int(-139101355))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F6 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(16950282))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1670540446))
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-175577290))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1230521379))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-684501161))
                        var_17_5F6 = add:int(var_16_109:int, xor:int(ldc:int(-32488), ldc:int(-32487)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5EB = and:int(var_3_5EB:int, ldc:int(1605604831))
                
                if (cmple:boolean(var_5_7D = var_17_5F6:int, sub:int(var_6_84:int, and:int(ldc:int(4067), ldc:int(12309))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
