public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u0a06\ud7e8\u0800\ubff1\u52d3 {
    public void \u0a06\ud7e8\u0800\ubff1\u52d3() {
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
            invokespecial:Object(Object::<init>, this:\u0a06\ud7e8\u0800\ubff1\u52d3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.IntegerArgumentType p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
        var_3_5F : int
        stack_88_0 : int [generated]
        var_3_87 : int
        var_5_88 : int
        stack_B2_0 : int [generated]
        var_6_B2 : int
        
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
            var_3_5F = and:int(ldc:int(1742945924), ldc:int(-403702364))
            
            if (cmpeq:boolean(invokevirtual:int(IntegerArgumentType::getMinimum, p0:IntegerArgumentType), ldc:int(-2147483648))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1743486070))
                stack_88_0 = and:int(ldc:int(7482), ldc:int(-7483))
            }
            else {
                stack_88_0 = xor:int(ldc:int(4992), ldc:int(4993))
            }
            
            var_3_87 = and:int(var_3_5F:int, ldc:int(1071856106))
            var_5_88 = stack_88_0:int
            
            if (cmpeq:boolean(invokevirtual:int(IntegerArgumentType::getMaximum, p0:IntegerArgumentType), ldc:int(2147483647))) {
                var_3_87 = and:int(var_3_87:int, ldc:int(-403489594))
                stack_B2_0 = and:int(ldc:int(8845), ldc:int(-8846))
            }
            else {
                stack_B2_0 = xor:int(ldc:int(864), ldc:int(865))
            }
            
            var_6_B2 = stack_B2_0:int
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokestatic:byte(\u3a62\uc31c\ubded\u8cae\u99f7::\ua068\u5654\u494c\uc84e\u5245\u8c8a, var_5_88:boolean, var_6_B2:boolean))
            
            if (var_5_88:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeInt, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:int(IntegerArgumentType::getMinimum, p0:IntegerArgumentType))
            }
            
            if (var_6_B2:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeInt, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:int(IntegerArgumentType::getMaximum, p0:IntegerArgumentType))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.brigadier.arguments.IntegerArgumentType \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_64 : byte
        stack_85_0 : int [generated]
        var_2_84 : int
        var_5_85 : int
        stack_A6_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-317318785), ldc:int(-325296641))
            var_4_64 = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u156b\u6d99\u52d3\u61a4\u647c\u6435, var_4_64:byte))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-403769089))
                stack_85_0 = ldc:int(-2147483648)
            }
            else {
                stack_85_0 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::readInt, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            var_2_84 = and:int(var_2_5F:int, ldc:int(-14382981))
            var_5_85 = stack_85_0:int
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u873d\u965f\ua6bd\u7af6\u416d\u16f6, var_4_64:byte))) {
                var_2_84 = and:int(var_2_84:int, ldc:int(-328738437))
                stack_A6_0 = ldc:int(2147483647)
            }
            else {
                stack_A6_0 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::readInt, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            return:IntegerArgumentType(invokestatic:IntegerArgumentType(IntegerArgumentType::integer, var_5_85:int, stack_A6_0:int))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.IntegerArgumentType p0, com.google.gson.JsonObject p1) {
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
            
            if (cmpne:boolean(invokevirtual:int(IntegerArgumentType::getMinimum, p0:IntegerArgumentType), ldc:int(-2147483648))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u0a06\ud7e8\u0800\ubff1\u52d3::\u965f\u88c5\u6fb0\ua562\ub19c\ud12e), and:int(ldc:int(15397), ldc:int(-15400))), invokestatic:Integer[expected:Number](Integer::valueOf, invokevirtual:int(IntegerArgumentType::getMinimum, p0:IntegerArgumentType)))
            }
            
            if (cmpne:boolean(invokevirtual:int(IntegerArgumentType::getMaximum, p0:IntegerArgumentType), ldc:int(2147483647))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u0a06\ud7e8\u0800\ubff1\u52d3::\u965f\u88c5\u6fb0\ua562\ub19c\ud12e), and:int(ldc:int(531), ldc:int(7425))), invokestatic:Integer[expected:Number](Integer::valueOf, invokevirtual:int(IntegerArgumentType::getMaximum, p0:IntegerArgumentType)))
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
            invokevirtual:void(\u0a06\ud7e8\u0800\ubff1\u52d3::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u0a06\ud7e8\u0800\ubff1\u52d3, checkcast:IntegerArgumentType(com.mojang.brigadier.arguments.IntegerArgumentType.class, p0:ArgumentType[expected:IntegerArgumentType]), p1:JsonObject)
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
            return:ArgumentType(invokevirtual:IntegerArgumentType[expected:ArgumentType](\u0a06\ud7e8\u0800\ubff1\u52d3::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, this:\u0a06\ud7e8\u0800\ubff1\u52d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u0a06\ud7e8\u0800\ubff1\u52d3::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u0a06\ud7e8\u0800\ubff1\u52d3, checkcast:IntegerArgumentType(com.mojang.brigadier.arguments.IntegerArgumentType.class, p0:ArgumentType[expected:IntegerArgumentType]), p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1A7_0 : byte[] [generated]
        stack_227_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_141 : byte[]
        var_4_142 : int
        var_0_7D : int
        expr_99 : int [generated]
        var_5_191 : int
        var_3_196 : byte[]
        var_4_197 : int
        var_0_1BF : int
        expr_1A7 : byte [generated]
        stack_1F3_2 : byte [generated]
        stack_1CA_0 : byte [generated]
        expr_BD : int [generated]
        var_3_216 : byte[]
        var_4_217 : int
        expr_22D : byte [generated]
        var_3_EA : String
        stack_138_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-224482382), ldc:int(-134856842))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1A7_0 = stack_227_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GA36KBoXoA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_141 = newarray:byte[](byte.class, expr_6D:int)
                var_4_142 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(2060940260))
                    var_4_142 = add:int(var_4_142:int, ldc:int(-1))
                    storeelement:byte(var_3_141:byte[], var_4_142:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_142:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_142:int, and:int(ldc:int(2179), ldc:int(8197)))), ldc:int(5)), and:int(ldc:int(1071), ldc:int(30743)))))
                    
                    if (cmpne:boolean(var_4_142:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1A7_0 = stack_227_0 = var_3_141:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(568458747))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(1164683102))
                }
                else {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(2141140963))
                    expr_99 = arraylength:int(stack_99_0:byte[])
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_5_191 = expr_99:int
                        var_3_196 = newarray:byte[](byte.class, expr_99:int)
                        var_4_197 = expr_99:int
                        
                        loop {
                            var_0_1BF = and:int(var_0_7D:int, ldc:int(2011132903))
                            var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                            expr_1A7 = stack_1F3_2 = loadelement(stack_1A7_0, var_4_197)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_197:int, ldc:int(1)), neg:int(var_5_191:int)), ldc:int(0))) {
                                stack_1F3_2 = stack_1CA_0 = add:byte(expr_1A7:byte, loadelement:byte(var_3_196:byte[], add:int(var_4_197:int, ldc:int(1))))
                                goto(Label_0474)
                            }
                            
                            Label_0436:
                            
                            if (cmpne:boolean(and:int(var_0_1BF:int, ldc:int(4194304)), ldc:int(0))) {
                                var_0_1BF = and:int(var_0_1BF:int, ldc:int(-1559083855))
                            }
                            else {
                                var_0_1BF = and:int(var_0_1BF:int, ldc:int(2075638691))
                                stack_1F3_2 = stack_1CA_0 = add:byte(expr_1A7:byte, ldc:byte(1))
                            }
                            
                            Label_0474:
                            
                            if (cmpeq:boolean(and:int(var_0_1BF:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_0_1BF = and:int(var_0_1BF:int, ldc:int(-188805531))
                                goto(Label_0436)
                            }
                            
                            var_0_7D = and:int(var_0_1BF:int, ldc:int(-222367904))
                            storeelement:byte(var_3_196:byte[], var_4_197:int, stack_1F3_2:byte)
                            
                            if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1A7_0 = stack_227_0 = var_3_196:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(131072)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_7D:int, ldc:int(-317441732))
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_7D:int, ldc:int(-136841347))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_216 = newarray:byte[](byte.class, expr_BD:int)
                        var_4_217 = expr_BD:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(1945513910))
                            var_4_217 = add:int(var_4_217:int, ldc:int(-1))
                            expr_22D = xor:byte(add:byte(loadelement:byte(stack_227_0:byte[], var_4_217:int), ldc:byte(32)), ldc:byte(56))
                            storeelement:byte(var_3_216:byte[], var_4_217:int, or:int(and:int(shl:int(expr_22D:byte, and:int(ldc:int(293), ldc:int(8196))), ldc:int(-16)), and:int(shr:int(expr_22D:byte[expected:int], and:int(ldc:int(708), ldc:int(37))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_217:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1A7_0 = stack_227_0 = var_3_216:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(660844034))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_138_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12577), ldc:int(12579)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(546), ldc:int(16530)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(19713), ldc:int(43)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(9425), ldc:int(-9426)), xor:int(ldc:int(19), ldc:int(16))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(-12324), ldc:int(12323)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(8196), ldc:int(8199)), xor:int(ldc:int(22531), ldc:int(22533))))
            putstatic:String[](\u0a06\ud7e8\u0800\ubff1\u52d3::\u965f\u88c5\u6fb0\ua562\ub19c\ud12e, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2bd\u983f\u76bc\u74b1\u36d3\u62da(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_621 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_62C : int
        
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
        var_3_621 = and:int(ldc:int(1328163598), ldc:int(254574522))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\ud7e8\u0800\ubff1\u52d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(1562727534))
        }
        else {
            var_3_621 = and:int(var_3_621:int, ldc:int(-1611813924))
            var_5_85 = and:int(ldc:int(6364), ldc:int(-6397))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10626), ldc:int(-10627)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_621:int, ldc:int(-1364493473))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(20548), ldc:int(20549)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(26697), ldc:int(17)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_621 = and:int(var_3_D2:int, ldc:int(1592389423))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-26496), ldc:int(-26495)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1358524145))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(2046981027))
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1067891529))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1754032862))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-514327823))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2079384250))
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-741927653))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-273028324))
                            var_11_E3 = and:int(ldc:int(-23585), ldc:int(23584))
                            goto(Label_1451)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1797632966))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1069446681))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1772346354))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1124387986))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-9228422))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0653:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1649046252))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1474984651))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(396390310))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(475921227))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1180421983))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(799484780))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0789:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-899510204))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-867592916))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(905673856))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-764013245))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1087770659))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-29184), ldc:int(-29183))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0910:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1197583973))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(375402601))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1252545328))
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1038760720))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-540050448))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(522334202))
                        var_11_E3 = and:int(ldc:int(-14405), ldc:int(14404))
                    }
                    
                    Label_1073:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1425087000))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1978016631))
                            goto(Label_0910)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-858257510))
                            goto(Label_0789)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(318268137))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-814728354))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1337)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-512695118))
                            goto(Label_1073)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0910)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1599488217))
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-293175214))
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(458766757))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-2002236584))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-815140994))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1451)
                    }
                    
                    Label_1337:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-895926161))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-906499182))
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(259091372))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(528104614))
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(395172741))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1895416971))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1849569193))
                        var_17_62C = add:int(var_16_111:int, xor:int(ldc:int(-32704), ldc:int(-32703)))
                        looporswitchbreak()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(731728736))
                }
                
                var_3_621 = and:int(var_3_621:int, ldc:int(775207693))
                
                if (cmple:boolean(var_5_85 = var_17_62C:int, sub:int(var_6_8C:int, and:int(ldc:int(24577), ldc:int(83))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
