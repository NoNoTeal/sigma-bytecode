public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u7bad\ufcaf\u6cfe\ub1b9\u3c25 {
    public void \u7bad\ufcaf\u6cfe\ub1b9\u3c25() {
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
            invokespecial:Object(Object::<init>, this:\u7bad\ufcaf\u6cfe\ub1b9\u3c25)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(\u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
        var_5_67 : int
        
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
            var_5_67 = and:int(ldc:int(-7399), ldc:int(4324))
            
            if (invokestatic:boolean(\u600f\u9937\ub8be\ud171\u624e::\u7006\ua562\u5db4\uf995\u8df4\uc31c, p0:\u600f\u9937\ub8be\ud171\u624e)) {
                var_5_67 = i2b:byte(or:int(var_5_67:int, xor:int(ldc:int(-32232), ldc:int(-32231))))
            }
            
            if (invokestatic:boolean(\u600f\u9937\ub8be\ud171\u624e::\u5f50\u88c5\u5d20\uc238\u4daf\u156b, p0:\u600f\u9937\ub8be\ud171\u624e)) {
                var_5_67 = i2b:byte(or:int(var_5_67:int, xor:int(ldc:int(-32663), ldc:int(-32661))))
            }
            
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, var_5_67:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e \ud51e\u4c04\u4492\u3d64\u92ee\u97e6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_4_64 : byte
        
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
            var_4_64 = invokevirtual:byte(\u98a4\uafe7\uc3e3\ua6bd\u8640::readByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:\u600f\u9937\ub8be\ud171\u624e(initobject:\u600f\u9937\ub8be\ud171\u624e(\u600f\u9937\ub8be\ud171\u624e::<init>, ternaryop:int(cmpeq:boolean(and:int(var_4_64:byte[expected:int], xor:int(ldc:int(16392), ldc:int(16393))), ldc:int(0)), and:int(ldc:int(24721), ldc:int(-24722)), and:int(ldc:int(1033), ldc:int(16677))), ternaryop:int(cmpeq:boolean(and:int(var_4_64:byte[expected:int], xor:int(ldc:int(320), ldc:int(322))), ldc:int(0)), and:int(ldc:int(-10761), ldc:int(10760)), and:int(ldc:int(1), ldc:int(28713)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uc7fe\u8709\uc31c\u946b\u120d(\u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e p0, com.google.gson.JsonObject p1) {
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
            invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(19107), ldc:int(-27572))), ternaryop:String(invokestatic:boolean(\u600f\u9937\ub8be\ud171\u624e::\u7006\ua562\u5db4\uf995\u8df4\uc31c, p0:\u600f\u9937\ub8be\ud171\u624e), loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(1553), ldc:int(24617))), loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(11522), ldc:int(20491)))))
            invokevirtual:void(JsonObject::addProperty, p1:JsonObject, loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(9411), ldc:int(20507))), ternaryop:String(invokestatic:boolean(\u600f\u9937\ub8be\ud171\u624e::\u5f50\u88c5\u5d20\uc238\u4daf\u156b, p0:\u600f\u9937\ub8be\ud171\u624e), loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(1484), ldc:int(8196))), loadelement:String(getstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae), and:int(ldc:int(4677), ldc:int(2469)))))
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
            invokevirtual:void(\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u7bad\ufcaf\u6cfe\ub1b9\u3c25, checkcast:\u600f\u9937\ub8be\ud171\u624e(\u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e.class, p0:ArgumentType[expected:\u600f\u9937\ub8be\ud171\u624e]), p1:JsonObject)
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
            return:ArgumentType(invokevirtual:\u600f\u9937\ub8be\ud171\u624e[expected:ArgumentType](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ud51e\u4c04\u4492\u3d64\u92ee\u97e6, this:\u7bad\ufcaf\u6cfe\ub1b9\u3c25, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\u0c95\uc7fe\u8709\uc31c\u946b\u120d, this:\u7bad\ufcaf\u6cfe\ub1b9\u3c25, checkcast:\u600f\u9937\ub8be\ud171\u624e(\u56bd\u8413\u647c\u5bc4\ud158.\u600f\u9937\ub8be\ud171\u624e.class, p0:ArgumentType[expected:\u600f\u9937\ub8be\ud171\u624e]), p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_38A : int
        expr_6B : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_28D_0 : byte[] [generated]
        stack_2DD_0 : byte[] [generated]
        stack_350_0 : byte[] [generated]
        stack_3A3_0 : byte[] [generated]
        stack_423_0 : byte[] [generated]
        var_4_261 : int
        var_3_266 : byte[]
        var_5_267 : int
        expr_28D : byte [generated]
        var_0_3BB : int
        expr_3A3 : byte [generated]
        stack_3EF_2 : byte [generated]
        stack_3C6_0 : byte [generated]
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_2CC : byte[]
        var_5_2CD : int
        expr_D1 : int [generated]
        expr_10B : int [generated]
        expr_14D : int [generated]
        var_3_412 : byte[]
        var_5_413 : int
        var_3_1A0 : String
        stack_25A_0 : String[] [generated]
        expr_1B2 : String[] [generated]
        
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
        var_0_38A = and:int(ldc:int(1834421147), ldc:int(2144832392))
        expr_6B = arraylength:int(stack_93_0 = stack_95_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MTs91DvWxDPELdojOcrE4DPa0iPMLTU5MdI1zt4/LTPOppq4SrCSCA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_261 = expr_6B:int
        var_3_266 = newarray:byte[](byte.class, expr_6B:int)
        var_5_267 = expr_6B:int
        Label_0617:
        
        while (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0804)
            }
            
            var_0_38A = and:int(var_0_38A:int, ldc:int(-59245924))
            var_5_267 = add:int(var_5_267:int, ldc:int(-1))
            expr_28D = loadelement:byte(stack_28D_0:byte[], var_5_267:int)
            storeelement:byte(var_3_266:byte[], var_5_267:int, or:int(and:int(shl:int(expr_28D:byte, and:int(ldc:int(12428), ldc:int(517))), ldc:int(-16)), and:int(shr:int(expr_28D:byte[expected:int], and:int(ldc:int(16437), ldc:int(8708))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_267:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = var_3_266:byte[]
            goto(Label_0112)
        }
        
        var_0_38A = and:int(var_0_38A:int, ldc:int(1611724493))
        goto(Label_0895)
        Label_0804:
        
        while (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(64)), ldc:int(0))) {
                var_0_38A = and:int(var_0_38A:int, ldc:int(-567252362))
                goto(Label_0617)
            }
            
            var_0_38A = and:int(var_0_38A:int, ldc:int(2046166987))
            var_5_267 = add:int(var_5_267:int, ldc:int(-1))
            storeelement:byte(var_3_266:byte[], var_5_267:int, xor:byte(loadelement:byte(stack_350_0:byte[], var_5_267:int), ldc:byte(97)))
            
            if (cmpne:boolean(var_5_267:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = var_3_266:byte[]
            goto(Label_0214)
        }
        
        var_0_38A = and:int(var_0_38A:int, ldc:int(-1810918323))
        Label_0895:
        
        while (cmpne:boolean(and:int(var_0_38A:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0617)
            }
            
            var_0_3BB = and:int(var_0_38A:int, ldc:int(2077677262))
            var_5_267 = add:int(var_5_267:int, ldc:int(-1))
            expr_3A3 = stack_3EF_2 = loadelement(stack_3A3_0, var_5_267)
            
            if (cmplt:boolean(add:int(add:int(var_5_267:int, ldc:int(6)), neg:int(var_4_261:int)), ldc:int(0))) {
                stack_3EF_2 = stack_3C6_0 = add:byte(expr_3A3:byte, loadelement:byte(var_3_266:byte[], add:int(var_5_267:int, ldc:int(6))))
                goto(Label_0982)
            }
            
            Label_0944:
            
            if (cmpeq:boolean(and:int(var_0_3BB:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_3BB = and:int(var_0_3BB:int, ldc:int(-615830612))
            }
            else {
                var_0_3BB = and:int(var_0_3BB:int, ldc:int(2046794666))
                stack_3EF_2 = stack_3C6_0 = add:byte(expr_3A3:byte, ldc:byte(6))
            }
            
            Label_0982:
            
            if (cmpne:boolean(and:int(var_0_3BB:int, ldc:int(64)), ldc:int(0))) {
                var_0_3BB = and:int(var_0_3BB:int, ldc:int(-476891379))
                goto(Label_0944)
            }
            
            var_0_38A = and:int(var_0_3BB:int, ldc:int(1853350797))
            storeelement:byte(var_3_266:byte[], var_5_267:int, stack_3EF_2:byte)
            
            if (cmpne:boolean(var_5_267:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = var_3_266:byte[]
            goto(Label_0272)
        }
        
        var_0_38A = and:int(var_0_38A:int, ldc:int(91518774))
        goto(Label_0804)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0214)
        }
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-16777543))
            var_2_93 = stack_93_0:byte[]
            expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_3_2CC = newarray:byte[](byte.class, expr_97:int)
                var_5_2CD = expr_97:int
                
                loop {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(1758962651))
                    var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
                    storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, add:int(shl:int(loadelement:byte(stack_2DD_0:byte[], var_5_2CD:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_2CD:int, xor:int(ldc:int(4097), ldc:int(4096)))), ldc:int(5)), xor:int(ldc:int(-24574), ldc:int(-24571)))))
                    
                    if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = var_3_2CC:byte[]
            }
        }
        
        Label_0156:
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-95296876))
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-130276444))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_38A = and:int(var_0_38A:int, ldc:int(-25166135))
            expr_D1 = arraylength:int(stack_D1_0:byte[])
            
            if (cmpne:boolean(expr_D1:int, ldc:int(0))) {
                var_4_261 = expr_D1:int
                var_3_266 = newarray:byte[](byte.class, expr_D1:int)
                var_5_267 = expr_D1:int
                goto(Label_0804)
            }
        }
        
        Label_0214:
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(64)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(485693318))
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0156)
            }
            
            if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_38A = and:int(var_0_38A:int, ldc:int(1334727971))
                goto(Label_0112)
            }
            
            var_0_38A = and:int(var_0_38A:int, ldc:int(-128511057))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_261 = expr_10B:int
                var_3_266 = newarray:byte[](byte.class, expr_10B:int)
                var_5_267 = expr_10B:int
                goto(Label_0895)
            }
        }
        
        Label_0272:
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(1918596493))
        }
        else {
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_38A = and:int(var_0_38A:int, ldc:int(-1460153031))
                goto(Label_0214)
            }
            
            if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(4)), ldc:int(0))) {
                var_0_38A = and:int(var_0_38A:int, ldc:int(653681346))
                goto(Label_0156)
            }
            
            if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_38A = and:int(var_0_38A:int, ldc:int(-377578547))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_412 = newarray:byte[](byte.class, expr_14D:int)
                var_5_413 = expr_14D:int
                
                loop {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-100677896))
                    var_5_413 = add:int(var_5_413:int, ldc:int(-1))
                    storeelement:byte(var_3_412:byte[], var_5_413:int, add:byte(loadelement:byte(stack_423_0:byte[], var_5_413:int), ldc:byte(50)))
                    
                    if (cmpne:boolean(var_5_413:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_28D_0 = stack_2DD_0 = stack_350_0 = stack_3A3_0 = stack_423_0 = var_3_412:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(128)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-568983607))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(64)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(737160760))
            goto(Label_0214)
        }
        
        if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-1414307526))
            goto(Label_0156)
        }
        
        if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_38A = and:int(var_0_38A:int, ldc:int(-624904869))
            goto(Label_0112)
        }
        
        var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_25A_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(142), ldc:int(1606)))
        expr_1B2 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9283), ldc:int(9285)))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(30210), ldc:int(-32323)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(12457), ldc:int(-13758)), and:int(ldc:int(8454), ldc:int(7190))))
        storeelement:String(expr_1B2:String[], xor:int(ldc:int(18500), ldc:int(18497)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(1319), ldc:int(158)), xor:int(ldc:int(4489), ldc:int(4487))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(3138), ldc:int(20630)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(3119), ldc:int(78)), xor:int(ldc:int(18601), ldc:int(18623))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(28829), ldc:int(68)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(6807), ldc:int(278)), and:int(ldc:int(24605), ldc:int(3517))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(277), ldc:int(577)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(-23989), ldc:int(-23978)), xor:int(ldc:int(1295), ldc:int(1324))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(643), ldc:int(2307)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(-31977), ldc:int(-31948)), and:int(ldc:int(16431), ldc:int(743))))
        putstatic:String[](\u7bad\ufcaf\u6cfe\ub1b9\u3c25::\ub18d\u3dd3\ubefe\uc87f\u0b8e\u8cae, expr_1B2:String[])
    }
    
    public void \u0c95\u71ae\ubb2b\u7e3f\u64ab\u5245(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(-591169396), ldc:int(1457635259))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\ufcaf\u6cfe\ub1b9\u3c25[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-1567542616))
        }
        else {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-36455255))
            var_5_85 = and:int(ldc:int(27780), ldc:int(-27782))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8588), ldc:int(-10653)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_66B:int, ldc:int(2143665069))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2187), ldc:int(1861)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(20480), ldc:int(20481)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_DA:int, ldc:int(1440849403))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4197), ldc:int(18705)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(924435792))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1784682280))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2110818840))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1000843766))
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2112060574))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1804486448))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1970478126))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(566035288))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-719311113))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2108975658))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-725147976))
                        var_11_EB = and:int(ldc:int(-5433), ldc:int(1336))
                        goto(Label_1509)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1702610261))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(208584544))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-44172925))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-322340198))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0665:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(888155751))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1781087259))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(624883987))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2121083933))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1112055009))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-59572581))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1742692008))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0809:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-587992338))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(18138899))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1493552302))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1332343412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(414322483))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(836376710))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1439505897))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-32184), ldc:int(-32183))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-405127779))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-929058467))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1075481210))
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(450270479))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-405284403))
                        var_11_EB = and:int(ldc:int(-15622), ldc:int(15621))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1763549635))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-2026717099))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1173569226))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1479124520))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(996019383))
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1173282785))
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(648913159))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(254408059))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1475468431))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1509)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1341:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1284426140))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2121512099))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1606453572))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1753703773))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-693052851))
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1085795224))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1567720162))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1866016769))
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(1575476216))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1509:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1520:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(822502574))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(781471904))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-324072970))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-126869409))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1767429350))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1253589946))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-268861460))
                        var_17_676 = add:int(var_16_119:int, and:int(ldc:int(9281), ldc:int(2723)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(1472461566))
                
                if (cmple:boolean(var_5_85 = var_17_676:int, sub:int(var_6_8C:int, xor:int(ldc:int(16422), ldc:int(16423))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(439647900))
            goto(Label_0106)
        }
    }
}
