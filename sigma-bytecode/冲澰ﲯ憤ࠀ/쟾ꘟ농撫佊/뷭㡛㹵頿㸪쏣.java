public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ubded\u385b\u3e75\u983f\u3e2a\uc3e3 {
    private void \ubded\u385b\u3e75\u983f\u3e2a\uc3e3(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7) {
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u3bd6\u97e6\u156b\u718f\u385b\u72f1::\ud7e8\u12b2\u64ab\ub171\uc246\u7873, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3[expected:\u3bd6\u97e6\u156b\u718f\u385b\u72f1], ldc:float(3.0f))
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3c25\u5245\u7af6\u8413\ub102\u8753, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.25f), ldc:float(0.25f))
            
            if (logicalnot:boolean(p7:boolean)) {
                putfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:int(invokevirtual:int(Random::nextInt, getfield:Random(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:int(50)), ldc:int(80)))
            }
            else {
                putfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:int(invokevirtual:int(Random::nextInt, getfield:Random(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:int(50)), xor:int(ldc:int(-28594), ldc:int(-28330))))
            }
            
            putfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u1187\u9a18\u5140\u6ec6\u4492\ua6bd, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, ldc:float(3.0E-6f))
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, p4:double)
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:double(p5:double, f2d:double(div:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3)), ldc:float(500.0f)))))
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, p6:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_D4 : int
        expr_7A : int [generated]
        stack_14B_0 : \ubded\u385b\u3e75\u983f\u3e2a\uc3e3 [generated]
        stack_FC_0 : \ubded\u385b\u3e75\u983f\u3e2a\uc3e3 [generated]
        stack_14A_0 : double [generated]
        stack_FB_0 : double [generated]
        stack_148_0 : float [generated]
        stack_F9_0 : float [generated]
        stack_147_0 : int [generated]
        stack_F8_0 : int [generated]
        
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
            var_1_D4 = and:int(ldc:int(-223159348), ldc:int(-71868433))
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))
            putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))
            expr_7A = getfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3)
            putfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:int(expr_7A:int, xor:int(ldc:int(20504), ldc:int(20505))))
            
            if (logicaland:boolean(cmplt:boolean(expr_7A:int, getfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3)), cmpgt:boolean(getfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub32d\u3d64\u5f50\u6fb0\u836c\u5f50, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:float(0.0f)))) {
                stack_14B_0 = this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3
                stack_FC_0 = this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3
                stack_14A_0 = stack_FB_0 = getfield(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this)
                stack_148_0 = stack_F9_0 = div(invokevirtual(Random::nextFloat, getfield(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this)), ldc(5000.0f))
                
                if (invokevirtual:boolean(Random::nextBoolean, getfield:Random(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))) {
                    stack_147_0 = stack_F8_0 = xor(ldc(130), ldc(131))
                    goto(Label_0228)
                }
                
                Label_0201:
                
                if (cmpeq:boolean(and:int(var_1_D4:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0280)
                }
                
                var_1_D4 = and:int(var_1_D4:int, ldc:int(-22642689))
                stack_147_0 = stack_F8_0 = ldc(-1)
                Label_0228:
                
                if (cmpeq:boolean(and:int(var_1_D4:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_D4 = and:int(var_1_D4:int, ldc:int(-204340591))
                    goto(Label_0315)
                }
                
                var_1_D4 = and:int(var_1_D4:int, ldc:int(-488481812))
                putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uc238\u839e\u3bc9\u446c\u9af2\uf995, stack_FC_0:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:double(stack_FB_0:double, f2d:double(mul:float(stack_F9_0:float, i2f:float(stack_F8_0:int)))))
                stack_14B_0 = this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3
                stack_FC_0 = this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3
                stack_14A_0 = stack_FB_0 = getfield(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub18d\u839e\uc910\u7043\u59ec\u839e, this)
                stack_148_0 = stack_F9_0 = div(invokevirtual(Random::nextFloat, getfield(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this)), ldc(5000.0f))
                
                if (invokevirtual:boolean(Random::nextBoolean, getfield:Random(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))) {
                    stack_147_0 = stack_F8_0 = and(ldc(1057), ldc(3))
                    goto(Label_0315)
                }
                
                Label_0280:
                
                if (cmpeq:boolean(and:int(var_1_D4:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_D4 = and:int(var_1_D4:int, ldc:int(883681059))
                    goto(Label_0201)
                }
                
                var_1_D4 = and:int(var_1_D4:int, ldc:int(-692413457))
                stack_147_0 = stack_F8_0 = ldc(-1)
                Label_0315:
                
                if (cmpeq:boolean(and:int(var_1_D4:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0228)
                }
                
                putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub18d\u839e\uc910\u7043\u59ec\u839e, stack_14B_0:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, add:double(stack_14A_0:double, f2d:double(mul:float(stack_148_0:float, i2f:float(stack_147_0:int)))))
                putfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, sub:double(getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), f2d:double(getfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u1187\u9a18\u5140\u6ec6\u4492\ua6bd, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), getfield:double(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3))
                
                if (cmpge:boolean(getfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), sub:int(getfield:int(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:int(60)))) {
                    if (cmpgt:boolean(getfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub32d\u3d64\u5f50\u6fb0\u836c\u5f50, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:float(0.01f))) {
                        putfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub32d\u3d64\u5f50\u6fb0\u836c\u5f50, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, sub:float(getfield:float(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::\ub32d\u3d64\u5f50\u6fb0\u836c\u5f50, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3), ldc:float(0.015f)))
                    }
                }
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\u3504\u718f\u5bc4\ud51e\ufe34 \u3d64\ud523\uae5d\ud51e\u120d\u8c8a() {
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
            return:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(getstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\u76bc\ud12e\u527a\u8d90\u8df4\ubefe))
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u385b\u3e75\u983f\u3e2a\uc3e3(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, boolean p7, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u5140\ucb79\ub19c\uae5d\u0800\u8640 p8) {
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
            invokespecial:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3(\ubded\u385b\u3e75\u983f\u3e2a\uc3e3::<init>, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double, p7:boolean)
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
    
    public void \u8c8a\u5140\ub8be\u760c\u7af6\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(1798006341), ldc:int(-1347209276))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u385b\u3e75\u983f\u3e2a\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1556331147))
        }
        else {
            var_3_641 = and:int(var_3_641:int, ldc:int(-281922587))
            var_5_85 = and:int(ldc:int(-5805), ldc:int(5804))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16133), ldc:int(16132)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_641:int, ldc:int(-270123153))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(2704), ldc:int(2705)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(264), ldc:int(265)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D2:int, ldc:int(2074830788))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-24567), ldc:int(-24568)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1079615363))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-405788746))
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(517854083))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(737306213))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(871458541))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1910478011))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1414826330))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(774104446))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-829224624))
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-807074125))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-366433865))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1344081314))
                        var_11_E3 = and:int(ldc:int(-30494), ldc:int(18193))
                        goto(Label_1495)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1826275809))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1483581547))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-273272235))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-684020765))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-809836868))
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2051850986))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1812392668))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1575280295))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1077986363))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0779:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(139456281))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-174158978))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1361909638))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1262070759))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-832219366))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-353198601))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1431151352))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1083443516))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(9265), ldc:int(16713))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0923:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0779)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1422368040))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1500440790))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(992440287))
                        var_11_E3 = and:int(ldc:int(-6261), ldc:int(6260))
                    }
                    
                    Label_1058:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1440240168))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-976146548))
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0923)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-411027146))
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-799058109))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-77383948))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1331)
                            }
                        }
                    }
                    
                    Label_1175:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1624063204))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(309432473))
                            goto(Label_1058)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0923)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1073657015))
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(133733995))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(953790330))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-471378809))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2125741937))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1063692157))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1495)
                    }
                    
                    Label_1331:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2063127481))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(564249488))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1749407463))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(563615645))
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(805329155))
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1600208737))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1112822896))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-96599322))
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(1874784103))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1495:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1506:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(719444387))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-573006032))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1441789911))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1060549197))
                        var_17_64C = add:int(var_16_111:int, xor:int(ldc:int(27136), ldc:int(27137)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-5047724))
                
                if (cmple:boolean(var_5_85 = var_17_64C:int, sub:int(var_6_8C:int, xor:int(ldc:int(-26560), ldc:int(-26559))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
