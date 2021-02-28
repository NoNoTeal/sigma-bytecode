public class \u51fa\u12cb\u7330\u74b1\u6c52.\uafe7\u5fe1\u3e2a\u62da\u946b\u3bc9 {
    public void \uafe7\u5fe1\u3e2a\u62da\u946b\u3bc9() {
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
            invokespecial:Object(Object::<init>, this:\uafe7\u5fe1\u3e2a\u62da\u946b\u3bc9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e \u64ab\u7330\u8d90\u3a62\u4c2b\u6d69(java.util.Iterator<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e> p0, int p1) {
        var_2_5F : int
        var_2_7F : int
        var_4_87 : int
        var_5_F8 : \u8d98\u5db4\uc910\u0b8e\ubf56\ud36e
        stack_10E_0 : \u8d98\u5db4\uc910\u0b8e\ubf56\ud36e [generated]
        
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
        var_2_5F = and:int(ldc:int(1385029353), ldc:int(-66456661))
        
        if (cmpne:boolean(p0:Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>, aconstnull:Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>())) {
            do {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-927740939))
                    
                    if (cmpge:boolean(p1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
                }
            } while (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0)))
            
            var_2_7F = and:int(var_2_5F:int, ldc:int(-50075741))
            var_4_87 = and:int(ldc:int(-24317), ldc:int(21052))
            
            while (cmplt:boolean(var_4_87:int, p1:int)) {
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, p0:Iterator))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
                }
                
                var_2_7F = and:int(var_2_7F:int, ldc:int(-348265821))
                var_5_F8 = checkcast:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, invokeinterface:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>::next, p0:Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>))
                inc:int(var_4_87, ldc:int(1))
            }
            
            do {
                if (cmpeq:boolean(and:int(var_2_7F:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_7F = and:int(var_2_7F:int, ldc:int(97552423))
                }
                else {
                    var_2_7F = and:int(var_2_7F:int, ldc:int(-260061441))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, p0:Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>)) {
                        loopcontinue()
                    }
                    
                    stack_10E_0 = aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e()
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(stack_10E_0:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e)
                }
            } while (cmpeq:boolean(and:int(var_2_7F:int, ldc:int(512)), ldc:int(0)))
            
            stack_10E_0 = checkcast:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, invokeinterface:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>::next, p0:Iterator<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>))
            return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(stack_10E_0:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e)
        }
        
        return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e \u64ab\u7330\u8d90\u3a62\u4c2b\u6d69(com.google.common.collect.ImmutableList<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e> p0, int p1) {
        var_2_6F : int
        
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
        var_2_6F = and:int(ldc:int(-1530732449), ldc:int(2137259416))
        
        if (cmpeq:boolean(p0:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>, aconstnull:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>())) {
            return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_6F = and:int(var_2_6F:int, ldc:int(-946931590))
                
                if (cmplt:boolean(p1:int, ldc:int(0))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(65536)), ldc:int(0))) {
                return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(ternaryop:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(cmplt:boolean(p1:int, invokevirtual:int(ImmutableList::size, p0:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>)), checkcast:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, invokevirtual:Object[expected:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e](ImmutableList::get, p0:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>, p1:int)), aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e()))
            }
            
            var_2_6F = and:int(var_2_6F:int, ldc:int(196786244))
        }
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
    
    public void \u3d64\ub113\uc31c\u0c95\ub113\u56bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(-1782007285), ldc:int(903457065))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uafe7\u5fe1\u3e2a\u62da\u946b\u3bc9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1489081011))
        }
        else {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-587538313))
            var_5_85 = and:int(ldc:int(-14693), ldc:int(14688))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32547), ldc:int(15106)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DD:int, ldc:int(-134696717))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(641), ldc:int(3095)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16944), ldc:int(16945)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_D2:int, ldc:int(1575745679))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4632), ldc:int(4633)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1376469234))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1498050634))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2080241007))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1713274045))
                    }
                    else {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1056750887))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1983818718))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-472964163))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1993261237))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(534638991))
                            var_11_E3 = and:int(ldc:int(-30928), ldc:int(30855))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1478749628))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(724695186))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1321442327))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1961425037))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-98953484))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2128845728))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(607734553))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1613883378))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1211438303))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1703915120))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-115016517))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1095320028))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(484106361))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(144), ldc:int(145))
                                goto(Label_1003)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1037637339))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-931688844))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-224282529))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(799819133))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(349877393))
                        var_11_E3 = and:int(ldc:int(29210), ldc:int(-29211))
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1308032904))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-178685376))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-313316049))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(800148480))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-441209159))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1001127498))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(368967025))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(304611965))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1736223409))
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-156732427))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(380761438))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(296240977))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-186994579))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1284792442))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(297151077))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(873120867))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-397315231))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1670874331))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-7428555))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1609810280))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(483309135))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1029048742))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1461921135))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1962584501))
                        var_17_5E8 = add:int(var_16_111:int, xor:int(ldc:int(802), ldc:int(803)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(-151473109))
                
                if (cmple:boolean(var_5_85 = var_17_5E8:int, sub:int(var_6_8C:int, xor:int(ldc:int(4272), ldc:int(4273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
