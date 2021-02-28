public class \u5d20\u97b7\u8753\u873d\u16f6.\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3 {
    public void \u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3() {
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
            invokespecial:Object(Object::<init>, this:\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u4975\ud171\u5db4\u67d0\ucef1\uc238() {
        var_0_7D : int
        var_2_63 : long
        var_4_67 : long
        stack_98_0 : int [generated]
        var_12_DD : int
        
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
        var_0_7D = and:int(ldc:int(-293575254), ldc:int(-280319325))
        var_2_63 = invokestatic:long(System::currentTimeMillis)
        var_4_67 = invokestatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u873d\u4179\u8753\u92ff\u4c04\u8308)
        
        if (cmplt:boolean(var_4_67:long, getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u718f\uc9f6\u71ae\u7ce1\u7d52\u7330))) {
            stack_98_0 = and:int(ldc:int(8805), ldc:int(21507))
            goto(Label_0147)
        }
        
        Label_0114:
        
        if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        var_0_7D = and:int(var_0_7D:int, ldc:int(-1889684248))
        stack_98_0 = and:int(ldc:int(-5537), ldc:int(5536))
        Label_0147:
        var_0_7D = and:int(var_0_7D:int, ldc:int(-317664531))
        
        if (putstatic:boolean(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u12cb\u76bc\ub19c\u8258\u9255\ub6ab, stack_98_0:int)) {
            var_12_DD = d2i:int(div:double(l2d:double(sub:long(getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u718f\uc9f6\u71ae\u7ce1\u7d52\u7330), getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u0a06\u7ce1\ub18d\u3e75\u759a\u12cb))), div:double(l2d:double(sub:long(getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u071d\u600f\u9937\ub113\u183a\u9a18), getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u7043\u759a\u8709\ucb79\u5d20\u8753))), ldc:double(1000.0))))
            
            if (cmpgt:boolean(var_12_DD:int, ldc:int(0))) {
                putstatic:int(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u6198\ucef1\ua562\u4cd9\u8d90\u6b0d, var_12_DD:int)
            }
            
            var_0_7D = and:int(var_0_7D:int, ldc:int(-841935681))
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u7043\u759a\u8709\ucb79\u5d20\u8753, var_2_63:long)
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u0a06\u7ce1\ub18d\u3e75\u759a\u12cb, var_4_67:long)
        }
        
        Label_0161:
        
        if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(4)), ldc:int(0))) {
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u071d\u600f\u9937\ub113\u183a\u9a18, var_2_63:long)
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u718f\uc9f6\u71ae\u7ce1\u7d52\u7330, var_4_67:long)
            return:void()
        }
        
        goto(Label_0114)
    }
    
    private static long \u873d\u4179\u8753\u92ff\u4c04\u8308() {
        var_2_63 : Runtime
        
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
            var_2_63 = invokestatic:Runtime(Runtime::getRuntime)
            return:long(sub:long(invokevirtual:long(Runtime::totalMemory, var_2_63:Runtime), invokevirtual:long(Runtime::freeMemory, var_2_63:Runtime)))
        }
        
        goto(Label_0006)
    }
    
    public static long \u4c2b\u4f4a\u8413\u446c\ua61f\u6ec6() {
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
            return:long(getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u7043\u759a\u8709\ucb79\u5d20\u8753))
        }
        
        goto(Label_0006)
    }
    
    public static long \u64ab\u99f7\uc229\u51b2\uafe7\u40a9() {
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
            return:long(div:long(getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u0a06\u7ce1\ub18d\u3e75\u759a\u12cb), getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\uc238\ub6ab\u6d69\u99f7\u71f1\u7330)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u9af2\u72f1\u40a9\u52d3\u97b7\u927d() {
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
            return:boolean(getstatic:boolean(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u12cb\u76bc\ub19c\u8258\u9255\ub6ab))
        }
        
        goto(Label_0006)
    }
    
    public static long \u51fa\u34df\u71f1\u494c\u3504\ub32d() {
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
            return:long(div:long(i2l:long(getstatic:int(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u6198\ucef1\ua562\u4cd9\u8d90\u6b0d)), getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\uc238\ub6ab\u6d69\u99f7\u71f1\u7330)))
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
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u7043\u759a\u8709\ucb79\u5d20\u8753, invokestatic:long(System::currentTimeMillis))
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u0a06\u7ce1\ub18d\u3e75\u759a\u12cb, invokestatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u873d\u4179\u8753\u92ff\u4c04\u8308))
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u071d\u600f\u9937\ub113\u183a\u9a18, getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u7043\u759a\u8709\ucb79\u5d20\u8753))
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u718f\uc9f6\u71ae\u7ce1\u7d52\u7330, getstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u0a06\u7ce1\ub18d\u3e75\u759a\u12cb))
            putstatic:boolean(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u12cb\u76bc\ub19c\u8258\u9255\ub6ab, and:int[expected:boolean](ldc:int(-24672), ldc:int(24667)))
            putstatic:int(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\u6198\ucef1\ua562\u4cd9\u8d90\u6b0d, and:int(ldc:int(10956), ldc:int(-10957)))
            putstatic:long(\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3::\uc238\ub6ab\u6d69\u99f7\u71f1\u7330, ldc:long(1048576L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u5db4\u5245\u3711\uc238\uc31c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F0 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FB : int
        
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
        var_3_5F0 = and:int(ldc:int(1852478928), ldc:int(1059952616))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u34df\uc29a\u0a06\u8aa5\u3d4b\u3dd3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(65536)), ldc:int(0))) {
            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1678598150))
            var_5_7D = and:int(ldc:int(-937), ldc:int(936))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12059), ldc:int(12058)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F0:int, ldc:int(1459205612))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(17432), ldc:int(17433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2077), ldc:int(1539)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F0 = and:int(var_3_D2:int, ldc:int(-1033306897))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-16319), ldc:int(-16320)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1138997326))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(260152288))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-597157096))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1600551318))
                    }
                    else {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1990506237))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(565646520))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1922351614))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(509313301))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1126216942))
                            var_11_E3 = and:int(ldc:int(-6907), ldc:int(4346))
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(363995045))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1728768731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1432043134))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(442902065))
                            loopcontinue()
                        }
                        
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1359872792))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1818428797))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1390004819))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1287121124))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1798296782))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-791641146))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-198283308))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1992428422))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(231399204))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(498938411))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(434519111))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1493435191))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(2561), ldc:int(8329))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1600006886))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1550893534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1106874342))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1011269333))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-650108297))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1056282095))
                        var_11_E3 = and:int(ldc:int(10531), ldc:int(-12196))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(989307458))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(362217696))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(413825260))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1816152078))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1067856505))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-942978303))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(923457226))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1205480152))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(70479712))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1616079393))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1600909261))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1260943864))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1705876195))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1816829157))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F0 = and:int(var_3_5F0:int, ldc:int(724081882))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FB = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1400999303))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(297322083))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-745848857))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-1078879138))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(1036334373))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(752508446))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F0 = and:int(var_3_5F0:int, ldc:int(45782751))
                        var_17_5FB = add:int(var_16_111:int, xor:int(ldc:int(28673), ldc:int(28672)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F0 = and:int(var_3_5F0:int, ldc:int(-567356204))
                
                if (cmple:boolean(var_5_7D = var_17_5FB:int, sub:int(var_6_84:int, xor:int(ldc:int(1152), ldc:int(1153))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5F0:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5F0 = and:int(var_3_5F0:int, ldc:int(789575537))
            goto(Label_0106)
        }
    }
}
