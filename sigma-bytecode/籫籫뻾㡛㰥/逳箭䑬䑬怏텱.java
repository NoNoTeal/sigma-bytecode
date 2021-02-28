public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u9033\u7bad\u446c\u446c\u600f\ud171 {
    public void \u9033\u7bad\u446c\u446c\u600f\ud171(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            invokespecial:Object(Object::<init>, this:\u9033\u7bad\u446c\u446c\u600f\ud171)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9033\u7bad\u446c\u446c\u600f\ud171::\ub7dc\u6bb9\u9033\uf9c5\u97b7\u5d20, this:\u9033\u7bad\u446c\u446c\u600f\ud171, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u385b\u1187\uc9f6\u64f2\u839e\u7873(java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<T>> p0, java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T> p1, java.util.function.Consumer<T> p2) {
        var_6_6D : T
        
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
        var_6_6D = invokeinterface:T(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>::apply, p1:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9033\u7bad\u446c\u446c\u600f\ud171::\ub7dc\u6bb9\u9033\uf9c5\u97b7\u5d20, this:\u9033\u7bad\u446c\u446c\u600f\ud171))
        
        if (cmpne:boolean(var_6_6D:T, aconstnull:T())) {
            invokeinterface:void(Consumer<T>::accept, p2:Consumer<T>, var_6_6D:T)
            return:boolean(xor:int[expected:boolean](ldc:int(5), ldc:int(4)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-30050), ldc:int(21857)))
    }
    
    public void \u64f2\uff55\uff55\ua61f\u8c8a\u6198(com.google.gson.JsonArray p0) {
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
            invokevirtual:void(JsonArray::add, p0:JsonArray, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9033\u7bad\u446c\u446c\u600f\ud171::\ub7dc\u6bb9\u9033\uf9c5\u97b7\u5d20, this:\u9033\u7bad\u446c\u446c\u600f\ud171)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9033\u7bad\u446c\u446c\u600f\ud171::\ub7dc\u6bb9\u9033\uf9c5\u97b7\u5d20, this:\u9033\u7bad\u446c\u446c\u600f\ud171)))
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
    
    public void \u4d85\u6bb9\u8d90\uc7fe\u392e\u965f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(1231267814), ldc:int(-639317078))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\u7bad\u446c\u446c\u600f\ud171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-465783180))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-549547098))
            var_5_85 = and:int(ldc:int(-13806), ldc:int(13804))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18472), ldc:int(18471)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_60D:int, ldc:int(-269580302))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2051), ldc:int(16969)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1057), ldc:int(4361)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_DA:int, ldc:int(-639436806))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4235), ldc:int(2049)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1051014576))
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1275491604))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-115231770))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0509)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1911982250))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2067456959))
                            var_11_EB = and:int(ldc:int(-19314), ldc:int(2929))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0509:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-295523704))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1853698261))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1307803453))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2006849781))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-138221125))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-276992857))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-575671301))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1613170471))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-740820629))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-104452793))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1598812720))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(123271578))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(274714286))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(61415553))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-612390934))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-206437644))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1703390312))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(72980761))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1560308456))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(799246523))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-906758161))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(1040), ldc:int(1041))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2026837931))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1707165498))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-349766201))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1594732890))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(642925716))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1261561778))
                        var_11_EB = and:int(ldc:int(11526), ldc:int(-15623))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1104516074))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1772785523))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-874148433))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1361181827))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(140720498))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(328643418))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1563415478))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2023434820))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-459647002))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(445821208))
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(443069020))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-480588259))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-46670870))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1431)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1045544175))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1036903428))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2099249439))
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(832244783))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(1240433659))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-991256275))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-292987482))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1634858413))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(675205388))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1535503796))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1596827555))
                        var_17_618 = add:int(var_16_119:int, and:int(ldc:int(257), ldc:int(8337)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-277548114))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, and:int(ldc:int(25687), ldc:int(7041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1008505132))
            goto(Label_0106)
        }
    }
}
