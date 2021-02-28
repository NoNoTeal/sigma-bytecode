public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u92ee\u6c52\u156b\u34df\uae87 {
    public void \u92ee\u6c52\u156b\u34df\uae87() {
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
            invokespecial:Object(Object::<init>, this:\u92ee\u6c52\u156b\u34df\uae87)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.LongArgumentType p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
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
            var_3_5F = and:int(ldc:int(19577714), ldc:int(-472914362))
            
            if (cmpeq:boolean(invokevirtual:long(LongArgumentType::getMinimum, p0:LongArgumentType), ldc:long(-9223372036854775808L))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-618139066))
                stack_8A_0 = and:int(ldc:int(9089), ldc:int(-9090))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(-32623), ldc:int(-32624))
            }
            
            var_3_89 = and:int(var_3_5F:int, ldc:int(924509010))
            var_5_8A = stack_8A_0:int
            
            if (cmpeq:boolean(invokevirtual:long(LongArgumentType::getMaximum, p0:LongArgumentType), ldc:long(9223372036854775807L))) {
                var_3_89 = and:int(var_3_89:int, ldc:int(1065872203))
                stack_B6_0 = and:int(ldc:int(20040), ldc:int(-24137))
            }
            else {
                stack_B6_0 = and:int(ldc:int(19989), ldc:int(12577))
            }
            
            var_6_B6 = stack_B6_0:int
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokestatic:byte(\u3a62\uc31c\ubded\u8cae\u99f7::\ua068\u5654\u494c\uc84e\u5245\u8c8a, var_5_8A:boolean, var_6_B6:boolean))
            
            if (var_5_8A:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeLong, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:long(LongArgumentType::getMinimum, p0:LongArgumentType))
            }
            
            if (var_6_B6:boolean) {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeLong, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:long(LongArgumentType::getMaximum, p0:LongArgumentType))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.brigadier.arguments.LongArgumentType \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_64 : byte
        stack_86_0 : long [generated]
        var_2_85 : int
        var_5_86 : long
        stack_A8_0 : long [generated]
        
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
            var_2_5F = and:int(ldc:int(348239591), ldc:int(-70932913))
            var_4_64 = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u156b\u6d99\u52d3\u61a4\u647c\u6435, var_4_64:byte))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1653216044))
                stack_86_0 = ldc:long(-9223372036854775808L)
            }
            else {
                stack_86_0 = invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::readLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            var_2_85 = and:int(var_2_5F:int, ldc:int(987737134))
            var_5_86 = stack_86_0:long
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\uc31c\ubded\u8cae\u99f7::\u873d\u965f\ua6bd\u7af6\u416d\u16f6, var_4_64:byte))) {
                var_2_85 = and:int(var_2_85:int, ldc:int(1550054551))
                stack_A8_0 = ldc:long(9223372036854775807L)
            }
            else {
                stack_A8_0 = invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::readLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            }
            
            return:LongArgumentType(invokestatic:LongArgumentType(LongArgumentType::longArg, var_5_86:long, stack_A8_0:long))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(com.mojang.brigadier.arguments.LongArgumentType p0, com.google.gson.JsonObject p1) {
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
            
            if (cmpne:boolean(invokevirtual:long(LongArgumentType::getMinimum, p0:LongArgumentType), ldc:long(-9223372036854775808L))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u92ee\u6c52\u156b\u34df\uae87::\ubb2b\u9937\u4f52\u8308\u5245\u6c56), and:int(ldc:int(-28549), ldc:int(26500))), invokestatic:Long[expected:Number](Long::valueOf, invokevirtual:long(LongArgumentType::getMinimum, p0:LongArgumentType)))
            }
            
            if (cmpne:boolean(invokevirtual:long(LongArgumentType::getMaximum, p0:LongArgumentType), ldc:long(9223372036854775807L))) {
                invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u92ee\u6c52\u156b\u34df\uae87::\ubb2b\u9937\u4f52\u8308\u5245\u6c56), xor:int(ldc:int(450), ldc:int(451))), invokestatic:Long[expected:Number](Long::valueOf, invokevirtual:long(LongArgumentType::getMaximum, p0:LongArgumentType)))
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
            invokevirtual:void(\u92ee\u6c52\u156b\u34df\uae87::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u92ee\u6c52\u156b\u34df\uae87, checkcast:LongArgumentType(com.mojang.brigadier.arguments.LongArgumentType.class, p0:ArgumentType[expected:LongArgumentType]), p1:JsonObject)
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
            return:ArgumentType(invokevirtual:LongArgumentType[expected:ArgumentType](\u92ee\u6c52\u156b\u34df\uae87::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, this:\u92ee\u6c52\u156b\u34df\uae87, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u92ee\u6c52\u156b\u34df\uae87::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u92ee\u6c52\u156b\u34df\uae87, checkcast:LongArgumentType(com.mojang.brigadier.arguments.LongArgumentType.class, p0:ArgumentType[expected:LongArgumentType]), p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1EF : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_19C_0 : byte[] [generated]
        stack_201_0 : byte[] [generated]
        stack_27E_0 : byte[] [generated]
        stack_2D3_0 : byte[] [generated]
        var_4_17F : int
        var_3_184 : byte[]
        var_5_185 : int
        expr_19C : byte [generated]
        var_0_219 : int
        expr_201 : byte [generated]
        stack_24D_2 : byte [generated]
        stack_224_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_26D : byte[]
        var_5_26E : int
        expr_F6 : int [generated]
        var_3_2C2 : byte[]
        var_5_2C3 : int
        var_3_12A : String
        stack_178_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_1EF = and:int(ldc:int(367170478), ldc:int(-10528963))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_19C_0 = stack_201_0 = stack_27E_0 = stack_2D3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lJBwa0tjjw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17F = expr_6B:int
        var_3_184 = newarray:byte[](byte.class, expr_6B:int)
        var_5_185 = expr_6B:int
        Label_0391:
        
        while (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(2144287718))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_19C = loadelement:byte(stack_19C_0:byte[], var_5_185:int)
            storeelement:byte(var_3_184:byte[], var_5_185:int, xor:int(or:int(and:int(shl:int(expr_19C:byte, and:int(ldc:int(4260), ldc:int(18438))), ldc:int(-16)), and:int(shr:int(expr_19C:byte[expected:int], and:int(ldc:int(12311), ldc:int(17580))), ldc:int(15))), ldc:int(70)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_19C_0 = stack_201_0 = stack_27E_0 = stack_2D3_0 = var_3_184:byte[]
            goto(Label_0112)
        }
        
        Label_0484:
        
        while (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(16)), ldc:int(0))) {
            var_0_219 = and:int(var_0_1EF:int, ldc:int(-1645846673))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_201 = stack_24D_2 = loadelement(stack_201_0, var_5_185)
            
            if (cmplt:boolean(add:int(add:int(var_5_185:int, ldc:int(2)), neg:int(var_4_17F:int)), ldc:int(0))) {
                stack_24D_2 = stack_224_0 = add:byte(expr_201:byte, loadelement:byte(var_3_184:byte[], add:int(var_5_185:int, ldc:int(2))))
                goto(Label_0564)
            }
            
            Label_0526:
            
            if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_219 = and:int(var_0_219:int, ldc:int(1999425294))
            }
            else {
                var_0_219 = and:int(var_0_219:int, ldc:int(893588975))
                stack_24D_2 = stack_224_0 = add:byte(expr_201:byte, ldc:byte(2))
            }
            
            Label_0564:
            
            if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_219 = and:int(var_0_219:int, ldc:int(644656543))
                goto(Label_0526)
            }
            
            var_0_1EF = and:int(var_0_219:int, ldc:int(-1781359850))
            storeelement:byte(var_3_184:byte[], var_5_185:int, stack_24D_2:byte)
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_19C_0 = stack_201_0 = stack_27E_0 = stack_2D3_0 = var_3_184:byte[]
            goto(Label_0155)
        }
        
        var_0_1EF = and:int(var_0_1EF:int, ldc:int(-2055087983))
        goto(Label_0391)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(1750890159))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(-136888964))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_17F = expr_96:int
                var_3_184 = newarray:byte[](byte.class, expr_96:int)
                var_5_185 = expr_96:int
                goto(Label_0484)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(453897948))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(256)), ldc:int(0))) {
                var_0_1EF = and:int(var_0_1EF:int, ldc:int(-311034098))
                goto(Label_0112)
            }
            
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(1464588180))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_26D = newarray:byte[](byte.class, expr_CB:int)
                var_5_26E = expr_CB:int
                
                loop {
                    var_0_1EF = and:int(var_0_1EF:int, ldc:int(-682485460))
                    var_5_26E = add:int(var_5_26E:int, ldc:int(-1))
                    storeelement:byte(var_3_26D:byte[], var_5_26E:int, add:int(shl:int(loadelement:byte(stack_27E_0:byte[], var_5_26E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_26E:int, and:int(ldc:int(10529), ldc:int(131)))), ldc:int(4)), and:int(ldc:int(1071), ldc:int(8287)))))
                    
                    if (cmpne:boolean(var_5_26E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_19C_0 = stack_201_0 = stack_27E_0 = stack_2D3_0 = var_3_26D:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1EF = and:int(var_0_1EF:int, ldc:int(151868426))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(1976704478))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2C2 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2C3 = expr_F6:int
                
                loop {
                    var_0_1EF = and:int(var_0_1EF:int, ldc:int(-1780335308))
                    var_5_2C3 = add:int(var_5_2C3:int, ldc:int(-1))
                    storeelement:byte(var_3_2C2:byte[], var_5_2C3:int, add:byte(loadelement:byte(stack_2D3_0:byte[], var_5_2C3:int), ldc:byte(66)))
                    
                    if (cmpne:boolean(var_5_2C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_19C_0 = stack_201_0 = stack_27E_0 = stack_2D3_0 = var_3_2C2:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(256)), ldc:int(0))) {
            var_0_1EF = and:int(var_0_1EF:int, ldc:int(1310902460))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_1EF:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_178_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(546), ldc:int(4382)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2050), ldc:int(819)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(5123), ldc:int(2053)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(2356), ldc:int(-2357)), xor:int(ldc:int(2249), ldc:int(2250))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-21068), ldc:int(21067)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(20551), ldc:int(19)), and:int(ldc:int(14), ldc:int(10263))))
            putstatic:String[](\u92ee\u6c52\u156b\u34df\uae87::\ubb2b\u9937\u4f52\u8308\u5245\u6c56, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \uc238\u72f1\uc29a\uc229\u0800\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(1093925159), ldc:int(1259583997))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ee\u6c52\u156b\u34df\uae87[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(1642061671))
            var_5_7D = and:int(ldc:int(5518), ldc:int(-14255))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6596), ldc:int(-6613)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_645:int, ldc:int(-820265044))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(513), ldc:int(16647)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-23544), ldc:int(-23543)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_D2:int, ldc:int(892591086))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(165), ldc:int(513)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(361102505))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1887447443))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1175263366))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-530650915))
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(838964805))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1133403150))
                        goto(Label_0728)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1941122168))
                    }
                    else {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1838939494))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(362150090))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-581088166))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-510675033))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0728)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(297070807))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1442553125))
                            var_11_E3 = and:int(ldc:int(4429), ldc:int(-5502))
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0583:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1626195650))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(660820958))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1157548560))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-741690435))
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(470879918))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1576483139))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-266750097))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1308893948))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0728:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2064551571))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2113006619))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-325201614))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1671082973))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-907710165))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(798219741))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0862:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1058506747))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(7093571))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-355969302))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0728)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1197511007))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1583620745))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(209), ldc:int(208))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0981:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1339056033))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1359989173))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2049000252))
                            goto(Label_0728)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-714268144))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(832158863))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1677433780))
                        var_11_E3 = and:int(ldc:int(22704), ldc:int(-23289))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(405487722))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0981)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0728)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2123790548))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1186996338))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1365)
                            }
                        }
                    }
                    
                    Label_1245:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1130937845))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2103686214))
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2037499901))
                            goto(Label_0981)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0728)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(632798588))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1365:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1685319688))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0728)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1140965408))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1268048692))
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-608174673))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-700621001))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0728)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2065034514))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1689724109))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-38020130))
                        var_17_650 = add:int(var_16_111:int, xor:int(ldc:int(-28352), ldc:int(-28351)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-691355225))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(503045455))
                
                if (cmple:boolean(var_5_7D = var_17_650:int, sub:int(var_6_84:int, and:int(ldc:int(201), ldc:int(8757))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(1741863506))
            goto(Label_0106)
        }
    }
}
