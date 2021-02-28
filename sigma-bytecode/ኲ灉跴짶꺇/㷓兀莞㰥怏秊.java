public class \u12b2\u7049\u8df4\uc9f6\uae87.\u3dd3\u5140\u839e\u3c25\u600f\uf995 {
    public void \u3dd3\u5140\u839e\u3c25\u600f\uf995(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5db4\u3e75\u960f\u0a06\u1833\u3e2a p0) {
        var_4_8A : int
        var_5_93 : int
        var_6_AE : float
        var_7_B1 : float
        var_8_BA : int
        var_9_F8 : float[]
        var_6_D5 : float
        var_7_DC : float
        var_8_E5 : int
        var_9_14C : int
        var_10_168 : float[]
        var_11_174 : float[]
        var_8_139 : int
        var_9_2DF : int
        var_10_2FB : float[]
        var_11_307 : float[]
        
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
            invokespecial:Object(Object::<init>, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995)
            putfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995, multianewarray:float[][](float[][].class, mul:int(mul:int(invokeinterface:int(\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u3e75\uf995\u3dd3\u74b1\u8308\u7330, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a), ldc:int(6)), and:int(ldc:int(17551), ldc:int(515))), and:int(ldc:int(7270), ldc:int(24834))))
            var_4_8A = and:int(ldc:int(2669), ldc:int(-11888))
            var_5_93 = and:int(ldc:int(6454), ldc:int(-6455))
            
            while (cmplt:boolean(var_5_93:int, invokeinterface:int(\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u3e75\uf995\u3dd3\u74b1\u8308\u7330, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a))) {
                var_6_AE = ldc:float(0.0f)
                var_7_B1 = ldc:float(0.0f)
                var_8_BA = and:int(ldc:int(-377), ldc:int(376))
                
                while (cmplt:boolean(var_8_BA:int, xor:int(ldc:int(280), ldc:int(283)))) {
                    var_9_F8 = invokeinterface:float[](\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u6198\u1833\uc9f6\u6ec6\u4179\uc84e, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a, var_5_93:int, var_8_BA:int)
                    var_6_AE = add:float(var_6_AE:float, loadelement:float(var_9_F8:float[], and:int(ldc:int(13137), ldc:int(-13138))))
                    var_7_B1 = add:float(var_7_B1:float, loadelement:float(var_9_F8:float[], and:int(ldc:int(6177), ldc:int(1793))))
                    inc:int(var_8_BA, ldc:int(1))
                }
                
                var_6_D5 = div:float(var_6_AE:float, ldc:float(3.0f))
                var_7_DC = div:float(var_7_B1:float, ldc:float(3.0f))
                var_8_E5 = and:int(ldc:int(14374), ldc:int(-14903))
                
                while (cmplt:boolean(var_8_E5:int, xor:int(ldc:int(-32764), ldc:int(-32761)))) {
                    var_9_14C = add:int(var_8_E5:int, and:int(ldc:int(5409), ldc:int(2055)))
                    
                    if (cmpgt:boolean(var_9_14C:int, and:int(ldc:int(2051), ldc:int(1554)))) {
                        var_9_14C = and:int(ldc:int(6374), ldc:int(-7919))
                    }
                    
                    var_10_168 = invokeinterface:float[](\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u6198\u1833\uc9f6\u6ec6\u4179\uc84e, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a, var_5_93:int, var_8_E5:int)
                    var_11_174 = invokeinterface:float[](\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u6198\u1833\uc9f6\u6ec6\u4179\uc84e, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a, var_5_93:int, var_9_14C:int)
                    storeelement:float(var_10_168:float[], and:int(ldc:int(-27068), ldc:int(2459)), div:float(add:float(loadelement:float(var_10_168:float[], and:int(ldc:int(13826), ldc:int(-13827))), loadelement:float(var_11_174:float[], and:int(ldc:int(3424), ldc:int(-3425)))), ldc:float(2.0f)))
                    storeelement:float(var_10_168:float[], and:int(ldc:int(641), ldc:int(6145)), div:float(add:float(loadelement:float(var_10_168:float[], and:int(ldc:int(1), ldc:int(16417))), loadelement:float(var_11_174:float[], xor:int(ldc:int(-16248), ldc:int(-16247)))), ldc:float(2.0f)))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(1555), ldc:int(1552))), and:int(ldc:int(20262), ldc:int(-20399)))), and:int(ldc:int(6187), ldc:int(-6188)), var_6_D5:float)
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, and:int(ldc:int(17307), ldc:int(11271))), and:int(ldc:int(-27487), ldc:int(27486)))), xor:int(ldc:int(18945), ldc:int(18944)), var_7_DC:float)
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(16579), ldc:int(16576))), and:int(ldc:int(365), ldc:int(2561)))), and:int(ldc:int(23058), ldc:int(-24091)), loadelement:float(var_10_168:float[], and:int(ldc:int(2334), ldc:int(-2335))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(-32224), ldc:int(-32221))), xor:int(ldc:int(8208), ldc:int(8209)))), xor:int(ldc:int(-12160), ldc:int(-12159)), loadelement:float(var_10_168:float[], xor:int(ldc:int(96), ldc:int(97))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(24611), ldc:int(24608))), and:int(ldc:int(26707), ldc:int(1030)))), and:int(ldc:int(-9743), ldc:int(9742)), loadelement:float(var_11_174:float[], and:int(ldc:int(-1658), ldc:int(1657))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, and:int(ldc:int(71), ldc:int(17171))), and:int(ldc:int(34), ldc:int(5194)))), xor:int(ldc:int(23552), ldc:int(23553)), loadelement:float(var_11_174:float[], and:int(ldc:int(11281), ldc:int(20993))))
                    inc:int(var_4_8A, ldc:int(1))
                    inc:int(var_8_E5, ldc:int(1))
                }
                
                var_8_139 = and:int(ldc:int(14852), ldc:int(-15878))
                
                while (cmplt:boolean(var_8_139:int, xor:int(ldc:int(4630), ldc:int(4629)))) {
                    var_9_2DF = add:int(var_8_139:int, xor:int(ldc:int(4160), ldc:int(4161)))
                    
                    if (cmpgt:boolean(var_9_2DF:int, and:int(ldc:int(386), ldc:int(29706)))) {
                        var_9_2DF = and:int(ldc:int(11805), ldc:int(-11806))
                    }
                    
                    var_10_2FB = invokeinterface:float[](\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u6198\u1833\uc9f6\u6ec6\u4179\uc84e, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a, var_5_93:int, var_8_139:int)
                    var_11_307 = invokeinterface:float[](\u5db4\u3e75\u960f\u0a06\u1833\u3e2a::\u6198\u1833\uc9f6\u6ec6\u4179\uc84e, p0:\u5db4\u3e75\u960f\u0a06\u1833\u3e2a, var_5_93:int, var_9_2DF:int)
                    storeelement:float(var_11_307:float[], and:int(ldc:int(-13679), ldc:int(5482)), div:float(add:float(loadelement:float(var_10_2FB:float[], and:int(ldc:int(-9977), ldc:int(9944))), loadelement:float(var_11_307:float[], and:int(ldc:int(-1360), ldc:int(331)))), ldc:float(2.0f)))
                    storeelement:float(var_11_307:float[], xor:int(ldc:int(8304), ldc:int(8305)), div:float(add:float(loadelement:float(var_10_2FB:float[], and:int(ldc:int(16515), ldc:int(317))), loadelement:float(var_11_307:float[], xor:int(ldc:int(7176), ldc:int(7177)))), ldc:float(2.0f)))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, and:int(ldc:int(71), ldc:int(28291))), and:int(ldc:int(-14741), ldc:int(10628)))), and:int(ldc:int(16903), ldc:int(-16904)), var_6_D5:float)
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(20996), ldc:int(20999))), and:int(ldc:int(19459), ldc:int(-23560)))), xor:int(ldc:int(16705), ldc:int(16704)), var_7_DC:float)
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, and:int(ldc:int(3075), ldc:int(16835))), xor:int(ldc:int(1028), ldc:int(1029)))), and:int(ldc:int(2804), ldc:int(-7157)), loadelement:float(var_10_2FB:float[], and:int(ldc:int(2193), ldc:int(-2194))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, and:int(ldc:int(2731), ldc:int(8515))), xor:int(ldc:int(-15864), ldc:int(-15863)))), and:int(ldc:int(5083), ldc:int(16417)), loadelement:float(var_10_2FB:float[], and:int(ldc:int(1537), ldc:int(20737))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(4609), ldc:int(4610))), xor:int(ldc:int(1056), ldc:int(1058)))), and:int(ldc:int(30932), ldc:int(-30942)), loadelement:float(var_11_307:float[], and:int(ldc:int(22609), ldc:int(-22610))))
                    storeelement:float(loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(var_4_8A:int, xor:int(ldc:int(688), ldc:int(691))), xor:int(ldc:int(512), ldc:int(514)))), and:int(ldc:int(17433), ldc:int(8611)), loadelement:float(var_11_307:float[], xor:int(ldc:int(-16319), ldc:int(-16320))))
                    inc:int(var_4_8A, ldc:int(1))
                    inc:int(var_8_139, ldc:int(1))
                }
                
                inc:int(var_5_93, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\ucfaf\u7ce1\u4179\u64ab\u0a06(float p0, float p1) {
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
    
    public int \u3e75\uf995\u3dd3\u74b1\u8308\u7330() {
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
            return:int(div:int(arraylength:int(getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995)), and:int(ldc:int(131), ldc:int(16651))))
        }
        
        goto(Label_0006)
    }
    
    public float[] \u6198\u1833\uc9f6\u6ec6\u4179\uc84e(int p0, int p1) {
        var_5_70 : float[]
        expr_79 : float[] [generated]
        
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
            var_5_70 = loadelement:float[](getfield:float[][](\u3dd3\u5140\u839e\u3c25\u600f\uf995::\u64f2\u7873\ud217\u76bc\u67e9\ub32d, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995), add:int(mul:int(p0:int, xor:int(ldc:int(550), ldc:int(549))), p1:int))
            expr_79 = newarray:float[](float.class, xor:int(ldc:int(-20475), ldc:int(-20473)))
            storeelement:float(expr_79:float[], and:int(ldc:int(8935), ldc:int(-25320)), loadelement:float(var_5_70:float[], and:int(ldc:int(-7923), ldc:int(5362))))
            storeelement:float(expr_79:float[], xor:int(ldc:int(-20224), ldc:int(-20223)), loadelement:float(var_5_70:float[], xor:int(ldc:int(2112), ldc:int(2113))))
            return:float[](expr_79:float[])
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u960f\u12b2\ud217\u4975\u3776() {
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
    
    public boolean \uc7fe\u4492\ube23\u5245\u7bad\u965f() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(260), ldc:int(261)))
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
    
    public void \u071d\u4179\u0a06\u718f\ub102\ub113(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(-89142088), ldc:int(1218291834))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3dd3\u5140\u839e\u3c25\u600f\uf995[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-431754488))
        }
        else {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-24257602))
            var_5_85 = and:int(ldc:int(-6318), ldc:int(6317))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24614), ldc:int(-24615)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63D:int, ldc:int(2120871547))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-15868), ldc:int(-15867)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(3), ldc:int(1097)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_D2:int, ldc:int(-44463687))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8711), ldc:int(18721)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(908912441))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-267153879))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1013092752))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1631594713))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1611571884))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1697866536))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2045348729))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1094956622))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1088871984))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-689393911))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-154785157))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1526962746))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-857737030))
                        var_11_E3 = and:int(ldc:int(30792), ldc:int(-30825))
                        goto(Label_1455)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(615246600))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-2004370483))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1197298412))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1223195078))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-620118150))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(708948547))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-939007677))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2116450157))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1181692515))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(644039133))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-565366207))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-648171526))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1950919962))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2059791485))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2082110625))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1560477621))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(746013410))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(2146990350))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1731682892))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2089810488))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(8231), ldc:int(1153))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-264140172))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1388436994))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1078566885))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1361946704))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-250565985))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-81949383))
                        var_11_E3 = and:int(ldc:int(356), ldc:int(-357))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(166011456))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1050723032))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-124806406))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1562137366))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1464907716))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(705792925))
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(779859653))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1522413630))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1418189770))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-903219140))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(656030490))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2068837038))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1163083987))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(274648027))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(2024668665))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1475211825))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-590624939))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(711834458))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-972942701))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-2009599316))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1834020739))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(581053879))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2065561848))
                        var_17_648 = add:int(var_16_111:int, and:int(ldc:int(8227), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(1091015800))
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(1233750783))
                
                if (cmple:boolean(var_5_85 = var_17_648:int, sub:int(var_6_8C:int, xor:int(ldc:int(10816), ldc:int(10817))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
