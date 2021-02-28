public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4c04\u647c\u3711\u1833\u385b\u071d {
    public void \u4c04\u647c\u3711\u1833\u385b\u071d() {
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
            invokespecial:Object(Object::<init>, this:\u4c04\u647c\u3711\u1833\u385b\u071d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ua6bd\u6d99\uc246\u7043\u5fe1\u7d52(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[] p1) {
        var_4_70 : int
        
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
        
        if (cmpne:boolean(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[], aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())) {
            var_4_70 = and:int(ldc:int(9385), ldc:int(-9386))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[]))) {
                if (invokevirtual:boolean(\u40a9\u600f\ud171\u52d3\uc238\u34df::\u99f7\u927d\u4179\ubff1\u88c5\u385b, loadelement:\u40a9\u600f\ud171\u52d3\uc238\u34df(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[], var_4_70:int), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                    return:boolean(xor:int[expected:boolean](ldc:int(136), ldc:int(137)))
                }
                
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(26800), ldc:int(-30898)))
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(-31708), ldc:int(-31707)))
    }
    
    public static boolean \ua6bd\u6d99\uc246\u7043\u5fe1\u7d52(int p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[] p2) {
        var_5_70 : int
        
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
        
        if (cmpne:boolean(p2:\u40a9\u600f\ud171\u52d3\uc238\u34df[], aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())) {
            var_5_70 = and:int(ldc:int(13330), ldc:int(-30559))
            
            while (cmplt:boolean(var_5_70:int, arraylength:int(p2:\u40a9\u600f\ud171\u52d3\uc238\u34df[]))) {
                if (invokevirtual:boolean(\u40a9\u600f\ud171\u52d3\uc238\u34df::\u99f7\u927d\u4179\ubff1\u88c5\u385b, loadelement:\u40a9\u600f\ud171\u52d3\uc238\u34df(p2:\u40a9\u600f\ud171\u52d3\uc238\u34df[], var_5_70:int), p0:int, p1:int)) {
                    return:boolean(xor:int[expected:boolean](ldc:int(-30687), ldc:int(-30688)))
                }
                
                inc:int(var_5_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(3466), ldc:int(-3531)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(65), ldc:int(8633)))
    }
    
    public static boolean \u385b\u7d52\ua068\u4492\u6c56\u4c2b(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[] p1) {
        var_4_70 : int
        
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
        
        if (cmpne:boolean(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[], aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())) {
            var_4_70 = and:int(ldc:int(-9319), ldc:int(9286))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[]))) {
                if (cmpeq:boolean(invokevirtual:int(\u40a9\u600f\ud171\u52d3\uc238\u34df::\u8cae\u6c52\u8413\u9af2\ubb2b\u5140, loadelement:\u40a9\u600f\ud171\u52d3\uc238\u34df(p1:\u40a9\u600f\ud171\u52d3\uc238\u34df[], var_4_70:int)), p0:int)) {
                    return:boolean(xor:int[expected:boolean](ldc:int(17924), ldc:int(17925)))
                }
                
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-6893), ldc:int(6380)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(17483), ldc:int(289)))
    }
    
    public static boolean \u516c\u74b1\u0c95\u9033\ua61f\u59ec(int p0, int[] p1) {
        var_2_5F : int
        var_2_68 : int
        var_4_70 : int
        
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
        var_2_5F = and:int(ldc:int(696750330), ldc:int(-1391599750))
        
        if (cmpne:boolean(p1:int[], aconstnull:int[]())) {
            var_2_68 = and:int(var_2_5F:int, ldc:int(795729791))
            var_4_70 = and:int(ldc:int(-20059), ldc:int(18002))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:int[]))) {
                if (cmpeq:boolean(loadelement:int(p1:int[], var_4_70:int), p0:int)) {
                    return:boolean(xor:int[expected:boolean](ldc:int(10756), ldc:int(10757)))
                }
                
                var_2_68 = and:int(var_2_68:int, ldc:int(-1454902405))
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-12515), ldc:int(12450)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(31025), ldc:int(1093)))
    }
    
    public static boolean \u0b8e\u7006\u416d\u64f2\u6b5f\u839e(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d[] p1) {
        var_2_5F : int
        var_2_68 : int
        var_4_70 : int
        
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
        var_2_5F = and:int(ldc:int(194325881), ldc:int(-1081626793))
        
        if (cmpne:boolean(p1:\u97b7\u8350\u99f7\ub1b9\u839e\u873d[], aconstnull:\u97b7\u8350\u99f7\ub1b9\u839e\u873d[]())) {
            var_2_68 = and:int(var_2_5F:int, ldc:int(1610446678))
            var_4_70 = and:int(ldc:int(-8561), ldc:int(8560))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:\u97b7\u8350\u99f7\ub1b9\u839e\u873d[]))) {
                if (cmpeq:boolean(loadelement:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(p1:\u97b7\u8350\u99f7\ub1b9\u839e\u873d[], var_4_70:int), p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)) {
                    return:boolean(and:int[expected:boolean](ldc:int(1), ldc:int(1285)))
                }
                
                var_2_68 = and:int(var_2_68:int, ldc:int(2145251289))
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-12429), ldc:int(12428)))
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(354), ldc:int(355)))
    }
    
    public static boolean \u927d\u9a18\uc246\u7049\ub7dc\u6d69(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0, \u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[] p1) {
        var_4_70 : int
        var_5_A4 : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c
        
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
        
        if (cmpne:boolean(p1:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[], aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[]())) {
            var_4_70 = and:int(ldc:int(-7273), ldc:int(3176))
            
            while (cmplt:boolean(var_4_70:int, arraylength:int(p1:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[]))) {
                var_5_A4 = loadelement:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(p1:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[], var_4_70:int)
                
                if (logicaland:boolean(cmpne:boolean(var_5_A4:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c, aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c()), cmpeq:boolean(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u3e75\u92ff\ub83f\u4ab3\u8350\u446c::\u983f\u4f52\u67e9\u56bd\u7bad\uc2e8, var_5_A4:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c), p0:\uc2e8\u9255\u647c\ud171\ubf56))) {
                    return:boolean(and:int[expected:boolean](ldc:int(9), ldc:int(31063)))
                }
                
                inc:int(var_4_70, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-24595), ldc:int(24594)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(25), ldc:int(385)))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uff55\u7d52\u4c2b\u88c5\u3d64\ub7dc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E1 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5EC : int
        
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
        var_3_5E1 = and:int(ldc:int(-187319191), ldc:int(499496831))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c04\u647c\u3711\u1833\u385b\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(512)), ldc:int(0))) {
            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(821559160))
            var_5_7D = and:int(ldc:int(-10225), ldc:int(10192))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16361), ldc:int(9576)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5E1:int, ldc:int(884340716))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(450), ldc:int(451)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(35), ldc:int(4305)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5E1 = and:int(var_3_CA:int, ldc:int(1604826201))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(11776), ldc:int(11777)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1346713872))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(210503513))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(895672082))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-906516509))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1905262026))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1924343224))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(230329750))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-2034053548))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-692585089))
                            var_11_DB = and:int(ldc:int(7178), ldc:int(-7371))
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1863689330))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-2074163852))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(554813984))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(362847937))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(581140137))
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1192364852))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1651610317))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(135546034))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1895759866))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-111774624))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-578127998))
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2123871466))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1966399414))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2072552528))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(528776778))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-858296917))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(505713232))
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1645232772))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(12), ldc:int(13))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1536694072))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(639110530))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2089916688))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(251713283))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1216792562))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1351480568))
                        var_11_DB = and:int(ldc:int(-48), ldc:int(47))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1247306825))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1154825712))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(900578542))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1252)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-952420327))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1538971418))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E1 = and:int(var_3_5E1:int, ldc:int(834770731))
                            loopcontinue()
                        }
                        
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2077605887))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1383)
                    }
                    
                    Label_1252:
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1661003140))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-22049699))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-1145757472))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1673816486))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2143468727))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5E1 = and:int(var_3_5E1:int, ldc:int(2077736425))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5EC = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-331711113))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-791071264))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-904801478))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1598886861))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E1 = and:int(var_3_5E1:int, ldc:int(1591721816))
                        var_17_5EC = add:int(var_16_109:int, and:int(ldc:int(115), ldc:int(24833)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E1 = and:int(var_3_5E1:int, ldc:int(-665607499))
                }
                
                var_3_5E1 = and:int(var_3_5E1:int, ldc:int(385201656))
                
                if (cmple:boolean(var_5_7D = var_17_5EC:int, sub:int(var_6_84:int, xor:int(ldc:int(2176), ldc:int(2177))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5E1:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
