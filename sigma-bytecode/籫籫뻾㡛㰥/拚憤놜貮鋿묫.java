public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T> {
    public void \u62da\u61a4\ub19c\u8cae\u92ff\ubb2b(java.util.function.Supplier<T> p0) {
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
            invokespecial:Object(Object::<init>, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>)
            putfield:Supplier<T>(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b::\uc2e8\u600f\u6c56\u8c8a\u6c52\u62da, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>, p0:Supplier<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9() {
        var_3_64 : Supplier<T>
        
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
            var_3_64 = getfield:Supplier<T>(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b::\uc2e8\u600f\u6c56\u8c8a\u6c52\u62da, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>)
            
            if (cmpne:boolean(var_3_64:Supplier<T>, aconstnull:Supplier<T>())) {
                putfield:T(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b::\ud217\ud51e\ub7dc\u839e\uc31c\ua61f, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>, invokeinterface:T(Supplier<T>::get, var_3_64:Supplier<T>))
                putfield:Supplier<T>(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b::\uc2e8\u600f\u6c56\u8c8a\u6c52\u62da, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>, aconstnull:Supplier<T>())
            }
            
            return:T(getfield:T(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b::\ud217\ud51e\ub7dc\u839e\uc31c\ua61f, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>))
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
    
    public void \u8aa5\u92ee\u8308\u97e6\ua6bd\u8413(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5C8 : int
        
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
        var_3_5BD = and:int(ldc:int(-187245384), ldc:int(-103360014))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-24423410))
        }
        else {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1990193145))
            var_5_85 = and:int(ldc:int(-2041), ldc:int(1992))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8900), ldc:int(-8901)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5BD:int, ldc:int(-241705245))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(17411), ldc:int(17410)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(11021), ldc:int(16579)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_D2:int, ldc:int(-1177036055))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1025), ldc:int(1024)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(570565236))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1817079391))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1730998517))
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1147220244))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0509)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(468574696))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-39858774))
                            var_11_E3 = and:int(ldc:int(-2324), ldc:int(2323))
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0509:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1944876242))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1902799877))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-835960805))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-134352640))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-651281509))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1298211144))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1351802117))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1925188946))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1685968854))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1964462259))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-104589847))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1311254044))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-697948483))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1308636249))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(3097), ldc:int(129))
                                goto(Label_0987)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1490095425))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-937383166))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(912151746))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(959053388))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-4785181))
                        var_11_E3 = and:int(ldc:int(9060), ldc:int(-9061))
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-120758488))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-514769367))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1063037317))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-767558464))
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(25433667))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-86574594))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1236)
                            }
                        }
                    }
                    
                    Label_1106:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1297834841))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-795398509))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1910017885))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1398625699))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1012052711))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(949997475))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(58267029))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-512938089))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1298482851))
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(-54535498))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1351:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1324299094))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-837593340))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-378099604))
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(808842594))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-102838801))
                        var_17_5C8 = add:int(var_16_111:int, and:int(ldc:int(18445), ldc:int(961)))
                        looporswitchbreak()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(445987050))
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(1020710888))
                
                if (cmple:boolean(var_5_85 = var_17_5C8:int, sub:int(var_6_8C:int, xor:int(ldc:int(658), ldc:int(659))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
