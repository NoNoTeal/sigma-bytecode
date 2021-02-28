public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u67e9\ucef1\u74b1\u392e\u6bb9 {
    public void \u67e9\ucef1\u74b1\u392e\u6bb9() {
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
            invokespecial:Object(Object::<init>, this:\u67e9\ucef1\u74b1\u392e\u6bb9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.DoubleArgumentType p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
        var_3_5F : int
        stack_8A_0 : int [generated]
        var_3_89 : int
        var_5_8A : int
        stack_B6_0 : int [generated]
        var_6_B6 : int
        
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
            var_3_5F = and:int(ldc:int(-846859648), ldc:int(-608311403))
            
            if (cmpeq:boolean(invokevirtual:double(DoubleArgumentType::getMinimum, p0:DoubleArgumentType), ldc:double(-1.7976931348623157E308))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-108007728))
                stack_8A_0 = and:int(ldc:int(4135), ldc:int(-6696))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(1218), ldc:int(1219))
            }
            
            var_3_89 = and:int(var_3_5F:int, ldc:int(-573573431))
            var_5_8A = stack_8A_0:int
            
            if (cmpeq:boolean(invokevirtual:double(DoubleArgumentType::getMaximum, p0:DoubleArgumentType), ldc:double(1.7976931348623157E308))) {
                var_3_89 = and:int(var_3_89:int, ldc:int(-808454496))
                stack_B6_0 = and:int(ldc:int(25464), ldc:int(-25467))
            }
            else {
                stack_B6_0 = and:int(ldc:int(18709), ldc:int(651))
            }
            
            var_6_B6 = stack_B6_0:int
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokestatic:byte(\u3a62\uc31c\ubded\u8cae\u99f7::\ua068\u5654\u494c\uc84e\u5245\u8c8a, var_5_8A:boolean, var_6_B6:boolean))
            
            if (var_5_8A:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeDouble, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:double(DoubleArgumentType::getMinimum, p0:DoubleArgumentType))
            }
            
            if (var_6_B6:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeDouble, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:double(DoubleArgumentType::getMaximum, p0:DoubleArgumentType))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.brigadier.arguments.DoubleArgumentType \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_64 : byte
        stack_86_0 : double [generated]
        var_2_85 : int
        var_5_86 : double
        stack_A8_0 : double [generated]
        
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
            var_2_5F = and:int(ldc:int(440851336), ldc:int(-947410197))
            var_4_64 = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u156b\u6d99\u52d3\u61a4\u647c\u6435, var_4_64:byte))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1997462122))
                stack_86_0 = ldc:double(-1.7976931348623157E308)
            }
            else {
                stack_86_0 = invokevirtual:double(\u98a4\uafe7\uc3e3\ua6bd\u8640::readDouble, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            var_2_85 = and:int(var_2_5F:int, ldc:int(-659575345))
            var_5_86 = stack_86_0:double
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u873d\u965f\ua6bd\u7af6\u416d\u16f6, var_4_64:byte))) {
                var_2_85 = and:int(var_2_85:int, ldc:int(1364187246))
                stack_A8_0 = ldc:double(1.7976931348623157E308)
            }
            else {
                stack_A8_0 = invokevirtual:double(\u98a4\uafe7\uc3e3\ua6bd\u8640::readDouble, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            return:DoubleArgumentType(invokestatic:DoubleArgumentType(DoubleArgumentType::doubleArg, var_5_86:double, stack_A8_0:double))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.DoubleArgumentType p0, com.google.gson.JsonObject p1) {
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
            
            if (cmpne:boolean(invokevirtual:double(DoubleArgumentType::getMinimum, p0:DoubleArgumentType), ldc:double(-1.7976931348623157E308))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u67e9\ucef1\u74b1\u392e\u6bb9::\u9937\u6435\ub8be\u3e2a\u839e\u0b8e), and:int(ldc:int(17873), ldc:int(-17908))), invokestatic:Double[expected:Number](Double::valueOf, invokevirtual:double(DoubleArgumentType::getMinimum, p0:DoubleArgumentType)))
            }
            
            if (cmpne:boolean(invokevirtual:double(DoubleArgumentType::getMaximum, p0:DoubleArgumentType), ldc:double(1.7976931348623157E308))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u67e9\ucef1\u74b1\u392e\u6bb9::\u9937\u6435\ub8be\u3e2a\u839e\u0b8e), and:int(ldc:int(1665), ldc:int(65))), invokestatic:Double[expected:Number](Double::valueOf, invokevirtual:double(DoubleArgumentType::getMaximum, p0:DoubleArgumentType)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.ArgumentType p0, com.google.gson.JsonObject p1) {
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
            invokevirtual:void(\u67e9\ucef1\u74b1\u392e\u6bb9::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u67e9\ucef1\u74b1\u392e\u6bb9, checkcast:DoubleArgumentType(com.mojang.brigadier.arguments.DoubleArgumentType.class, p0:ArgumentType[expected:DoubleArgumentType]), p1:JsonObject)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.brigadier.arguments.ArgumentType \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            return:ArgumentType(invokevirtual:DoubleArgumentType[expected:ArgumentType](\u67e9\ucef1\u74b1\u392e\u6bb9::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, this:\u67e9\ucef1\u74b1\u392e\u6bb9, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.ArgumentType p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
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
            invokevirtual:void(\u67e9\ucef1\u74b1\u392e\u6bb9::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u67e9\ucef1\u74b1\u392e\u6bb9, checkcast:DoubleArgumentType(com.mojang.brigadier.arguments.DoubleArgumentType.class, p0:ArgumentType[expected:DoubleArgumentType]), p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1BB_0 : byte[] [generated]
        stack_21C_0 : byte[] [generated]
        stack_2AA_0 : byte[] [generated]
        stack_2E7_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        expr_1BB : byte [generated]
        var_0_234 : int
        expr_21C : byte [generated]
        stack_268_2 : byte [generated]
        stack_23F_0 : byte [generated]
        expr_A6 : int [generated]
        expr_D9 : int [generated]
        var_2_10A : byte[]
        expr_10E : int [generated]
        var_3_2D6 : byte[]
        var_5_2D7 : int
        var_3_142 : String
        stack_190_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(238654977), ldc:int(1201651400))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1BB_0 = stack_21C_0 = stack_2AA_0 = stack_2E7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zAG8md7dLw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1572029287))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_1BB = loadelement:byte(stack_1BB_0:byte[], var_5_19D:int)
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, or:int(and:int(shl:int(expr_1BB:byte, xor:int(ldc:int(8211), ldc:int(8215))), ldc:int(-16)), and:int(shr:int(expr_1BB:byte[expected:int], and:int(ldc:int(652), ldc:int(12294))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1BB_0 = stack_21C_0 = stack_2AA_0 = stack_2E7_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0654)
        Label_0512:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0415)
            }
            
            var_0_234 = and:int(var_0_5F:int, ldc:int(-281029275))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_21C = stack_268_2 = loadelement(stack_21C_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(4)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_268_2 = stack_23F_0 = add:byte(expr_21C:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(4))))
                goto(Label_0591)
            }
            
            Label_0553:
            
            if (cmpeq:boolean(and:int(var_0_234:int, ldc:int(32768)), ldc:int(0))) {
                var_0_234 = and:int(var_0_234:int, ldc:int(-923156946))
            }
            else {
                var_0_234 = and:int(var_0_234:int, ldc:int(1860031869))
                stack_268_2 = stack_23F_0 = add:byte(expr_21C:byte, ldc:byte(4))
            }
            
            Label_0591:
            
            if (cmpeq:boolean(and:int(var_0_234:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_234 = and:int(var_0_234:int, ldc:int(-1705153277))
                goto(Label_0553)
            }
            
            var_0_5F = and:int(var_0_234:int, ldc:int(1994315591))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_268_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1BB_0 = stack_21C_0 = stack_2AA_0 = stack_2E7_0 = var_3_19C:byte[]
            goto(Label_0171)
        }
        
        Label_0654:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0415)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-79037133))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, add:byte(xor:byte(loadelement:byte(stack_2AA_0:byte[], var_5_19D:int), ldc:byte(67)), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1BB_0 = stack_21C_0 = stack_2AA_0 = stack_2E7_0 = var_3_19C:byte[]
            goto(Label_0222)
        }
        
        goto(Label_0512)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1069094100))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1210383301))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-253328999))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(461100962))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_197 = expr_A6:int
                var_3_19C = newarray:byte[](byte.class, expr_A6:int)
                var_5_19D = expr_A6:int
                goto(Label_0512)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(937513786))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1324091466))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-882330474))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_197 = expr_D9:int
                var_3_19C = newarray:byte[](byte.class, expr_D9:int)
                var_5_19D = expr_D9:int
                goto(Label_0654)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1639152887))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(18133019))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1922743762))
            var_2_10A = stack_10A_0:byte[]
            expr_10E = add:int(arraylength:int(stack_10C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_2D6 = newarray:byte[](byte.class, expr_10E:int)
                var_5_2D7 = expr_10E:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1091772933))
                    var_5_2D7 = add:int(var_5_2D7:int, ldc:int(-1))
                    storeelement:byte(var_3_2D6:byte[], var_5_2D7:int, add:int(shl:int(loadelement:byte(stack_2E7_0:byte[], var_5_2D7:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_10A:byte[], add:int(var_5_2D7:int, and:int(ldc:int(15881), ldc:int(16721)))), ldc:int(2)), and:int(ldc:int(191), ldc:int(575)))))
                    
                    if (cmpne:boolean(var_5_2D7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1BB_0 = stack_21C_0 = stack_2AA_0 = stack_2E7_0 = var_3_2D6:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1775684031))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_190_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4151), ldc:int(16642)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8242), ldc:int(130)))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32188), ldc:int(-32187)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-7490), ldc:int(3393)), xor:int(ldc:int(592), ldc:int(595))))
        storeelement:String(expr_154:String[], and:int(ldc:int(18097), ldc:int(-30386)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32511), ldc:int(-32510)), xor:int(ldc:int(9218), ldc:int(9220))))
        putstatic:String[](\u67e9\ucef1\u74b1\u392e\u6bb9::\u9937\u6435\ub8be\u3e2a\u839e\u0b8e, expr_154:String[])
    }
    
    public void \ucef1\u5bc4\u494c\ubded\u8cae\ud523(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CB : int
        var_11_DC : int
        var_14_106 : double
        var_16_10A : int
        var_12_102 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(85266034), ldc:int(1204276084))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\ucef1\u74b1\u392e\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-113255433))
            var_5_7D = and:int(ldc:int(29100), ldc:int(-29102))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1173), ldc:int(-1174)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CB = and:int(var_3_61D:int, ldc:int(-1386931258))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DC = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DC:int, sub:int(var_6_84:int, xor:int(ldc:int(1536), ldc:int(1537)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DC:int, and:int(ldc:int(24577), ldc:int(4483)))), var_7_93:double))) {
                        inc:int(var_11_DC, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_CB:int, ldc:int(1053277059))
                    var_14_106 = var_7_93:double
                    var_16_10A = var_11_DC:int
                }
                else {
                    var_11_DC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(147), ldc:int(146)))
                    var_12_102 = var_14_106 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10A = var_11_DC:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DC:int)
                        var_16_10A = var_11_DC:int
                        var_14_106 = var_12_102:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1906906912))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-23094962))
                        goto(Label_1052)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(912123779))
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-242075758))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1748408872))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(793059212))
                        
                        if (cmplt:boolean(var_16_10A:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1237886821))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1234374464))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-149227584))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(562387780))
                            var_11_DC = and:int(ldc:int(18550), ldc:int(-24576))
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-441062407))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1850035635))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(725243097))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1870322043))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1183169388))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_106 = var_9_B9:double
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(337583322))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1020027598))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(502108092))
                        var_14_106 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_106:double))
                    }
                    
                    Label_0776:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1452388123))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1701685817))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1067257200))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-212423164))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-500360391))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DC = xor:int(ldc:int(2056), ldc:int(2057))
                                goto(Label_1052)
                            }
                        }
                    }
                    
                    Label_0895:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(843184242))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1613994664))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1024002394))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-66137478))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1837778235))
                        var_11_DC = and:int(ldc:int(-13337), ldc:int(13336))
                    }
                    
                    Label_1052:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1082601919))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1328924530))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(2071050166))
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(2092508388))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1604844471))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                                goto(Label_1294)
                            }
                        }
                    }
                    
                    Label_1172:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(626416579))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2025489525))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1052)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1969871244))
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-766157056))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_106:double, var_5_7D:int, var_16_10A:int)
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1294:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(338996218))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-721527099))
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1784357289))
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1022026206))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_106:double, ldc:double(0.0))
                    Label_1416:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1550070855))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2017523125))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2141546874))
                        goto(Label_1052)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1487989531))
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-970740299))
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1780510032))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2125445703))
                        var_17_628 = add:int(var_16_10A:int, xor:int(ldc:int(1152), ldc:int(1153)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-384561259))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-1399882929))
                
                if (cmple:boolean(var_5_7D = var_17_628:int, sub:int(var_6_84:int, and:int(ldc:int(8201), ldc:int(5169))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
