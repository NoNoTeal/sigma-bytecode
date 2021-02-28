public class \ub113\ufcaf\u3c25\u071d\u97b7.\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c {
    public void \u3bc9\u6ec6\u183a\u9a18\u9a18\u516c() {
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
            invokespecial:Object(Object::<init>, this:\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u3776\u7043\u527a\u3dd3\u51b2\uc9f6(java.util.List<? extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776> p0) {
        var_1_5F : int
        var_3_67 : int
        var_4_6F : int
        var_5_77 : int
        
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
            var_1_5F = and:int(ldc:int(-155486277), ldc:int(-1208262918))
            var_3_67 = and:int(ldc:int(25252), ldc:int(-31461))
            var_4_6F = and:int(ldc:int(1267), ldc:int(-1276))
            var_5_77 = invokeinterface:int(List::size, p0:List)
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-12878085))
                
                if (cmpge:boolean(var_4_6F:int, var_5_77:int)) {
                    looporswitchbreak()
                }
                
                var_3_67 = add:int(var_3_67:int, getfield:int(\u5245\ubcb0\u836c\u759a\u983f\u3776::\ud36e\u3c25\uc84e\ud171\u5f50\u5bc4, checkcast:\u5245\ubcb0\u836c\u759a\u983f\u3776(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776.class, invokeinterface:? extends \u5245\ubcb0\u836c\u759a\u983f\u3776(List<? extends \u5245\ubcb0\u836c\u759a\u983f\u3776>::get, p0:List<? extends \u5245\ubcb0\u836c\u759a\u983f\u3776>, var_4_6F:int))))
                inc:int(var_4_6F, ldc:int(1))
            }
            
            return:int(var_3_67:int)
        }
        
        goto(Label_0006)
    }
    
    public static T extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776 \u9a18\ub171\u9255\u9255\u7043\u8640(java.util.Random p0, java.util.List<T> p1, int p2) {
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
        
        if (cmpgt:boolean(p2:int, ldc:int(0))) {
            return:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(invokestatic:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c::\u9a18\ub171\u9255\u9255\u7043\u8640, p1:List<T>, invokevirtual:int(Random::nextInt, p0:Random, p2:int)))
        }
        
        athrow(checkcast:IllegalArgumentException(java.lang.IllegalArgumentException.class, invokestatic:IllegalArgumentException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:IllegalArgumentException(IllegalArgumentException::<init>))))
    }
    
    public static T extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776 \u9a18\ub171\u9255\u9255\u7043\u8640(java.util.List<T> p0, int p1) {
        var_2_5F : int
        var_4_67 : int
        var_5_6F : int
        var_6_A4 : \u5245\ubcb0\u836c\u759a\u983f\u3776
        
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
        var_2_5F = and:int(ldc:int(-980776241), ldc:int(-340201824))
        var_4_67 = and:int(ldc:int(-28117), ldc:int(25812))
        var_5_6F = invokeinterface:int(List::size, p0:List)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-625217878))
                
                if (cmplt:boolean(var_4_67:int, var_5_6F:int)) {
                    var_6_A4 = checkcast:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776[expected:\u5245\ubcb0\u836c\u759a\u983f\u3776](T extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776.class, invokeinterface:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(List<T>::get, p0:List<T>, var_4_67:int))
                    p1 = sub:int(p1:int, getfield:int(\u5245\ubcb0\u836c\u759a\u983f\u3776::\ud36e\u3c25\uc84e\ud171\u5f50\u5bc4, var_6_A4:\u5245\ubcb0\u836c\u759a\u983f\u3776))
                    
                    if (cmpge:boolean(p1:int, ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(1922022101))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(var_6_A4:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776)
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                return:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(checkcast:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(T extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776.class, aconstnull:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776()))
            }
        }
    }
    
    public static T extends \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5245\ubcb0\u836c\u759a\u983f\u3776 \u9a18\ub171\u9255\u9255\u7043\u8640(java.util.Random p0, java.util.List<T> p1) {
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
            return:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(invokestatic:T extends \u5245\ubcb0\u836c\u759a\u983f\u3776(\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c::\u9a18\ub171\u9255\u9255\u7043\u8640, p0:Random, p1:List<T>, invokestatic:int(\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c::\u3776\u7043\u527a\u3dd3\u51b2\uc9f6, p1:List<T>)))
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
    
    public void \ubefe\u873d\uf94d\u6d69\u5654\u8df4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F6 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_601 : int
        
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
        var_3_5F6 = and:int(ldc:int(-1143144319), ldc:int(-285455387))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bc9\u6ec6\u183a\u9a18\u9a18\u516c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1945154529))
        }
        else {
            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1204399199))
            var_5_85 = and:int(ldc:int(-5359), ldc:int(5354))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32256), ldc:int(22885)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F6:int, ldc:int(-1159944787))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(6145), ldc:int(16523)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(260), ldc:int(261)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F6 = and:int(var_3_DA:int, ldc:int(-1185030441))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2065), ldc:int(257)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1174094633))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(847770740))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1756491514))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1912615495))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1099096925))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1469862910))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1860595510))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1789333769))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(263404545))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-320957547))
                        var_11_EB = and:int(ldc:int(2904), ldc:int(-11097))
                        goto(Label_1423)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(661084393))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(577293407))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-511281855))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(600848916))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1299446967))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-289968919))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1265742880))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(2023269646))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(222521781))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1354375878))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2134978158))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-874205745))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-6869057))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1194578359))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(128365976))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1566936193))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1344462663))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(390), ldc:int(391))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1875497845))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1894203198))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2100423649))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-938635860))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1375798289))
                        var_11_EB = and:int(ldc:int(4207), ldc:int(-12416))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1308462776))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1083138456))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1576827969))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1907708976))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1652869961))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(260697401))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1635928641))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1294776287))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-118035797))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-580492451))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-944097166))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1726295494))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1015697))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2355747))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(432215914))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1283125603))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1174521199))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_601 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-389112986))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-876957263))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1785871588))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-319013687))
                        var_17_601 = add:int(var_16_119:int, xor:int(ldc:int(25096), ldc:int(25097)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1143530283))
                
                if (cmple:boolean(var_5_85 = var_17_601:int, sub:int(var_6_8C:int, and:int(ldc:int(16785), ldc:int(9217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(2078055603))
            goto(Label_0106)
        }
    }
}
