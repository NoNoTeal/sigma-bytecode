public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u8753\u836c\u97e6\u67d0\u6ec6 {
    public void \u8753\u836c\u97e6\u67d0\u6ec6() {
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
            invokespecial:Object(Object::<init>, this:\u8753\u836c\u97e6\u67d0\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.FloatArgumentType p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
        var_3_5F : int
        stack_89_0 : int [generated]
        var_3_88 : int
        var_5_89 : int
        stack_B4_0 : int [generated]
        var_6_B4 : int
        
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
            var_3_5F = and:int(ldc:int(980869994), ldc:int(-1487965346))
            
            if (cmpeq:boolean(invokevirtual:float(FloatArgumentType::getMinimum, p0:FloatArgumentType), ldc:float(-3.4028235E38f))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(2138390363))
                stack_89_0 = and:int(ldc:int(25490), ldc:int(-26515))
            }
            else {
                stack_89_0 = and:int(ldc:int(4101), ldc:int(10401))
            }
            
            var_3_88 = and:int(var_3_5F:int, ldc:int(-1359697937))
            var_5_89 = stack_89_0:int
            
            if (cmpeq:boolean(invokevirtual:float(FloatArgumentType::getMaximum, p0:FloatArgumentType), ldc:float(3.4028235E38f))) {
                var_3_88 = and:int(var_3_88:int, ldc:int(1736385515))
                stack_B4_0 = and:int(ldc:int(9416), ldc:int(-11977))
            }
            else {
                stack_B4_0 = and:int(ldc:int(1169), ldc:int(69))
            }
            
            var_6_B4 = stack_B4_0:int
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokestatic:byte(\u3a62\uc31c\ubded\u8cae\u99f7::\ua068\u5654\u494c\uc84e\u5245\u8c8a, var_5_89:boolean, var_6_B4:boolean))
            
            if (var_5_89:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:float(FloatArgumentType::getMinimum, p0:FloatArgumentType))
            }
            
            if (var_6_B4:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:float(FloatArgumentType::getMaximum, p0:FloatArgumentType))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.brigadier.arguments.FloatArgumentType \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_64 : byte
        stack_85_0 : float [generated]
        var_2_84 : int
        var_5_85 : float
        stack_A6_0 : float [generated]
        
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
            var_2_5F = and:int(ldc:int(386169403), ldc:int(132037423))
            var_4_64 = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u156b\u6d99\u52d3\u61a4\u647c\u6435, var_4_64:byte))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(521993053))
                stack_85_0 = ldc:float(-3.4028235E38f)
            }
            else {
                stack_85_0 = invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            var_2_84 = and:int(var_2_5F:int, ldc:int(736968491))
            var_5_85 = stack_85_0:float
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u873d\u965f\ua6bd\u7af6\u416d\u16f6, var_4_64:byte))) {
                var_2_84 = and:int(var_2_84:int, ldc:int(658373645))
                stack_A6_0 = ldc:float(3.4028235E38f)
            }
            else {
                stack_A6_0 = invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            return:FloatArgumentType(invokestatic:FloatArgumentType(FloatArgumentType::floatArg, var_5_85:float, stack_A6_0:float))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.FloatArgumentType p0, com.google.gson.JsonObject p1) {
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
            
            if (cmpne:boolean(invokevirtual:float(FloatArgumentType::getMinimum, p0:FloatArgumentType), ldc:float(-3.4028235E38f))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u8753\u836c\u97e6\u67d0\u6ec6::\u7043\uceb8\uc31c\ub6ab\ub32d\u4975), and:int(ldc:int(-14403), ldc:int(14402))), invokestatic:Float[expected:Number](Float::valueOf, invokevirtual:float(FloatArgumentType::getMinimum, p0:FloatArgumentType)))
            }
            
            if (cmpne:boolean(invokevirtual:float(FloatArgumentType::getMaximum, p0:FloatArgumentType), ldc:float(3.4028235E38f))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u8753\u836c\u97e6\u67d0\u6ec6::\u7043\uceb8\uc31c\ub6ab\ub32d\u4975), and:int(ldc:int(10435), ldc:int(257))), invokestatic:Float[expected:Number](Float::valueOf, invokevirtual:float(FloatArgumentType::getMaximum, p0:FloatArgumentType)))
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
            invokevirtual:void(\u8753\u836c\u97e6\u67d0\u6ec6::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u8753\u836c\u97e6\u67d0\u6ec6, checkcast:FloatArgumentType(com.mojang.brigadier.arguments.FloatArgumentType.class, p0:ArgumentType[expected:FloatArgumentType]), p1:JsonObject)
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
            return:ArgumentType(invokevirtual:FloatArgumentType[expected:ArgumentType](\u8753\u836c\u97e6\u67d0\u6ec6::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, this:\u8753\u836c\u97e6\u67d0\u6ec6, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u8753\u836c\u97e6\u67d0\u6ec6::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u8753\u836c\u97e6\u67d0\u6ec6, checkcast:FloatArgumentType(com.mojang.brigadier.arguments.FloatArgumentType.class, p0:ArgumentType[expected:FloatArgumentType]), p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1D5 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_19B_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_284_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_20E : int
        expr_1F6 : byte [generated]
        stack_242_2 : byte [generated]
        stack_219_0 : byte [generated]
        expr_284 : byte [generated]
        expr_96 : int [generated]
        expr_B9 : int [generated]
        var_2_DA : byte[]
        expr_DE : int [generated]
        var_3_2C6 : byte[]
        var_5_2C7 : int
        var_3_122 : String
        stack_170_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_1D5 = and:int(ldc:int(-546520915), ldc:int(1034340852))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_B7_0 = stack_B9_0 = stack_DA_0 = stack_DC_0 = stack_116_0 = stack_19B_0 = stack_1F6_0 = stack_284_0 = stack_2D7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("oaiHwYSFcw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0458)
            }
            
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-9453138))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, xor:byte(loadelement:byte(stack_19B_0:byte[], var_5_17D:int), ldc:byte(103)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_DA_0 = stack_DC_0 = stack_116_0 = stack_19B_0 = stack_1F6_0 = stack_284_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0616)
        Label_0458:
        
        while (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1D5 = and:int(var_0_1D5:int, ldc:int(571936722))
                goto(Label_0383)
            }
            
            var_0_20E = and:int(var_0_1D5:int, ldc:int(-42686738))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_1F6 = stack_242_2 = loadelement(stack_1F6_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(5)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_242_2 = stack_219_0 = add:byte(expr_1F6:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(5))))
                goto(Label_0553)
            }
            
            Label_0515:
            
            if (cmpne:boolean(and:int(var_0_20E:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_20E = and:int(var_0_20E:int, ldc:int(837537743))
            }
            else {
                var_0_20E = and:int(var_0_20E:int, ldc:int(1599589871))
                stack_242_2 = stack_219_0 = add:byte(expr_1F6:byte, ldc:byte(5))
            }
            
            Label_0553:
            
            if (cmpne:boolean(and:int(var_0_20E:int, ldc:int(64)), ldc:int(0))) {
                var_0_20E = and:int(var_0_20E:int, ldc:int(-976492626))
                goto(Label_0515)
            }
            
            var_0_1D5 = and:int(var_0_20E:int, ldc:int(2112673958))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_242_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_DA_0 = stack_DC_0 = stack_116_0 = stack_19B_0 = stack_1F6_0 = stack_284_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0155)
        }
        
        var_0_1D5 = and:int(var_0_1D5:int, ldc:int(510442523))
        Label_0616:
        
        while (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-1076893708))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_284 = loadelement:byte(stack_284_0:byte[], var_5_17D:int)
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:int(or:int(and:int(shl:int(expr_284:byte, and:int(ldc:int(9404), ldc:int(4678))), ldc:int(-16)), and:int(shr:int(expr_284:byte[expected:int], xor:int(ldc:int(10785), ldc:int(10789))), ldc:int(15))), ldc:int(39)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_DA_0 = stack_DC_0 = stack_116_0 = stack_19B_0 = stack_1F6_0 = stack_284_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0190)
        }
        
        goto(Label_0458)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-244014050))
            goto(Label_0227)
        }
        
        if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0190)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-576741906))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_177 = expr_96:int
                var_3_17C = newarray:byte[](byte.class, expr_96:int)
                var_5_17D = expr_96:int
                goto(Label_0458)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(2110249903))
            expr_B9 = arraylength:int(stack_B9_0:byte[])
            
            if (cmpne:boolean(expr_B9:int, ldc:int(0))) {
                var_4_177 = expr_B9:int
                var_3_17C = newarray:byte[](byte.class, expr_B9:int)
                var_5_17D = expr_B9:int
                goto(Label_0616)
            }
        }
        
        Label_0190:
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-48967746))
            var_2_DA = stack_DA_0:byte[]
            expr_DE = add:int(arraylength:int(stack_DC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_3_2C6 = newarray:byte[](byte.class, expr_DE:int)
                var_5_2C7 = expr_DE:int
                
                loop {
                    var_0_1D5 = and:int(var_0_1D5:int, ldc:int(533708470))
                    var_5_2C7 = add:int(var_5_2C7:int, ldc:int(-1))
                    storeelement:byte(var_3_2C6:byte[], var_5_2C7:int, add:int(shl:int(loadelement:byte(stack_2D7_0:byte[], var_5_2C7:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_DA:byte[], add:int(var_5_2C7:int, and:int(ldc:int(22633), ldc:int(659)))), ldc:int(2)), xor:int(ldc:int(-16365), ldc:int(-16340)))))
                    
                    if (cmpne:boolean(var_5_2C7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_DA_0 = stack_DC_0 = stack_116_0 = stack_19B_0 = stack_1F6_0 = stack_284_0 = stack_2D7_0 = var_3_2C6:byte[]
            }
        }
        
        Label_0227:
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-1436858119))
            goto(Label_0190)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-1462204989))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-705457656))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_170_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2561), ldc:int(2563)))
        expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-16384), ldc:int(-16382)))
        storeelement:String(expr_134:String[], and:int(ldc:int(18485), ldc:int(9153)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-2041), ldc:int(1784)), xor:int(ldc:int(-32160), ldc:int(-32157))))
        storeelement:String(expr_134:String[], and:int(ldc:int(-5410), ldc:int(5409)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(8215), ldc:int(4643)), xor:int(ldc:int(130), ldc:int(132))))
        putstatic:String[](\u8753\u836c\u97e6\u67d0\u6ec6::\u7043\uceb8\uc31c\ub6ab\ub32d\u4975, expr_134:String[])
    }
    
    public void \u8d98\ub113\uc2bd\ud158\u759a\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_658 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_663 : int
        
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
        var_3_658 = and:int(ldc:int(-2052820456), ldc:int(759182045))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8753\u836c\u97e6\u67d0\u6ec6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
            var_3_658 = and:int(var_3_658:int, ldc:int(-1659963203))
            var_5_7D = and:int(ldc:int(29714), ldc:int(-29715))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-104), ldc:int(103)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_658:int, ldc:int(1299937626))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(133), ldc:int(2403)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-24447), ldc:int(-24448)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_658 = and:int(var_3_D2:int, ldc:int(-409488871))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1031), ldc:int(8209)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-963023393))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1168383513))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-438554917))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(24148587))
                        goto(Label_0536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-679593575))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0536)
                            }
                            
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(688656666))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(1034976253))
                        var_11_E3 = and:int(ldc:int(1257), ldc:int(-9450))
                        goto(Label_1487)
                    }
                    
                    Label_0536:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-806169666))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1482667402))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(940063170))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(96007709))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-915268143))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-542628527))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-278304259))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1380319486))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2146034119))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(2018024724))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(41330779))
                            goto(Label_0536)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-2130827044))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(98378489))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0808:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1117794174))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-769467680))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1971313651))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(255028478))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(261), ldc:int(16529))
                                goto(Label_1094)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(558952402))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1492840949))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1930363541))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-323166056))
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1433041601))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-339310488))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1221907938))
                        var_11_E3 = and:int(ldc:int(-18412), ldc:int(18155))
                    }
                    
                    Label_1094:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-847867383))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(994595390))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-908885476))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(2006757211))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1346)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1863198234))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-1832353887))
                            goto(Label_1094)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1707842137))
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-2036428323))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-557675068))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-141924772))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1355059899))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(998818382))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(930657964))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(377969197))
                        goto(Label_0536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1166763991))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_658 = and:int(var_3_658:int, ldc:int(263010585))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_663 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-539887591))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1703400835))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1021481952))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1848691995))
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1214823683))
                        goto(Label_0536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1286026617))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(2143449497))
                        var_17_663 = add:int(var_16_111:int, and:int(ldc:int(13), ldc:int(23489)))
                        looporswitchbreak()
                    }
                }
                
                var_3_658 = and:int(var_3_658:int, ldc:int(760410556))
                
                if (cmple:boolean(var_5_7D = var_17_663:int, sub:int(var_6_84:int, xor:int(ldc:int(20672), ldc:int(20673))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_658 = and:int(var_3_658:int, ldc:int(986131750))
            goto(Label_0106)
        }
    }
}
