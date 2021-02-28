public final class \u47c2\u2dcc\u12cb\ud171\u8c8a.\ub7dc\u8640\u9937\u92ee\u836c\ud7e8 {
    private void \ub7dc\u8640\u9937\u92ee\u836c\ud7e8(java.lang.String p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20 p1, int p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20 \u97b7\u6b0d\uc246\u4cd9\u527a\u9af2() {
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
            return:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20(getfield:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u873d\u7ce1\u7330\u1187\u3d4b\ud7e8, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public int \uc4d2\u5d20\ud523\u494c\ud158\u6cfe() {
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
            return:int(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ub113\ucfaf\u9033\ub1b9\u92ee\ud36e() {
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
            return:String(getfield:String(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u98a4\uc9f6\ubb2b\u93a2\u16f6\u61a4, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u6c56\u92ff\ubded\u6c52\u8d98\ucfaf() {
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
            return:ITextComponent(checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokevirtual:ITextComponent(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<ITextComponent>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, getfield:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<ITextComponent>(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u6d99\u4d85\u67e9\ub8be\uc238\u67d0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.OptionalInt \u8cae\u72f1\u99f7\ub8be\u3bd6\u62da() {
        var_1_96 : int
        stack_EC_0 : OptionalInt [generated]
        
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
            var_1_96 = and:int(ldc:int(-1321933816), ldc:int(759031773))
            
            if (cmpge:boolean(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), ldc:int(48))) {
                if (cmple:boolean(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), ldc:int(57))) {
                    return:OptionalInt(invokestatic:OptionalInt(OptionalInt::of, sub:int(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), ldc:int(48))))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_96:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_96 = and:int(var_1_96:int, ldc:int(24479211))
                }
                else {
                    var_1_96 = and:int(var_1_96:int, ldc:int(2109530874))
                    
                    if (cmpge:boolean(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), xor:int(ldc:int(10273), ldc:int(10593)))) {
                        if (cmple:boolean(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), and:int(ldc:int(18761), ldc:int(8555)))) {
                            stack_EC_0 = invokestatic:OptionalInt(OptionalInt::of, sub:int(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), and:int(ldc:int(4944), ldc:int(18892))))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_96:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_96 = and:int(var_1_96:int, ldc:int(-197134418))
                    stack_EC_0 = invokestatic:OptionalInt(OptionalInt::empty)
                    looporswitchbreak()
                }
            }
            
            return:OptionalInt(stack_EC_0:OptionalInt)
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_D4 : int
        var_4_C2 : \ub7dc\u8640\u9937\u92ee\u836c\ud7e8
        stack_102_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-1928830612), ldc:int(-574720663))
        
        if (cmpeq:boolean(this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8[expected:Object], p0:Object)) {
            return:boolean(xor:int[expected:boolean](ldc:int(768), ldc:int(769)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(1396194010))
            }
            else {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(395964527))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::getClass, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        var_4_C2 = checkcast:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ub7dc\u8640\u9937\u92ee\u836c\ud7e8.class, p0:Object[expected:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8])
                        
                        if (logicaland:boolean(cmpeq:boolean(getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, var_4_C2:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8)), cmpeq:boolean(getfield:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u873d\u7ce1\u7330\u1187\u3d4b\ud7e8, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8), getfield:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u873d\u7ce1\u7330\u1187\u3d4b\ud7e8, var_4_C2:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8)))) {
                            stack_102_0 = and:int(ldc:int(17473), ldc:int(8721))
                        }
                        else {
                            var_2_D4 = and:int(var_2_D4:int, ldc:int(-2061769606))
                            stack_102_0 = and:int(ldc:int(-24567), ldc:int(22102))
                        }
                        
                        return:boolean(stack_102_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_D4:int, ldc:int(16777216)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-508), ldc:int(377)))
            }
            
            var_2_5F = and:int(var_2_D4:int, ldc:int(89305945))
        }
    }
    
    public int hashCode() {
        expr_67 : Object[] [generated]
        
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
            expr_67 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2083), ldc:int(2081)))
            storeelement:Object(expr_67:Object[], and:int(ldc:int(-25869), ldc:int(25868)), getfield:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20[expected:Object](\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u873d\u7ce1\u7330\u1187\u3d4b\ud7e8, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))
            storeelement:Object(expr_67:Object[], xor:int(ldc:int(17), ldc:int(16)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u4975\u92ee\u4e72\u6b0d\uc238\ubcb0, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8)))
            return:int(invokestatic:int(Objects::hash, expr_67:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(getfield:String(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u98a4\uc9f6\ubb2b\u93a2\u16f6\u61a4, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    private static net.minecraft.util.text.ITextComponent lambda$\u3d64\u6c56\u3d4b\u7049\u8308\u8258$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20 p0, int p1, java.lang.String p2) {
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
            return:ITextComponent(checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(BiFunction<Integer, String, ITextComponent>::apply, invokestatic:BiFunction(\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20::\u446c\u416d\u16f6\ub32d\u4ab3\u99f7, p0:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20), invokestatic:Integer(Integer::valueOf, p1:int), p2:String)))
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u8640\u9937\u92ee\u836c\ud7e8(java.lang.String p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20 p1, int p2, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud36e\u92ee\u64ab\ud4fe\u4bc8\u47c2 p3) {
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
            invokespecial:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::<init>, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8, p0:String, p1:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20, p2:int)
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
            putstatic:Map<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>(\ub7dc\u8640\u9937\u92ee\u836c\ud7e8::\u8640\ub32d\ub18d\u5db4\u6ec6\u983f, invokestatic:HashMap[expected:Map<String, \ub7dc\u8640\u9937\u92ee\u836c\ud7e8>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u16f6\ua3b4\ufcaf\u4492\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(2133786222), ldc:int(2116723527))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(1868566686))
        }
        else {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-870689))
            var_5_85 = and:int(ldc:int(-19378), ldc:int(19377))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5953), ldc:int(-5970)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63C:int, ldc:int(1983625087))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12356), ldc:int(12357)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_D2:int, ldc:int(2133327614))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(320), ldc:int(321)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1803466561))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(420422333))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(676494697))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(543691668))
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-26217764))
                    }
                    else {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1999813582))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1110014327))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1353925806))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2100879466))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(794194730))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-995076172))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1763093863))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1991794476))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-4200578))
                        var_11_E3 = and:int(ldc:int(-28080), ldc:int(26017))
                        goto(Label_1484)
                    }
                    
                    Label_0584:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1494865537))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-92652064))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1549228931))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1584836713))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1583591324))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1396925907))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1237213082))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2145577943))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1685214325))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1979414587))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(769072529))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-26302593))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1986723406))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(535), ldc:int(8585))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0935:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-562459933))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(890683310))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1815834441))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(2023209518))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1391429156))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-915495838))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-151539113))
                        var_11_E3 = and:int(ldc:int(18626), ldc:int(-18635))
                    }
                    
                    Label_1109:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(927548196))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1598742198))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-506107460))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1884543732))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-64911078))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-163660953))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1344)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1593021375))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(2138811239))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1344:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1040599532))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1360010459))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(910388730))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1547283205))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-861057838))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(-1641905))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(22861258))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-190184323))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-305981408))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-13194641))
                        var_17_647 = add:int(var_16_111:int, and:int(ldc:int(25939), ldc:int(4101)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(-135093250))
                
                if (cmple:boolean(var_5_85 = var_17_647:int, sub:int(var_6_8C:int, xor:int(ldc:int(16388), ldc:int(16389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
