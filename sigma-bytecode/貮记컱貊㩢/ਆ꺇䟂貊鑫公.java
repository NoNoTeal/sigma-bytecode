public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T> {
    public void \u0a06\uae87\u47c2\u8c8a\u946b\u516c() {
        var_3_6F : ImmutableList$Builder
        var_4_86 : \u8d98\u5db4\uc910\u0b8e\ubf56\ud36e
        var_5_B2 : Random
        var_6_BB : int
        var_7_127 : float
        var_8_13D : float
        
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
            invokespecial:\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52(\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52::<init>, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>)
            putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>, newarray:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, ldc:int(9)))
            var_3_6F = invokestatic:ImmutableList$Builder(ImmutableList::builder)
            var_4_86 = initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], and:int(ldc:int(-9553), ldc:int(9552)), and:int(ldc:int(-24781), ldc:int(24780)))
            invokevirtual:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, var_4_86:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, ldc:float(-8.0f), ldc:float(-8.0f), ldc:float(-8.0f), ldc:float(16.0f), ldc:float(16.0f), ldc:float(16.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, var_4_86:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, ldc:float(17.6f))
            invokevirtual:ImmutableList$Builder(ImmutableList$Builder::add, var_3_6F:ImmutableList$Builder, var_4_86:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[expected:Object])
            var_5_B2 = initobject:Random(Random::<init>, ldc:long(1660L))
            var_6_BB = and:int(ldc:int(-27573), ldc:int(25504))
            
            while (cmplt:boolean(var_6_BB:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>)))) {
                storeelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], and:int(ldc:int(6290), ldc:int(-6292)), and:int(ldc:int(1011), ldc:int(-10228))))
                var_7_127 = mul:float(sub:float(mul:float(div:float(add:float(sub:float(i2f:float(rem:int(var_6_BB:int, and:int(ldc:int(1139), ldc:int(17035)))), mul:float(i2f:float(rem:int(div:int(var_6_BB:int, xor:int(ldc:int(8334), ldc:int(8333))), and:int(ldc:int(2306), ldc:int(35)))), ldc:float(0.5f))), ldc:float(0.25f)), ldc:float(2.0f)), ldc:float(2.0f)), ldc:float(1.0f)), ldc:float(5.0f))
                var_8_13D = mul:float(sub:float(mul:float(div:float(i2f:float(div:int(var_6_BB:int, xor:int(ldc:int(-19455), ldc:int(-19454)))), ldc:float(2.0f)), ldc:float(2.0f)), ldc:float(1.0f)), ldc:float(5.0f))
                invokevirtual:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int), ldc:float(-1.0f), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(2.0f), i2f:float(add:int(invokevirtual:int(Random::nextInt, var_5_B2:Random, ldc:int(7)), ldc:int(8))), ldc:float(2.0f))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u72f1\u5245\u12b2\u873d\u2dcc\uae5d, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int), var_7_127:float)
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u071d\u836c\uff55\ubff1\u8bb0\ubf56, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int), var_8_13D:float)
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int), ldc:float(24.6f))
                invokevirtual:ImmutableList$Builder(ImmutableList$Builder::add, var_3_6F:ImmutableList$Builder, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_6_BB:int))
                inc:int(var_6_BB, ldc:int(1))
            }
            
            putfield:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u5bc4\u7bad\u3d4b\u759a\u836c\uc84e, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>, invokevirtual:ImmutableList(ImmutableList$Builder::build, var_3_6F:ImmutableList$Builder))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(T extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3, float p4, float p5) {
        var_7_61 : int
        var_9_6A : int
        
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
            var_7_61 = and:int(ldc:int(-2145870242), ldc:int(-790198595))
            var_9_6A = and:int(ldc:int(27725), ldc:int(-27726))
            
            loop {
                var_7_61 = and:int(var_7_61:int, ldc:int(-2125953155))
                
                if (cmpge:boolean(var_9_6A:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>)))) {
                    looporswitchbreak()
                }
                
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u0b8e\u7e3f\ubff1\u9033\u9033\u416d, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>), var_9_6A:int), add:float(mul:float(ldc:float(0.2f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, add:float(mul:float(p3:float, ldc:float(0.3f)), i2f:float(var_9_6A:int)))), ldc:float(0.4f)))
                inc:int(var_9_6A, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e> \uc87f\u3711\u183a\u156b\u5fe1\uf9c5() {
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
            return:Iterable<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(getfield:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>[expected:Iterable<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>](\u0a06\uae87\u47c2\u8c8a\u946b\u516c::\u5bc4\u7bad\u3d4b\u759a\u836c\uc84e, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>))
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
    
    public void \u4975\u6198\u516c\ubcb0\u7049\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_618 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_618 = and:int(ldc:int(1105256472), ldc:int(-823078624))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\uae87\u47c2\u8c8a\u946b\u516c<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(1671340939))
            var_5_7D = and:int(ldc:int(3877), ldc:int(-3878))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14809), ldc:int(14808)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_618:int, ldc:int(1133240121))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(211), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4608), ldc:int(4609)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_618 = and:int(var_3_D2:int, ldc:int(-190272821))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(101), ldc:int(100)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1329109254))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1622155714))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-246303715))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-79581550))
                    }
                    else {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-510227894))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1983774737))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2010765776))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-363383964))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-824821487))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1231998029))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-405948386))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(398077761))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-877609058))
                        var_11_E3 = and:int(ldc:int(2982), ldc:int(-2983))
                        goto(Label_1418)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1646506350))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-289690255))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1406326152))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1621716310))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(1117781215))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-487923971))
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1136813006))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1785301705))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-392786894))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(480326999))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(959122857))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1246694533))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(1133421240))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(10545), ldc:int(5121))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-981740498))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-372121818))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1721791958))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-856738126))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-757420200))
                        var_11_E3 = and:int(ldc:int(816), ldc:int(-817))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1950562298))
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-339726021))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1466968634))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1569215973))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1948603750))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1708859991))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-893279187))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1290)
                            }
                        }
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1131492861))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-457915602))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-118829586))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(628328488))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-192825348))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1418)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1290:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(926354410))
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1763868675))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1947844626))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1519430594))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(1437764345))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1418:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_623 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1429:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1233958794))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(988427275))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(429912332))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-87309343))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(52735323))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(256)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-593164049))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1420345965))
                        var_17_623 = add:int(var_16_111:int, xor:int(ldc:int(2584), ldc:int(2585)))
                        looporswitchbreak()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(575726879))
                }
                
                var_3_618 = and:int(var_3_618:int, ldc:int(1588249213))
                
                if (cmple:boolean(var_5_7D = var_17_623:int, sub:int(var_6_84:int, xor:int(ldc:int(-15328), ldc:int(-15327))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(1179651179))
            goto(Label_0106)
        }
    }
}
