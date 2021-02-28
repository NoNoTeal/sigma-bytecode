public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4 {
    public void \u8d90\uc2bd\u6fb0\ub171\u34df\u8df4(java.lang.String p0) {
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
            invokespecial:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::<init>, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4, p0:String)
            invokevirtual:void(\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u4c04\u98a4\ud12e\u6c52\u7ce1\u3711, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\u6ec6\ub18d\u34df\u7006\u9255(float p0, float p1, float p2, float p3) {
        var_8_70 : float[]
        var_9_B2 : int
        
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
            var_8_70 = loadelement:float[](getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4), invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u8350\u7330\u392e\u446c\u3a62\u76bc, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e]))
            
            if (cmpeq:boolean(loadelement:float(var_8_70:float[], and:int(ldc:int(-19241), ldc:int(19240))), p0:float)) {
                if (cmpeq:boolean(loadelement:float(var_8_70:float[], xor:int(ldc:int(8203), ldc:int(8202))), p1:float)) {
                    if (cmpeq:boolean(loadelement:float(var_8_70:float[], xor:int(ldc:int(-32256), ldc:int(-32254))), p2:float)) {
                        if (cmpeq:boolean(loadelement:float(var_8_70:float[], xor:int(ldc:int(1), ldc:int(2))), p3:float)) {
                            return:void()
                        }
                    }
                }
            }
            
            storeelement:float(var_8_70:float[], and:int(ldc:int(-10511), ldc:int(10508)), p0:float)
            storeelement:float(var_8_70:float[], xor:int(ldc:int(48), ldc:int(49)), p1:float)
            storeelement:float(var_8_70:float[], xor:int(ldc:int(304), ldc:int(306)), p2:float)
            storeelement:float(var_8_70:float[], xor:int(ldc:int(130), ldc:int(129)), p3:float)
            var_9_B2 = invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u93a2\u71ae\ua068\uc910\u8cae\u416d, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
            
            if (cmpge:boolean(var_9_B2:int, ldc:int(0))) {
                invokestatic:void(\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\ua068\u446c\u071d\u8d98\uc84e\u120d)
                invokestatic:void(ARBShaderObjects::glUniform4fARB, var_9_B2:int, p0:float, p1:float, p2:float, p3:float)
                invokevirtual:void(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u9a18\u0c95\u93a2\uc910\uc7fe\u8bb0, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float[] \u3bd6\ub7dc\u5f50\u64f2\u7e3f\ucb79() {
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
            return:float[](loadelement:float[](getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4), invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u8350\u7330\u392e\u446c\u3a62\u76bc, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])))
        }
        
        goto(Label_0006)
    }
    
    public void \u9af2\u446c\u6bb9\ua562\u494c\u527a(int p0) {
        var_4_85 : float[][]
        var_5_8E : float[][]
        stack_EF_0 : float[][] [generated]
        expr_C1 : float[] [generated]
        
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
            
            if (cmpge:boolean(p0:int, arraylength:int(getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)))) {
                var_4_85 = getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)
                var_5_8E = newarray:float[][](float[].class, add:int(p0:int, ldc:int(10)))
                invokestatic:void(System::arraycopy, var_4_85:float[][][expected:Object], and:int(ldc:int(23067), ldc:int(-23136)), var_5_8E:float[][][expected:Object], and:int(ldc:int(7696), ldc:int(-7697)), arraylength:int(var_4_85:float[][]))
                putfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4, var_5_8E:float[][])
            }
            
            if (cmpeq:boolean(loadelement:float[](getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4), p0:int), aconstnull:float[]())) {
                stack_EF_0 = getfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)
                expr_C1 = newarray:float[](float.class, xor:int(ldc:int(17026), ldc:int(17030)))
                storeelement:float(expr_C1:float[], xor:int(ldc:int(2344), ldc:int(2345)), storeelement:float(expr_C1:float[], and:int(ldc:int(-9058), ldc:int(9057)), ldc:float(-3.4028235E38f)))
                storeelement:float(expr_C1:float[], and:int(ldc:int(71), ldc:int(13579)), storeelement:float(expr_C1:float[], and:int(ldc:int(307), ldc:int(7754)), ldc:float(-3.4028235E38f)))
                storeelement:float[](stack_EF_0:float[][], p0:int, expr_C1:float[])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u98a4\ud12e\u6c52\u7ce1\u3711() {
        expr_68 : float[][] [generated]
        stack_A8_1 : int [generated]
        expr_7A : float[] [generated]
        
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
            expr_68 = newarray:float[][](float[].class, and:int(ldc:int(41), ldc:int(273)))
            stack_A8_1 = and:int(ldc:int(-3607), ldc:int(3602))
            expr_7A = newarray:float[](float.class, and:int(ldc:int(18436), ldc:int(1574)))
            storeelement:float(expr_7A:float[], xor:int(ldc:int(4674), ldc:int(4675)), storeelement:float(expr_7A:float[], and:int(ldc:int(17640), ldc:int(-17657)), ldc:float(-3.4028235E38f)))
            storeelement:float(expr_7A:float[], xor:int(ldc:int(16384), ldc:int(16387)), storeelement:float(expr_7A:float[], and:int(ldc:int(2147), ldc:int(5906)), ldc:float(-3.4028235E38f)))
            storeelement:float[](expr_68:float[][], stack_A8_1:int, expr_7A:float[])
            putfield:float[][](\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::\u385b\u56bd\u8d90\u7006\u51b2\u99f7, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4, expr_68:float[][])
            return:void()
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
    
    public void \ub7dc\u8308\u7049\u3776\uafe7\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(-1254364337), ldc:int(-218123265))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1639993633))
            var_5_7D = and:int(ldc:int(-11000), ldc:int(2279))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18462), ldc:int(-18463)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(1560079487))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(2681), ldc:int(4099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(2572), ldc:int(2573)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(989848799))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17417), ldc:int(17416)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1572458215))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(76300306))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-673119270))
                    }
                    else {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1838618289))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2128082930))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-197565775))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1276231841))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2090486546))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1210034131))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1315558922))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1568535503))
                        var_11_DB = and:int(ldc:int(1571), ldc:int(-3876))
                        goto(Label_1399)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2077924697))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1531424239))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-811283298))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1222537526))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1643670089))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1067561230))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(368944879))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-380166572))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(46854179))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1058817972))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(470664526))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1624315409))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1779932381))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2089810554))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2112638527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-139526801))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-26616), ldc:int(-26615))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-566413592))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-829709478))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1873928271))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1406299602))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1145444385))
                        var_11_DB = and:int(ldc:int(19024), ldc:int(-19411))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2085873391))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1479634764))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-959333561))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1838158257))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1936373812))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-476474605))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(519129800))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1437684780))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(971810321))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1326925361))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1399)
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1869076494))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(854296043))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(991205017))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(989088460))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-788823879))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-763447681))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2120908795))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(586984238))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1070873486))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1911761857))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1556014299))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1845566465))
                        var_17_5F8 = add:int(var_16_109:int, and:int(ldc:int(18081), ldc:int(2119)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-605296801))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, xor:int(ldc:int(-16367), ldc:int(-16368))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
