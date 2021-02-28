public final class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u6fb0\u4daf\u97e6\ub8be\u8258\u6fb0 {
    private void \u6fb0\u4daf\u97e6\ub8be\u8258\u6fb0() {
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
            invokespecial:Object(Object::<init>, this:\u6fb0\u4daf\u97e6\ub8be\u8258\u6fb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u8c8a\u97b7\u92ff\u3a62\ubb2b\u759a(char p0) {
        var_1_5F : int
        stack_18C_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-192542408), ldc:int(-5247057))
            
            if (cmpge:boolean(p0:char, ldc:char(97))) {
                if (cmple:boolean(p0:char, ldc:char(122))) {
                    goto(Label_0238)
                }
            }
            
            Label_0102:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(364746944))
                goto(Label_0238)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(140838069))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-40480899))
                
                if (cmpge:boolean(p0:char, ldc:char(65))) {
                    if (cmple:boolean(p0:char, ldc:char(90))) {
                        goto(Label_0238)
                    }
                }
            }
            
            Label_0150:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-598732565))
                goto(Label_0238)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1109418535))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0102)
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-186737357))
                
                if (cmpge:boolean(p0:char, ldc:char(48))) {
                    if (cmple:boolean(p0:char, ldc:char(57))) {
                        goto(Label_0238)
                    }
                }
            }
            
            Label_0198:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1173826201))
                    goto(Label_0102)
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-189281415))
                
                if (cmpne:boolean(p0:char, ldc:char(45))) {
                    if (cmpne:boolean(p0:char, ldc:char(95))) {
                        if (cmpne:boolean(p0:char, ldc:char(46))) {
                            if (cmpne:boolean(p0:char, ldc:char(43))) {
                                stack_18C_0 = and:int[expected:boolean](ldc:int(30308), ldc:int(-30437))
                                return:boolean(stack_18C_0:boolean)
                            }
                        }
                    }
                }
            }
            
            Label_0238:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0198)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0150)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0102)
            }
            
            stack_18C_0 = xor:int[expected:boolean](ldc:int(18952), ldc:int(18953))
            return:boolean(stack_18C_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u6b0d\u965f\u965f\u6bb9\u8df4\ufe34(char p0) {
        var_1_5F : int
        stack_ED_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1402809433), ldc:int(-1212287979))
            
            if (cmpge:boolean(p0:char, ldc:char(48))) {
                if (cmple:boolean(p0:char, ldc:char(57))) {
                    goto(Label_0120)
                }
            }
            
            Label_0102:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2061202715))
                
                if (cmpne:boolean(p0:char, ldc:char(43))) {
                    if (cmpne:boolean(p0:char, ldc:char(45))) {
                        if (cmpne:boolean(p0:char, ldc:char(101))) {
                            if (cmpne:boolean(p0:char, ldc:char(69))) {
                                if (cmpne:boolean(p0:char, ldc:char(46))) {
                                    stack_ED_0 = and:int[expected:boolean](ldc:int(30868), ldc:int(-30869))
                                    return:boolean(stack_ED_0:boolean)
                                }
                            }
                        }
                    }
                }
            }
            
            Label_0120:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0102)
            }
            
            stack_ED_0 = and:int[expected:boolean](ldc:int(12763), ldc:int(3585))
            return:boolean(stack_ED_0:boolean[expected:int])
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\ub8be\ud171\u69d9\u7043\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_618 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_623 : int
        
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
        var_3_618 = and:int(ldc:int(1865689859), ldc:int(2045753722))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6fb0\u4daf\u97e6\ub8be\u8258\u6fb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(-1923048250))
        }
        else {
            var_3_618 = and:int(var_3_618:int, ldc:int(-49961494))
            var_5_85 = and:int(ldc:int(-4406), ldc:int(4405))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5818), ldc:int(5816)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_618:int, ldc:int(2067167130))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(20993), ldc:int(3)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8261), ldc:int(8260)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_618 = and:int(var_3_DA:int, ldc:int(2065151275))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(10305), ldc:int(16777)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(338146332))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1950203695))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(607762320))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2074357594))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1916662004))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1131346928))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2041995462))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-951516606))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1705477027))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(104875150))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1575722765))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-269582889))
                        var_11_EB = and:int(ldc:int(-7355), ldc:int(7352))
                        goto(Label_1439)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(22621011))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2145770666))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(364948577))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-2121688248))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-938605621))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(2034100490))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1938437888))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1286725372))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1527745488))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1775403188))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1568768499))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(1873739522))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2099399911))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2119615679))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1874673348))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(380173136))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1629498833))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-268570670))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(1843), ldc:int(69))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-414601460))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1213490669))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-66383172))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(970101042))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-218011905))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-350802150))
                        var_11_EB = and:int(ldc:int(3233), ldc:int(-11938))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1687018615))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(427574744))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-2145977072))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(1777837987))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-959605040))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1588683767))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1387250464))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1418609349))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1808163710))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1308:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1839811397))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1499545996))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2144924480))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(430984756))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1750528308))
                        loopcontinue()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(-371297965))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_623 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(423788386))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-42581783))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-991623698))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2063395294))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(578939015))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-67208210))
                        var_17_623 = add:int(var_16_119:int, and:int(ldc:int(14449), ldc:int(16781)))
                        looporswitchbreak()
                    }
                }
                
                var_3_618 = and:int(var_3_618:int, ldc:int(-382763093))
                
                if (cmple:boolean(var_5_85 = var_17_623:int, sub:int(var_6_8C:int, xor:int(ldc:int(260), ldc:int(261))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(2124874379))
            goto(Label_0106)
        }
    }
}
