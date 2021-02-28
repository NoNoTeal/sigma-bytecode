public final class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7c6b\u8bb0\u120d\u6435\uc9f6 {
    public void \u7c6b\u8bb0\u120d\u6435\uc9f6(java.util.Random p0) {
        var_4_9B : int
        var_4_B8 : int
        var_5_F8 : int
        var_6_101 : byte
        
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
            invokespecial:Object(Object::<init>, this:\u7c6b\u8bb0\u120d\u6435\uc9f6)
            putfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc3e3\uc3e3\ufcaf\u0c95\u9a18\u3d4b, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            putfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\ufe34\u873d\ud12e\uceb8\u4e72\u120d, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            putfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u4d85\ud4fe\u385b\u4c2b\u7ce1\u624e, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            putfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, newarray:byte[](byte.class, xor:int(ldc:int(20574), ldc:int(20830))))
            var_4_9B = and:int(ldc:int(-13949), ldc:int(13420))
            
            while (cmplt:boolean(var_4_9B:int, and:int(ldc:int(396), ldc:int(22353)))) {
                storeelement:byte(getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), var_4_9B:int, i2b:byte(var_4_9B:int))
                inc:int(var_4_9B, ldc:int(1))
            }
            
            var_4_B8 = and:int(ldc:int(-23399), ldc:int(17254))
            
            while (cmplt:boolean(var_4_B8:int, xor:int(ldc:int(-31750), ldc:int(-32006)))) {
                var_5_F8 = invokevirtual:int(Random::nextInt, p0:Random, sub:int(and:int(ldc:int(3880), ldc:int(16838)), var_4_B8:int))
                var_6_101 = loadelement:byte(getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), var_4_B8:int)
                storeelement:byte(getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), var_4_B8:int, loadelement:byte(getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), add:int(var_4_B8:int, var_5_F8:int)))
                storeelement:byte(getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), add:int(var_4_B8:int, var_5_F8:int), var_6_101:byte)
                inc:int(var_4_B8, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public double \u7873\u3711\u99f7\u64ab\uc87f\ub6ab(double p0, double p1, double p2, double p3, double p4) {
        var_11_61 : int
        var_13_69 : double
        var_15_71 : double
        var_17_7A : double
        var_19_81 : int
        var_20_88 : int
        var_21_8F : int
        var_22_97 : double
        var_24_9F : double
        var_26_A7 : double
        var_28_AE : double
        var_30_B5 : double
        var_32_BC : double
        var_34_CD : double
        
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
            var_11_61 = and:int(ldc:int(-741143624), ldc:int(-1141489817))
            var_13_69 = add:double(p0:double, getfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc3e3\uc3e3\ufcaf\u0c95\u9a18\u3d4b, this:\u7c6b\u8bb0\u120d\u6435\uc9f6))
            var_15_71 = add:double(p1:double, getfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\ufe34\u873d\ud12e\uceb8\u4e72\u120d, this:\u7c6b\u8bb0\u120d\u6435\uc9f6))
            var_17_7A = add:double(p2:double, getfield:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u4d85\ud4fe\u385b\u4c2b\u7ce1\u624e, this:\u7c6b\u8bb0\u120d\u6435\uc9f6))
            var_19_81 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_13_69:double)
            var_20_88 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_15_71:double)
            var_21_8F = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_17_7A:double)
            var_22_97 = sub:double(var_13_69:double, i2d:double(var_19_81:int))
            var_24_9F = sub:double(var_15_71:double, i2d:double(var_20_88:int))
            var_26_A7 = sub:double(var_17_7A:double, i2d:double(var_21_8F:int))
            var_28_AE = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u34df\ucb79\ube23\u983f\u4d85\u56bd, var_22_97:double)
            var_30_B5 = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u34df\ucb79\ube23\u983f\u4d85\u56bd, var_24_9F:double)
            var_32_BC = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u34df\ucb79\ube23\u983f\u4d85\u56bd, var_26_A7:double)
            
            if (cmpeq:boolean(p3:double, ldc:double(0.0))) {
                var_11_61 = and:int(var_11_61:int, ldc:int(-739087943))
                var_34_CD = ldc:double(0.0)
            }
            else {
                var_34_CD = mul:double(i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokestatic:double(Math::min, p4:double, var_24_9F:double), p3:double))), p3:double)
            }
            
            return:double(invokevirtual:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\ucb79\u72f1\u5245\uc910\u1833\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_19_81:int, var_20_88:int, var_21_8F:int, var_22_97:double, sub:double(var_24_9F:double, var_34_CD:double), var_26_A7:double, var_28_AE:double, var_30_B5:double, var_32_BC:double))
        }
        
        goto(Label_0006)
    }
    
    private static double \u960f\uc3e3\u6ec6\u6c56\u3776\ubded(int p0, double p1, double p2, double p3) {
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
            return:double(invokestatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9255\u494c\u6b0d\u5654\u7049\u3776, loadelement:int[](getstatic:int[][](\u7049\u56bd\uc29a\u7873\ucb79::\u4ab3\u8df4\u51b2\u7043\ubefe\ufe34), and:int(p0:int, ldc:int(15))), p1:double, p2:double, p3:double))
        }
        
        goto(Label_0006)
    }
    
    private int \uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5(int p0) {
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
            return:int(and:int(loadelement:byte[expected:int](getfield:byte[](\u7c6b\u8bb0\u120d\u6435\uc9f6::\u494c\u446c\u9255\u647c\uc246\ua562, this:\u7c6b\u8bb0\u120d\u6435\uc9f6), and:int(p0:int, xor:int(ldc:int(-26378), ldc:int(-26615)))), xor:int(ldc:int(12376), ldc:int(12455))))
        }
        
        goto(Label_0006)
    }
    
    public double \ucb79\u72f1\u5245\uc910\u1833\ua562(int p0, int p1, int p2, double p3, double p4, double p5, double p6, double p7, double p8) {
        var_18_6A : int
        var_19_74 : int
        var_20_86 : int
        var_21_97 : int
        var_22_A1 : int
        var_23_B3 : int
        
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
            var_18_6A = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, p0:int), p1:int)
            var_19_74 = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_18_6A:int), p2:int)
            var_20_86 = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_18_6A:int, and:int(ldc:int(4491), ldc:int(513)))), p2:int)
            var_21_97 = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(p0:int, and:int(ldc:int(16487), ldc:int(257)))), p1:int)
            var_22_A1 = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_21_97:int), p2:int)
            var_23_B3 = add:int(invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_21_97:int, and:int(ldc:int(18307), ldc:int(2053)))), p2:int)
            return:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u5bc4\u69d9\ub19c\u527a\u2dcc\u3bc9, p6:double, p7:double, p8:double, invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_19_74:int), p3:double, p4:double, p5:double), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_22_A1:int), sub:double(p3:double, ldc:double(1.0)), p4:double, p5:double), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_20_86:int), p3:double, sub:double(p4:double, ldc:double(1.0)), p5:double), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, var_23_B3:int), sub:double(p3:double, ldc:double(1.0)), sub:double(p4:double, ldc:double(1.0)), p5:double), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_19_74:int, and:int(ldc:int(10629), ldc:int(16425)))), p3:double, p4:double, sub:double(p5:double, ldc:double(1.0))), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_22_A1:int, xor:int(ldc:int(2369), ldc:int(2368)))), sub:double(p3:double, ldc:double(1.0)), p4:double, sub:double(p5:double, ldc:double(1.0))), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_20_86:int, xor:int(ldc:int(9284), ldc:int(9285)))), p3:double, sub:double(p4:double, ldc:double(1.0)), sub:double(p5:double, ldc:double(1.0))), invokestatic:double(\u7c6b\u8bb0\u120d\u6435\uc9f6::\u960f\uc3e3\u6ec6\u6c56\u3776\ubded, invokespecial:int(\u7c6b\u8bb0\u120d\u6435\uc9f6::\uc9f6\u7c6b\u4cd9\ube23\ud171\uf9c5, this:\u7c6b\u8bb0\u120d\u6435\uc9f6, add:int(var_23_B3:int, and:int(ldc:int(16641), ldc:int(87)))), sub:double(p3:double, ldc:double(1.0)), sub:double(p4:double, ldc:double(1.0)), sub:double(p5:double, ldc:double(1.0)))))
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
    
    public void \ucb79\u7ce1\u67d0\u99f7\u59ec\u839e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D9 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E4 : int
        
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
        var_3_5D9 = and:int(ldc:int(926602207), ldc:int(393995774))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u8bb0\u120d\u6435\uc9f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-80352222))
        }
        else {
            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-536938661))
            var_5_85 = and:int(ldc:int(-30171), ldc:int(13402))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8301), ldc:int(-12398)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D9:int, ldc:int(-1757815457))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4611), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-31708), ldc:int(-31707)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D9 = and:int(var_3_D2:int, ldc:int(-2034435110))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(389), ldc:int(23657)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1338925127))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(864006393))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-424018561))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1969188485))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1061434557))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1962917597))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(243702974))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(2137195801))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1484585697))
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(641724890))
                        var_11_E3 = and:int(ldc:int(5281), ldc:int(-13478))
                        goto(Label_1391)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(514079703))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1063715569))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(530220851))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(830740571))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1964982385))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(551465008))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1615272582))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-303403764))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-915178327))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(615599236))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(536783227))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-410789269))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1056586950))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(948585916))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-679751718))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-22524), ldc:int(-22523))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-643541610))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-143278323))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1677803816))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(360647496))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1637110778))
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-12993669))
                        var_11_E3 = and:int(ldc:int(-12717), ldc:int(12716))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1001777911))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1300627130))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1485637198))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1482873047))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1060752346))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-556597418))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1929875828))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1891552551))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D9 = and:int(var_3_5D9:int, ldc:int(112887802))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-353975308))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(853941519))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1083577650))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-2052171361))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-579553719))
                        loopcontinue()
                    }
                    
                    var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1614944801))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E4 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1611345592))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-1919404001))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(1311113621))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D9 = and:int(var_3_5D9:int, ldc:int(658152283))
                        var_17_5E4 = add:int(var_16_111:int, xor:int(ldc:int(-26608), ldc:int(-26607)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D9 = and:int(var_3_5D9:int, ldc:int(-826504326))
                
                if (cmple:boolean(var_5_85 = var_17_5E4:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32701), ldc:int(-32702))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5D9:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
