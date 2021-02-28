public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u718f\u61a4\u76bc\u624e\u0c95\u760c {
    public void \u718f\u61a4\u76bc\u624e\u0c95\u760c(com.mojang.authlib.GameProfile p0) {
        var_4_6B : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1
        var_5_76 : Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>
        
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
            invokespecial:Object(Object::<init>, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c)
            putfield:GameProfile(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\u93a2\u12cb\u59ec\u7ce1\u7049\u1187, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c, p0:GameProfile)
            var_4_6B = invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)
            var_5_76 = invokevirtual:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>(\ub113\ubefe\ua61f\u965f\u120d\u927d::\ub32d\ub113\ucb79\u6c52\u965f\u3776, invokevirtual:\ub113\ubefe\ua61f\u965f\u120d\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u071d\u718f\uae5d\u600f\u3e75\u40a9, var_4_6B:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:GameProfile)
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, var_5_76:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>, getstatic:MinecraftProfileTexture$Type[expected:Object](MinecraftProfileTexture$Type::SKIN)))) {
                putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u4e72\ub18d\uc84e\u99f7\ucfaf\u97e6, invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ub7dc\ub83f\u0c95\ub83f\u8bb0\u516c, p0:GameProfile)))
            }
            else {
                putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\ubefe\ua61f\u965f\u120d\u927d::\u2dcc\ud171\u0c95\u3e2a\u67e9\u927d, invokevirtual:\ub113\ubefe\ua61f\u965f\u120d\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u071d\u718f\uae5d\u600f\u3e75\u40a9, var_4_6B:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), checkcast:MinecraftProfileTexture(com.mojang.authlib.minecraft.MinecraftProfileTexture.class, invokeinterface:MinecraftProfileTexture(Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>::get, var_5_76:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>, getstatic:MinecraftProfileTexture$Type[expected:Object](MinecraftProfileTexture$Type::SKIN))), getstatic:MinecraftProfileTexture$Type(MinecraftProfileTexture$Type::SKIN)))
            }
            
            putfield:StringTextComponent(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\u527a\u839e\uc246\u624e\u759a\ua562, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c, initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(GameProfile::getName, p0:GameProfile)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\uc9f6\u6d69\ucfaf\u3d4b\u8d90(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6c52\u0800\u183a\ud7e8\ufcaf\u0800 p0) {
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
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), initobject:\uc84e\u6d69\u9033\u3711\u51fa[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\uc84e\u6d69\u9033\u3711\u51fa::<init>, invokevirtual:UUID(GameProfile::getId, getfield:GameProfile(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\u93a2\u12cb\u59ec\u7ce1\u7049\u1187, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \ube23\ubb2b\u9937\u4c2b\u52d3\u516c() {
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
            return:ITextComponent(getfield:StringTextComponent[expected:ITextComponent](\u718f\u61a4\u76bc\u624e\u0c95\u760c::\u527a\u839e\uc246\u624e\u759a\ua562, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u759a\u416d\u1187\u6435\uc910(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, int p2) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u718f\u61a4\u76bc\u624e\u0c95\u760c::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), div:float(i2f:float(p2:int), ldc:float(255.0f)))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, xor:int(ldc:int(1122), ldc:int(1120)), xor:int(ldc:int(1029), ldc:int(1031)), ldc:int(12), ldc:int(12), ldc:float(8.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, xor:int(ldc:int(264), ldc:int(266)), xor:int(ldc:int(-24191), ldc:int(-24189)), ldc:int(12), ldc:int(12), ldc:float(40.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4492\u4f4a\u0b8e\u0b8e\u3dd3\u4179() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(1188), ldc:int(1189)))
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
    
    public void \ud171\u927d\ua068\u59ec\uc4d2\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_636 : int
        
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
        var_3_62B = and:int(ldc:int(473476830), ldc:int(-9017377))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\u61a4\u76bc\u624e\u0c95\u760c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(218620805))
        }
        else {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-1103380729))
            var_5_85 = and:int(ldc:int(-12133), ldc:int(11620))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23373), ldc:int(19020)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62B:int, ldc:int(-1932460538))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24304), ldc:int(-24303)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(28977), ldc:int(3081)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62B = and:int(var_3_DA:int, ldc:int(1562245015))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1349), ldc:int(18435)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1842403717))
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-235892766))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-333664306))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-9367235))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1692814855))
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1968959723))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0635)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1823186183))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1863790382))
                            var_11_EB = and:int(ldc:int(-30908), ldc:int(28825))
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(660212187))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(986555687))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1940017554))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0635:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(649271124))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(836697106))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1946735120))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1989771944))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-258455058))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-919885114))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2109552559))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(244413986))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-994820586))
                            goto(Label_0635)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(636897720))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1086488602))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(680), ldc:int(681))
                                goto(Label_1034)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2087814727))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-971879377))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1965404232))
                            goto(Label_0635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1926158458))
                        var_11_EB = and:int(ldc:int(-12925), ldc:int(12912))
                    }
                    
                    Label_1034:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-665033901))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1425993443))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1989876818))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1153362985))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1671993073))
                            goto(Label_0635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(2024915582))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1303769030))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1298)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1682514694))
                            goto(Label_1034)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(183444914))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-321358907))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(915383177))
                            goto(Label_0635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-579473889))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(996221277))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-990120409))
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-809463615))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(707331891))
                        loopcontinue()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(-739657))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1432:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_636 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1443:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1475143635))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1676521705))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(151289198))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(89537924))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-27737779))
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-127205442))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1320447526))
                        var_17_636 = add:int(var_16_119:int, and:int(ldc:int(3715), ldc:int(16449)))
                        looporswitchbreak()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(584279933))
                }
                
                var_3_62B = and:int(var_3_62B:int, ldc:int(-2556410))
                
                if (cmple:boolean(var_5_85 = var_17_636:int, sub:int(var_6_8C:int, xor:int(ldc:int(1280), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-1187746290))
            goto(Label_0106)
        }
    }
}
