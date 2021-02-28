public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u7ce1\u946b\ucb79\u7af6\u527a\u8413 {
    public void \u7ce1\u946b\ucb79\u7af6\u527a\u8413() {
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
            invokespecial:Object(Object::<init>, this:\u7ce1\u946b\ucb79\u7af6\u527a\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
        var_1_5F : int
        var_3_63 : \u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[]
        var_4_6B : int
        var_5_87 : \u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6
        
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
            var_1_5F = and:int(ldc:int(343778809), ldc:int(-538595382))
            var_3_63 = invokestatic:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[](\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6::values)
            var_4_6B = and:int(ldc:int(-21349), ldc:int(20836))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1530544642))
                
                if (cmpge:boolean(var_4_6B:int, arraylength:int(var_3_63:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[]))) {
                    looporswitchbreak()
                }
                
                var_5_87 = loadelement:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6(var_3_63:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[], var_4_6B:int)
                invokestatic:void(\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u97e6\ub7dc\u6d99\u34df\ub171\u4bc8, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u7043\u67e9\u9255\uc3e3\u6c56\u74b1), and:int(ldc:int(25905), ldc:int(-25906)))), var_5_87:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[expected:Object]), loadelement:String(getstatic:String[](\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u7043\u67e9\u9255\uc3e3\u6c56\u74b1), xor:int(ldc:int(39), ldc:int(38))))))
                invokestatic:void(\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\ube23\uc4d2\u965f\u071d\u71f1\ub113, var_5_87:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6, and:int[expected:boolean](ldc:int(17581), ldc:int(-25790)))
                inc:int(var_4_6B, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \ube23\uc4d2\u965f\u071d\u71f1\ub113(\u5d20\u97b7\u8753\u873d\u16f6.\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6 p0, boolean p1) {
        var_2_5F : int
        var_2_6B : int
        var_2_8B : int
        var_4_BD : double
        var_2_CA : int
        var_6_CF : double
        var_2_DC : int
        var_8_112 : int
        var_2_14E : int
        var_9_120 : int
        var_2_171 : int
        var_10_182 : double
        var_2_188 : int
        var_12_1BA : float
        var_2_200 : int
        var_13_1EC : float
        var_2_20F : int
        stack_3A0_0 : String [generated]
        expr_35F : Object[] [generated]
        
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
        var_2_5F = and:int(ldc:int(-1448346121), ldc:int(-101007921))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(128)), ldc:int(0))) {
                var_2_6B = and:int(var_2_5F:int, ldc:int(-491163437))
            }
            else {
                var_2_6B = and:int(var_2_5F:int, ldc:int(-1073741865))
                putstatic:boolean(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u3e75\u8389\u8cae\u88c5\ubff1, p1:boolean)
            }
            
            if (cmpeq:boolean(and:int(var_2_6B:int, ldc:int(4194304)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_2_5F = and:int(var_2_6B:int, ldc:int(540125666))
        }
        
        var_2_8B = and:int(var_2_6B:int, ldc:int(-1083195435))
        
        switch (loadelement:int(getstatic:int[](\u965f\u600f\u3bc9\ub113\u9937\u8308::\u927d\ucb79\u6ec6\u3bc9\u839e\u156b), invokevirtual:int(Enum<E>::ordinal, p0:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[expected:Enum<\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6>]))) {
            case 1:
            case 2:
                var_4_BD = f2d:double(neg:float(getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u2dcc\u3e75\u36d3\u3bc9\ub8be\u5f50)))
                looporswitchbreak()
            
            case 3:
            case 4:
                var_4_BD = ldc:double(-1.0)
                goto(Label_0233)
            
            default:
                return:void()
        }
        
        Label_0191:
        
        if (cmpeq:boolean(and:int(var_2_8B:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0233)
        }
        
        var_2_CA = and:int(var_2_8B:int, ldc:int(-1619083299))
        var_6_CF = f2d:double(getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u2dcc\u3e75\u36d3\u3bc9\ub8be\u5f50))
        Label_0209:
        
        if (cmpne:boolean(and:int(var_2_CA:int, ldc:int(524288)), ldc:int(0))) {
            var_2_DC = and:int(var_2_CA:int, ldc:int(-1912930355))
            goto(Label_0272)
        }
        
        goto(Label_0248)
        Label_0233:
        
        if (cmpeq:boolean(and:int(var_2_8B:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0191)
        }
        
        var_2_CA = and:int(var_2_8B:int, ldc:int(-13697027))
        var_6_CF = ldc:double(1.0)
        Label_0248:
        
        if (cmpeq:boolean(and:int(var_2_CA:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0209)
        }
        
        var_2_DC = and:int(var_2_CA:int, ldc:int(-1912668731))
        Label_0272:
        var_8_112 = ldc:int(10)
        var_2_14E = and:int(var_2_DC:int, ldc:int(-1610956851))
        var_9_120 = and:int(ldc:int(-28540), ldc:int(10585))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_14E:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0335)
            }
            
            if (cmpne:boolean(and:int(var_2_14E:int, ldc:int(131072)), ldc:int(0))) {
                var_2_14E = and:int(var_2_14E:int, ldc:int(-1649688595))
                
                if (cmpgt:boolean(var_9_120:int, var_8_112:int)) {
                    return:void()
                }
            }
            
            Label_0316:
            
            if (cmpne:boolean(and:int(var_2_14E:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_14E:int, ldc:int(262144)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_14E = and:int(var_2_14E:int, ldc:int(-645922865))
            }
            
            Label_0335:
            
            if (cmpeq:boolean(and:int(var_2_14E:int, ldc:int(4096)), ldc:int(0))) {
                var_2_14E = and:int(var_2_14E:int, ldc:int(308643889))
                goto(Label_0316)
            }
            
            if (cmpne:boolean(and:int(var_2_14E:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_14E = and:int(var_2_14E:int, ldc:int(424062523))
            }
            else {
                var_2_171 = and:int(var_2_14E:int, ldc:int(-5325321))
                var_10_182 = add:double(var_4_BD:double, div:double(mul:double(i2d:double(var_9_120:int), sub:double(var_6_CF:double, var_4_BD:double)), i2d:double(var_8_112:int)))
                var_2_188 = and:int(var_2_171:int, ldc:int(-1149518353))
                
                switch (loadelement:int(getstatic:int[](\u965f\u600f\u3bc9\ub113\u9937\u8308::\u927d\ucb79\u6ec6\u3bc9\u839e\u156b), invokevirtual:int(Enum<E>::ordinal, p0:\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6[expected:Enum<\u8c8a\ub70c\ub7dc\ucb79\u99f7\uc9f6>]))) {
                    case 1:
                        var_12_1BA = d2f:float(invokestatic:double(Math::sin, var_10_182:double))
                        looporswitchbreak()
                    
                    case 2:
                        var_12_1BA = d2f:float(invokestatic:double(Math::cos, var_10_182:double))
                        goto(Label_0543)
                    
                    case 3:
                        var_12_1BA = d2f:float(invokestatic:double(Math::asin, var_10_182:double))
                        goto(Label_0642)
                    
                    case 4:
                        var_12_1BA = d2f:float(invokestatic:double(Math::acos, var_10_182:double))
                        goto(Label_0757)
                    
                    default:
                        return:void()
                }
                
                Label_0444:
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(604940204))
                    goto(Label_0757)
                }
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(128)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(-1919827167))
                    goto(Label_0642)
                }
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                var_2_200 = and:int(var_2_188:int, ldc:int(-1409565185))
                var_13_1EC = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, d2f:float(var_10_182:double))
                Label_0494:
                
                if (cmpne:boolean(and:int(var_2_200:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0799)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(4)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(-1556955703))
                    goto(Label_0692)
                }
                
                if (cmpne:boolean(and:int(var_2_200:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_20F = and:int(var_2_200:int, ldc:int(-1083195931))
                    goto(Label_0845)
                }
                
                goto(Label_0585)
                Label_0543:
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(1627775301))
                    goto(Label_0757)
                }
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0642)
                }
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0444)
                }
                
                var_2_200 = and:int(var_2_188:int, ldc:int(-1351893035))
                var_13_1EC = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, d2f:float(var_10_182:double))
                Label_0585:
                
                if (cmpne:boolean(and:int(var_2_200:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0799)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(128)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(1922943781))
                    goto(Label_0692)
                }
                
                if (cmpne:boolean(and:int(var_2_200:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(-1305038829))
                    goto(Label_0494)
                }
                
                var_2_20F = and:int(var_2_200:int, ldc:int(-1355890739))
                goto(Label_0845)
                Label_0642:
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(1648974756))
                    goto(Label_0757)
                }
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(-1058716314))
                    goto(Label_0444)
                }
                
                var_2_200 = and:int(var_2_188:int, ldc:int(-1178878507))
                var_13_1EC = invokestatic:float(\ube23\u3d4b\u67d0\u946b\u927d\ubefe::\u983f\uae5d\u416d\uae87\u8258\u718f, d2f:float(var_10_182:double))
                Label_0692:
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(-1718358158))
                    goto(Label_0799)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(4)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(739533861))
                    goto(Label_0585)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(51683484))
                    goto(Label_0494)
                }
                
                var_2_20F = and:int(var_2_200:int, ldc:int(-1715732539))
                goto(Label_0845)
                Label_0757:
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0642)
                }
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0543)
                }
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(913800911))
                    goto(Label_0444)
                }
                
                var_2_200 = and:int(var_2_188:int, ldc:int(-1451507721))
                var_13_1EC = invokestatic:float(\ube23\u3d4b\u67d0\u946b\u927d\ubefe::\u6c52\uc2bd\ub171\ud36e\uc7fe\ub8be, d2f:float(var_10_182:double))
                Label_0799:
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0692)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(256)), ldc:int(0))) {
                    var_2_200 = and:int(var_2_200:int, ldc:int(1457403754))
                    goto(Label_0585)
                }
                
                if (cmpeq:boolean(and:int(var_2_200:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0494)
                }
                
                var_2_20F = and:int(var_2_200:int, ldc:int(-1649492497))
                Label_0845:
                stack_3A0_0 = loadelement:String(getstatic:String[](\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u7043\u67e9\u9255\uc3e3\u6c56\u74b1), and:int(ldc:int(11843), ldc:int(4258)))
                expr_35F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6277), ldc:int(68)))
                storeelement:Object(expr_35F:Object[], and:int(ldc:int(9482), ldc:int(-9483)), invokestatic:Double[expected:Object](Double::valueOf, var_10_182:double))
                storeelement:Object(expr_35F:Object[], and:int(ldc:int(6177), ldc:int(339)), invokestatic:Float[expected:Object](Float::valueOf, var_12_1BA:float))
                storeelement:Object(expr_35F:Object[], xor:int(ldc:int(513), ldc:int(515)), invokestatic:Float[expected:Object](Float::valueOf, var_13_1EC:float))
                storeelement:Object(expr_35F:Object[], xor:int(ldc:int(2562), ldc:int(2561)), invokestatic:Float[expected:Object](Float::valueOf, invokestatic:float(Math::abs, sub:float(var_12_1BA:float, var_13_1EC:float))))
                invokestatic:void(\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u97e6\ub7dc\u6d99\u34df\ub171\u4bc8, invokestatic:String(String::format, stack_3A0_0:String, expr_35F:Object[]))
                var_2_14E = and:int(var_2_20F:int, ldc:int(-378863657))
                inc:int(var_9_120, ldc:int(1))
            }
        }
    }
    
    public static void \u97e6\ub7dc\u6d99\u34df\ub171\u4bc8(java.lang.String p0) {
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
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_225 : int
        expr_6B : int [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_153_0 : byte[] [generated]
        stack_155_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_23F_0 : byte[] [generated]
        stack_28C_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        stack_368_0 : byte[] [generated]
        stack_3BE_0 : byte[] [generated]
        var_4_210 : int
        var_3_215 : byte[]
        var_5_216 : int
        var_0_282 : int
        expr_28C : byte [generated]
        stack_2CA_2 : byte [generated]
        stack_2A8_0 : byte [generated]
        expr_317 : byte [generated]
        expr_B5 : int [generated]
        expr_E7 : int [generated]
        var_2_11F : byte[]
        expr_123 : int [generated]
        var_3_356 : byte[]
        var_5_357 : int
        expr_155 : int [generated]
        var_3_3AC : byte[]
        var_5_3AD : int
        var_3_1A0 : String
        stack_209_0 : String[] [generated]
        expr_1B2 : String[] [generated]
        
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
        var_0_225 = and:int(ldc:int(1699720601), ldc:int(1206740444))
        expr_6B = arraylength:int(stack_B3_0 = stack_B5_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("noKKioqKWoYqWXpyMXmFwmKC63rfa0mBrVZxTcOTZ76jx6GxjX5agoter7vKqrKviopqkpCQkJCwiA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_210 = expr_6B:int
        var_3_215 = newarray:byte[](byte.class, expr_6B:int)
        var_5_216 = expr_6B:int
        Label_0536:
        
        while (cmpne:boolean(and:int(var_0_225:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0622)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(1629880318))
            var_5_216 = add:int(var_5_216:int, ldc:int(-1))
            storeelement:byte(var_3_215:byte[], var_5_216:int, add:byte(loadelement:byte(stack_23F_0:byte[], var_5_216:int), ldc:byte(118)))
            
            if (cmpne:boolean(var_5_216:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B5_0 = stack_B3_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = var_3_215:byte[]
            goto(Label_0112)
        }
        
        var_0_225 = and:int(var_0_225:int, ldc:int(169297272))
        goto(Label_0752)
        Label_0622:
        
        while (cmpeq:boolean(and:int(var_0_225:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0536)
            }
            
            var_0_282 = and:int(var_0_225:int, ldc:int(2100131326))
            var_5_216 = add:int(var_5_216:int, ldc:int(-1))
            expr_28C = stack_2CA_2 = loadelement(stack_28C_0, var_5_216)
            
            if (cmplt:boolean(add:int(add:int(var_5_216:int, ldc:int(6)), neg:int(var_4_210:int)), ldc:int(0))) {
                stack_2CA_2 = stack_2A8_0 = add:byte(expr_28C:byte, loadelement:byte(var_3_215:byte[], add:int(var_5_216:int, ldc:int(6))))
                goto(Label_0696)
            }
            
            Label_0665:
            
            if (cmpeq:boolean(and:int(var_0_282:int, ldc:int(4)), ldc:int(0))) {
                var_0_282 = and:int(var_0_282:int, ldc:int(1943473869))
                stack_2CA_2 = stack_2A8_0 = add:byte(expr_28C:byte, ldc:byte(6))
            }
            
            Label_0696:
            
            if (cmpne:boolean(and:int(var_0_282:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0665)
            }
            
            var_0_225 = and:int(var_0_282:int, ldc:int(1385002668))
            storeelement:byte(var_3_215:byte[], var_5_216:int, stack_2CA_2:byte)
            
            if (cmpne:boolean(var_5_216:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B5_0 = stack_B3_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = var_3_215:byte[]
            goto(Label_0186)
        }
        
        Label_0752:
        
        while (cmpne:boolean(and:int(var_0_225:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0536)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(-679123749))
            var_5_216 = add:int(var_5_216:int, ldc:int(-1))
            expr_317 = loadelement:byte(stack_317_0:byte[], var_5_216:int)
            storeelement:byte(var_3_215:byte[], var_5_216:int, or:int(and:int(shl:int(expr_317:byte, and:int(ldc:int(7044), ldc:int(1044))), ldc:int(-16)), and:int(shr:int(expr_317:byte[expected:int], and:int(ldc:int(16388), ldc:int(6204))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_216:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B5_0 = stack_B3_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = var_3_215:byte[]
            goto(Label_0236)
        }
        
        var_0_225 = and:int(var_0_225:int, ldc:int(354226534))
        goto(Label_0622)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(1320636116))
            goto(Label_0346)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(2)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(102263151))
            goto(Label_0296)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(65536)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-608818074))
            goto(Label_0236)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(262144)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(1977945617))
        }
        else {
            var_0_225 = and:int(var_0_225:int, ldc:int(-993189893))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_210 = expr_B5:int
                var_3_215 = newarray:byte[](byte.class, expr_B5:int)
                var_5_216 = expr_B5:int
                goto(Label_0622)
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0346)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(1159511805))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(2029358520))
            expr_E7 = arraylength:int(stack_E7_0:byte[])
            
            if (cmpne:boolean(expr_E7:int, ldc:int(0))) {
                var_4_210 = expr_E7:int
                var_3_215 = newarray:byte[](byte.class, expr_E7:int)
                var_5_216 = expr_E7:int
                goto(Label_0752)
            }
        }
        
        Label_0236:
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(65536)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-869274747))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(8)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-1478611441))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0186)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(-367568929))
            var_2_11F = stack_11F_0:byte[]
            expr_123 = add:int(arraylength:int(stack_121_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_123:int, ldc:int(0))) {
                var_3_356 = newarray:byte[](byte.class, expr_123:int)
                var_5_357 = expr_123:int
                
                loop {
                    var_0_225 = and:int(var_0_225:int, ldc:int(-1060256356))
                    var_5_357 = add:int(var_5_357:int, ldc:int(-1))
                    storeelement:byte(var_3_356:byte[], var_5_357:int, add:int(shl:int(loadelement:byte(stack_368_0:byte[], var_5_357:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_11F:byte[], add:int(var_5_357:int, and:int(ldc:int(37), ldc:int(1027)))), ldc:int(6)), and:int(ldc:int(15619), ldc:int(579)))))
                    
                    if (cmpne:boolean(var_5_357:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B5_0 = stack_B3_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = var_3_356:byte[]
            }
        }
        
        Label_0296:
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(186068156))
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0186)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(1883063802))
            expr_155 = arraylength:int(stack_155_0:byte[])
            
            if (cmpne:boolean(expr_155:int, ldc:int(0))) {
                var_3_3AC = newarray:byte[](byte.class, expr_155:int)
                var_5_3AD = expr_155:int
                
                loop {
                    var_0_225 = and:int(var_0_225:int, ldc:int(-698925873))
                    var_5_3AD = add:int(var_5_3AD:int, ldc:int(-1))
                    storeelement:byte(var_3_3AC:byte[], var_5_3AD:int, xor:byte(loadelement:byte(stack_3BE_0:byte[], var_5_3AD:int), ldc:byte(41)))
                    
                    if (cmpne:boolean(var_5_3AD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B5_0 = stack_B3_0 = stack_E5_0 = stack_E7_0 = stack_11F_0 = stack_121_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_23F_0 = stack_28C_0 = stack_317_0 = stack_368_0 = stack_3BE_0 = var_3_3AC:byte[]
            }
        }
        
        Label_0346:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-1602923728))
            goto(Label_0236)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(262144)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-298844206))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(8)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(1983665733))
            goto(Label_0112)
        }
        
        var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_209_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20659), ldc:int(8963)))
        expr_1B2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21019), ldc:int(71)))
        storeelement:String(expr_1B2:String[], xor:int(ldc:int(298), ldc:int(299)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(2390), ldc:int(-2391)), xor:int(ldc:int(230), ldc:int(234))))
        storeelement:String(expr_1B2:String[], xor:int(ldc:int(8387), ldc:int(8385)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(-24283), ldc:int(-24279)), xor:int(ldc:int(6226), ldc:int(6242))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(10464), ldc:int(-10721)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(16444), ldc:int(563)), xor:int(ldc:int(1323), ldc:int(1298))))
        putstatic:String[](\u7ce1\u946b\ucb79\u7af6\u527a\u8413::\u7043\u67e9\u9255\uc3e3\u6c56\u74b1, expr_1B2:String[])
    }
    
    public void \u7af6\uc910\uc3e3\ud4fe\u392e\u385b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(-1095581750), ldc:int(-1132010530))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7ce1\u946b\ucb79\u7af6\u527a\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(-186926118))
            var_5_80 = and:int(ldc:int(20506), ldc:int(-22555))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17883), ldc:int(16594)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_645:int, ldc:int(-188482565))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, and:int(ldc:int(16541), ldc:int(2627)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(66), ldc:int(67)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_CF:int, ldc:int(-1516060693))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(1041), ldc:int(4427)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-666119849))
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-769353847))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-5115671))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(229631836))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1081887842))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-825888721))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1092112422))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0563)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1249835432))
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2116524978))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-812269624))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-287169606))
                            var_11_E0 = and:int(ldc:int(17438), ldc:int(-24031))
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0563:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1983206199))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1696533645))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-246072638))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1666546281))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1532195274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-185373809))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0691:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1356950068))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2118959822))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(760773020))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-436802613))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1803973564))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(587755904))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(599087695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(956993655))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1214630961))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(-28672), ldc:int(-28671))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(263158442))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-987695994))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-427482024))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1538769004))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1785590622))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1662390437))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-437049381))
                        var_11_E0 = and:int(ldc:int(-22837), ldc:int(22580))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1204863406))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1396539308))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(740434203))
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(558514976))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-306548786))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1349)
                            }
                        }
                    }
                    
                    Label_1221:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(524564155))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1766547241))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-28459097))
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-828137497))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1208228965))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1349:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1035654901))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1449476079))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-163465286))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-269573293))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1494432110))
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-1359512630))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-777597128))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1447174977))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-228631432))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(584206292))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-51452961))
                        var_17_650 = add:int(var_16_10E:int, and:int(ldc:int(45), ldc:int(16899)))
                        looporswitchbreak()
                    }
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(-3000369))
                
                if (cmple:boolean(var_5_80 = var_17_650:int, sub:int(var_6_87:int, and:int(ldc:int(8193), ldc:int(21401))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
