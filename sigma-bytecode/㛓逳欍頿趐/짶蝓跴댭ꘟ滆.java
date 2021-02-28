public class \u36d3\u9033\u6b0d\u983f\u8d90.\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6 {
    public void \uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6() {
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
            invokespecial:Object(Object::<init>, this:\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \ud523\uc4d2\ud12e\uc9f6\u4492\u8d90(java.lang.String p0) {
        var_1_5F : int
        stack_82_0 : String [generated]
        
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
            var_1_5F = and:int(ldc:int(314249781), ldc:int(-541353281))
            
            if (logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7006\u64f2\u6d69\u71f1\u8640\u965f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1079831852))
                stack_82_0 = invokestatic:String(TextFormatting::getTextWithoutFormattingCodes, p0:String)
            }
            else {
                stack_82_0 = p0:String
            }
            
            return:String(stack_82_0:String)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> \u392e\ub8be\u6b5f\u7873\ub102\u4cd9(net.minecraft.util.text.ITextProperties p0, int p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p2) {
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
    
    private static void lambda$\u8bb0\ua068\u8bb0\u5140\ud171\ubf56$1(java.util.List p0, net.minecraft.util.text.ITextProperties p1, java.lang.Boolean p2) {
        var_3_5F : int
        var_5_67 : \u718f\u8413\u1833\u72f1\u5fe1\u927d
        stack_8C_1 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        
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
            var_3_5F = and:int(ldc:int(-2050377338), ldc:int(-403768858))
            var_5_67 = invokevirtual:\u718f\u8413\u1833\u72f1\u5fe1\u927d(LanguageMap::func_241870_a, invokestatic:LanguageMap(LanguageMap::getInstance), p1:ITextProperties)
            
            if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, p2:Boolean))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-671449229))
                stack_8C_1 = var_5_67:\u718f\u8413\u1833\u72f1\u5fe1\u927d
            }
            else {
                stack_8C_1 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u7e3f\ua068\u6bb9\u494c\u8350\u6c56, getstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6::\u71f1\u946b\u8413\ua068\u718f\u7d52), var_5_67:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
            }
            
            invokeinterface:boolean(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::add, p0:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>, stack_8C_1:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$\u071d\u8bb0\u8bb0\uceb8\u52d3\uf94d$0(net.minecraft.util.text.TextPropertiesManager p0, net.minecraft.util.text.Style p1, java.lang.String p2) {
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
            invokevirtual:void(TextPropertiesManager::func_238155_a_, p0:TextPropertiesManager, invokestatic:ITextProperties(ITextProperties::func_240653_a_, invokestatic:String(\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6::\ud523\uc4d2\ud12e\uc9f6\u4492\u8d90, p2:String), p1:Style))
            return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
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
            putstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6::\u71f1\u946b\u8413\ua068\u718f\u7d52, invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u9033\uafe7\uc31c\u3d4b\u56bd\ubf56, ldc:int(32), getstatic:Style(Style::EMPTY)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\u600f\u7006\u156b\u61a4\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_68A : int
        
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
        var_3_67F = and:int(ldc:int(-1131248200), ldc:int(1809793776))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-2112880663))
        }
        else {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-6627644))
            var_5_85 = and:int(ldc:int(-18984), ldc:int(16935))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27733), ldc:int(27732)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_67F:int, ldc:int(972474553))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, xor:int(ldc:int(513), ldc:int(512)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, and:int(ldc:int(2147), ldc:int(1041)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_67F = and:int(var_3_D3:int, ldc:int(781960343))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17009), ldc:int(267)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1051255973))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1255586990))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1767003398))
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(663669569))
                    }
                    else {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1788046075))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-212672221))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1089159745))
                        goto(Label_0813)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-935875655))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1291808026))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1344623398))
                        var_11_E4 = and:int(ldc:int(-18410), ldc:int(17121))
                        goto(Label_1521)
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1845350185))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-888590801))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-785652513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2125929211))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1647312783))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-2087849484))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1489336497))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1677507354))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1859549076))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0813:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(426764341))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1597959108))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1667294316))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1484701883))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-809588881))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2046264500))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = and:int(ldc:int(6663), ldc:int(8201))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0947:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(804685204))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1950208597))
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1025967054))
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(2108312166))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-2000923819))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-4824368))
                        var_11_E4 = and:int(ldc:int(-2823), ldc:int(2822))
                    }
                    
                    Label_1115:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-835397321))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0947)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1145741471))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(388685021))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-793212264))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-107828325))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-746998981))
                            goto(Label_1115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0947)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-153762235))
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1566306483))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(628694974))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(507044373))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-33603626))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                        goto(Label_1521)
                    }
                    
                    Label_1385:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2047770416))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-894029152))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1588799607))
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-452918458))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(2092364462))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(514388101))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-332521107))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1170788169))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-162976165))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1302831439))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1861642699))
                        var_17_68A = add:int(var_16_112:int, xor:int(ldc:int(5640), ldc:int(5641)))
                        looporswitchbreak()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(954684554))
                }
                
                var_3_67F = and:int(var_3_67F:int, ldc:int(-1449925701))
                
                if (cmple:boolean(var_5_85 = var_17_68A:int, sub:int(var_6_8C:int, xor:int(ldc:int(-29664), ldc:int(-29663))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
