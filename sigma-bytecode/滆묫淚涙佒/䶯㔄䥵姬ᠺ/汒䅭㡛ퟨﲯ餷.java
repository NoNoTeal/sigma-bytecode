public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6c52\u416d\u385b\ud7e8\ufcaf\u9937 {
    private void \u6c52\u416d\u385b\ud7e8\ufcaf\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u7bad\u624e\uf995\uafe7\u6b0d\u36d3 p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56 p1, net.minecraft.util.text.ITextComponent p2) {
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
    
    public void \u8413\u4492\uc2e8\u946b\u1187\u516c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, float p9) {
        var_11_61 : int
        stack_97_0 : int [generated]
        var_11_95 : int
        var_13_97 : int
        stack_11B_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_11B_1 : int [generated]
        var_11_119 : int
        var_14_155 : int
        var_15_202 : \u40a9\u36d3\u183a\u446c\u3504\ubf56[]
        var_16_207 : int
        var_17_210 : int
        var_18_22C : \u40a9\u36d3\u183a\u446c\u3504\ubf56
        var_11_16E : int
        
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
            var_11_61 = and:int(ldc:int(773734261), ldc:int(2096692725))
            
            if (cmpne:boolean(getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\ua068\u7bad\u392e\u7330\u7043\ud7e8::\u71f1\uc87f\u7ce1\u12b2\u16f6\u8413, invokestatic:\ua068\u7bad\u392e\u7330\u7043\ud7e8(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\uc4d2\u5654\u6d99\u6435\u6d99\u3504, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))), getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))) {
                var_11_61 = and:int(var_11_61:int, ldc:int(-839042057))
                stack_97_0 = and:int(ldc:int(-6703), ldc:int(6702))
            }
            else {
                stack_97_0 = xor:int(ldc:int(4272), ldc:int(4273))
            }
            
            var_11_95 = and:int(var_11_61:int, ldc:int(-828786251))
            var_13_97 = stack_97_0:int
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u8258\u7d52\uc229\u3dd3\ud51e\u7049, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\ud36e\u4bc8\ua6bd\uc2bd\u6435\u92ee, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), i2f:float(sub:int(add:int(p3:int, ldc:int(90)), invokestatic:int(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u416d\u76bc\u8308\ud217\u61a4\u12cb, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)))), i2f:float(sub:int(add:int(p2:int, div:int(p5:int, xor:int(ldc:int(16458), ldc:int(16456)))), and:int(ldc:int(10244), ldc:int(53)))), ldc:int(16777215))
            putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), add:int(p3:int, xor:int(ldc:int(14486), ldc:int(14376))))
            putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p2:int)
            stack_11B_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
            
            if (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u8d90\u516c\uc4d2\u1833\ub83f\uc7fe, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))) {
                var_11_95 = and:int(var_11_95:int, ldc:int(1589279667))
                stack_11B_1 = and:int(ldc:int(-5323), ldc:int(5322))
            }
            else {
                stack_11B_1 = and:int(ldc:int(8211), ldc:int(609))
            }
            
            var_11_119 = and:int(var_11_95:int, ldc:int(1052376439))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_11B_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_11B_1:boolean)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:int, p7:int, p9:float)
            putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), add:int(p3:int, ldc:int(105)))
            putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p2:int)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), invokevirtual:ITextComponent(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u7873\u4d85\ub18d\u9af2\u8389\ud51e, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)))
            var_14_155 = and:int(ldc:int(-28703), ldc:int(28702))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u3504\u0a06\u8aa5\u156b\u156b\u6b0d, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)))) {
                var_15_202 = getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56[](\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u61a4\u6d69\u67e9\uc2bd\u760c\u6cfe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u8258\u7d52\uc229\u3dd3\ud51e\u7049, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))))
                var_16_207 = arraylength:int(var_15_202:\u40a9\u36d3\u183a\u446c\u3504\ubf56[])
                var_17_210 = and:int(ldc:int(-27028), ldc:int(26643))
                
                loop {
                    var_11_119 = and:int(var_11_119:int, ldc:int(1830567925))
                    
                    if (cmpge:boolean(var_17_210:int, var_16_207:int)) {
                        looporswitchbreak()
                    }
                    
                    var_18_22C = loadelement:\u40a9\u36d3\u183a\u446c\u3504\ubf56(var_15_202:\u40a9\u36d3\u183a\u446c\u3504\ubf56[], var_17_210:int)
                    
                    if (logicaland:boolean(cmpne:boolean(var_18_22C:\u40a9\u36d3\u183a\u446c\u3504\ubf56, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)), invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u16f6\ucef1\u4cd9\u92ee\ub7dc\u4ab3, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u67d0\u7006\u8350\ub70c\u6ec6\ubb2b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), var_18_22C:\u40a9\u36d3\u183a\u446c\u3504\ubf56))) {
                        var_14_155 = xor:int(ldc:int(20520), ldc:int(20521))
                        looporswitchbreak()
                    }
                    
                    inc:int(var_17_210, ldc:int(1))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_11_119:int, ldc:int(16)), ldc:int(0))) {
                    var_11_16E = and:int(var_11_119:int, ldc:int(1157519985))
                    goto(Label_0439)
                }
                
                if (cmpeq:boolean(and:int(var_11_119:int, ldc:int(8192)), ldc:int(0))) {
                    var_11_16E = and:int(var_11_119:int, ldc:int(-270192255))
                }
                else {
                    var_11_16E = and:int(var_11_119:int, ldc:int(-572768903))
                    
                    if (cmpne:boolean(var_13_97:int, ldc:int(0))) {
                        invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent[expected:TextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u7006\u718f\u527a\u36d3\u3bc9\u5245), xor:int(ldc:int(17088), ldc:int(17089)))), invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, invokevirtual:ITextComponent(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ufcaf\u927d\u6c52\u97b7\uc2e8\ud217, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))), getstatic:TextFormatting(TextFormatting::YELLOW))), loadelement:String(getstatic:String[](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u7006\u718f\u527a\u36d3\u3bc9\u5245), and:int(ldc:int(6282), ldc:int(35)))), getstatic:TextFormatting(TextFormatting::YELLOW)))
                        goto(Label_0439)
                    }
                }
                
                Label_0401:
                
                if (cmpeq:boolean(and:int(var_11_16E:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_11_16E:int, ldc:int(1)), ldc:int(0))) {
                        var_11_119 = and:int(var_11_16E:int, ldc:int(-1133696985))
                        loopcontinue()
                    }
                    
                    var_11_16E = and:int(var_11_16E:int, ldc:int(-558089743))
                    
                    if (cmpne:boolean(var_14_155:int, ldc:int(0))) {
                        invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, invokevirtual:ITextComponent(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ufcaf\u927d\u6c52\u97b7\uc2e8\ud217, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))), getstatic:TextFormatting(TextFormatting::RED)))
                    }
                }
                
                Label_0439:
                
                if (cmpne:boolean(and:int(var_11_16E:int, ldc:int(16384)), ldc:int(0))) {
                    var_11_16E = and:int(var_11_16E:int, ldc:int(-1576134458))
                    goto(Label_0401)
                }
                
                if (cmpne:boolean(and:int(var_11_16E:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_11_119 = and:int(var_11_16E:int, ldc:int(982922068))
            }
            
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:int, p7:int, p9:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<? extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753> \u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b() {
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
            return:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(invokestatic:ImmutableList[expected:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>](ImmutableList::of, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:Object](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:Object](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:double, p1:double, p2:int))) {
            return:boolean(invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:double, p1:double, p2:int))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(24837), ldc:int(1033)))
    }
    
    public boolean \ucb79\ua61f\ub18d\u416d\u416d\uc246(double p0, double p1, int p2) {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ucb79\ua61f\ub18d\u416d\u416d\uc246, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u1833\ud523\uc229\u7bad\u416d\u946b, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:double, p1:double, p2:int), invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ucb79\ua61f\ub18d\u416d\u416d\uc246, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u47c2\u120d\u4bc8\ubded\u4f52\ud4fe, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937), p0:double, p1:double, p2:int)), and:int(ldc:int(2049), ldc:int(18233)), and:int(ldc:int(2082), ldc:int(-2083))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4179\u4f4a\ube23\u416d\ufcaf\ucb79$1(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
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
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7c6b\ub18d\u74b1\ubff1\uae5d\u8640, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\u8258\u7d52\uc229\u3dd3\ud51e\u7049, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937))), p0:\u40a9\u36d3\u183a\u446c\u3504\ubf56, invokevirtual:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u16f6\u12b2\u5bc4\u8df4\u718f\u4e72, p0:\u40a9\u36d3\u183a\u446c\u3504\ubf56))
            invokestatic:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u4975\uafe7\ub19c\u4e72\u6b5f\ucfaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8d98\u4179\u385b\u6bb9\u416d\u7bad$0(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
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
            putfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\ua068\u7bad\u392e\u7330\u7043\ud7e8::\u71f1\uc87f\u7ce1\u12b2\u16f6\u8413, invokestatic:\ua068\u7bad\u392e\u7330\u7043\ud7e8(\u7bad\u624e\uf995\uafe7\u6b0d\u36d3::\uc4d2\u5654\u6d99\u6435\u6d99\u3504, getfield:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u600f\u3711\u3504\u3d64\ud217\uf995, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)), p0:\u40a9\u36d3\u183a\u446c\u3504\ubf56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u416d\u385b\ud7e8\ufcaf\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u7bad\u624e\uf995\uafe7\u6b0d\u36d3 p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56 p1, net.minecraft.util.text.ITextComponent p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u97e6\u4975\u836c\u7ce1\u36d3\ucb79 p3) {
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
            invokespecial:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937(\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::<init>, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937, p0:\u7bad\u624e\uf995\uafe7\u6b0d\u36d3, p1:\u40a9\u36d3\u183a\u446c\u3504\ubf56, p2:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_91_0 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_102_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1C1_0 : byte[] [generated]
        stack_1FC_0 : byte[] [generated]
        stack_25A_0 : byte[] [generated]
        stack_2E1_0 : byte[] [generated]
        var_4_1A2 : int
        var_3_1A7 : byte[]
        var_5_1A8 : int
        var_0_274 : int
        expr_25A : byte [generated]
        stack_2AC_2 : byte [generated]
        stack_280_0 : byte [generated]
        var_2_91 : byte[]
        expr_95 : int [generated]
        var_3_1EA : byte[]
        var_5_1EB : int
        expr_CD : int [generated]
        expr_104 : int [generated]
        var_3_2CF : byte[]
        var_5_2D0 : int
        expr_2E4 : byte [generated]
        var_3_132 : String
        stack_19B_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(1114232488), ldc:int(1207819499))
        expr_6E = arraylength:int(stack_91_0 = stack_93_0 = stack_CB_0 = stack_CD_0 = stack_102_0 = stack_104_0 = stack_126_0 = stack_1C1_0 = stack_1FC_0 = stack_25A_0 = stack_2E1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4+BiaJTko19kJSGftc6nXmidWQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A2 = expr_6E:int
        var_3_1A7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A8 = expr_6E:int
        Label_0426:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(65536)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-160708194))
            var_5_1A8 = add:int(var_5_1A8:int, ldc:int(-1))
            storeelement:byte(var_3_1A7:byte[], var_5_1A8:int, add:byte(loadelement:byte(stack_1C1_0:byte[], var_5_1A8:int), ldc:byte(31)))
            
            if (cmpne:boolean(var_5_1A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_CB_0 = stack_CD_0 = stack_102_0 = stack_104_0 = stack_126_0 = stack_1C1_0 = stack_1FC_0 = stack_25A_0 = stack_2E1_0 = var_3_1A7:byte[]
            goto(Label_0115)
        }
        
        Label_0579:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_274 = and:int(var_0_61:int, ldc:int(-277875992))
            var_5_1A8 = add:int(var_5_1A8:int, ldc:int(-1))
            expr_25A = stack_2AC_2 = loadelement(stack_25A_0, var_5_1A8)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A8:int, ldc:int(1)), neg:int(var_4_1A2:int)), ldc:int(0))) {
                stack_2AC_2 = stack_280_0 = add:byte(expr_25A:byte, loadelement:byte(var_3_1A7:byte[], add:int(var_5_1A8:int, ldc:int(1))))
                goto(Label_0656)
            }
            
            Label_0615:
            
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(1436431512))
            }
            else {
                var_0_274 = and:int(var_0_274:int, ldc:int(1971176366))
                stack_2AC_2 = stack_280_0 = add:byte(expr_25A:byte, ldc:byte(1))
            }
            
            Label_0656:
            
            if (cmpne:boolean(and:int(var_0_274:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(-282678548))
                goto(Label_0615)
            }
            
            var_0_61 = and:int(var_0_274:int, ldc:int(-932184594))
            storeelement:byte(var_3_1A7:byte[], var_5_1A8:int, stack_2AC_2:byte)
            
            if (cmpne:boolean(var_5_1A8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_CB_0 = stack_CD_0 = stack_102_0 = stack_104_0 = stack_126_0 = stack_1C1_0 = stack_1FC_0 = stack_25A_0 = stack_2E1_0 = var_3_1A7:byte[]
            goto(Label_0210)
        }
        
        goto(Label_0426)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0265)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1273611178))
            var_2_91 = stack_91_0:byte[]
            expr_95 = add:int(arraylength:int(stack_93_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_3_1EA = newarray:byte[](byte.class, expr_95:int)
                var_5_1EB = expr_95:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-420741736))
                    var_5_1EB = add:int(var_5_1EB:int, ldc:int(-1))
                    storeelement:byte(var_3_1EA:byte[], var_5_1EB:int, add:int(shl:int(loadelement:byte(stack_1FC_0:byte[], var_5_1EB:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_91:byte[], add:int(var_5_1EB:int, and:int(ldc:int(777), ldc:int(24577)))), ldc:int(2)), and:int(ldc:int(21183), ldc:int(9279)))))
                    
                    if (cmpne:boolean(var_5_1EB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_CB_0 = stack_CD_0 = stack_102_0 = stack_104_0 = stack_126_0 = stack_1C1_0 = stack_1FC_0 = stack_25A_0 = stack_2E1_0 = var_3_1EA:byte[]
            }
        }
        
        Label_0154:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0265)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1562309340))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1888092731))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(2112740751))
            expr_CD = arraylength:int(stack_CD_0:byte[])
            
            if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                var_4_1A2 = expr_CD:int
                var_3_1A7 = newarray:byte[](byte.class, expr_CD:int)
                var_5_1A8 = expr_CD:int
                goto(Label_0579)
            }
        }
        
        Label_0210:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(524288)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(771330014))
                goto(Label_0154)
            }
            
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-147988602))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-864299638))
            expr_104 = arraylength:int(stack_104_0:byte[])
            
            if (cmpne:boolean(expr_104:int, ldc:int(0))) {
                var_3_2CF = newarray:byte[](byte.class, expr_104:int)
                var_5_2D0 = expr_104:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1592389887))
                    var_5_2D0 = add:int(var_5_2D0:int, ldc:int(-1))
                    expr_2E4 = xor:byte(loadelement:byte(stack_2E1_0:byte[], var_5_2D0:int), ldc:byte(88))
                    storeelement:byte(var_3_2CF:byte[], var_5_2D0:int, or:int(and:int(shl:int(expr_2E4:byte, and:int(ldc:int(4294), ldc:int(24861))), ldc:int(-16)), and:int(shr:int(expr_2E4:byte[expected:int], and:int(ldc:int(16516), ldc:int(10508))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2D0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_CB_0 = stack_CD_0 = stack_102_0 = stack_104_0 = stack_126_0 = stack_1C1_0 = stack_1FC_0 = stack_25A_0 = stack_2E1_0 = var_3_2CF:byte[]
            }
        }
        
        Label_0265:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_19B_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2823), ldc:int(13315)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1571), ldc:int(24771)))
            storeelement:String(expr_144:String[], and:int(ldc:int(24578), ldc:int(82)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(6082), ldc:int(-6083)), xor:int(ldc:int(1066), ldc:int(1064))))
            storeelement:String(expr_144:String[], and:int(ldc:int(5697), ldc:int(275)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(17152), ldc:int(17154)), xor:int(ldc:int(27), ldc:int(31))))
            storeelement:String(expr_144:String[], and:int(ldc:int(-1341), ldc:int(1340)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(18946), ldc:int(18950)), xor:int(ldc:int(5633), ldc:int(5651))))
            putstatic:String[](\u6c52\u416d\u385b\ud7e8\ufcaf\u9937::\u7006\u718f\u527a\u36d3\u3bc9\u5245, expr_144:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u0a06\u516c\u76bc\u5fe1\u61a4\u946b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_695 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A0 : int
        
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
        var_3_695 = and:int(ldc:int(-1138151973), ldc:int(-1205928712))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\u416d\u385b\ud7e8\ufcaf\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
            var_3_695 = and:int(var_3_695:int, ldc:int(1568552079))
        }
        else {
            var_3_695 = and:int(var_3_695:int, ldc:int(-1213526786))
            var_5_8A = and:int(ldc:int(-31868), ldc:int(25691))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11070), ldc:int(2621)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_695:int, ldc:int(-1277407491))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(8772), ldc:int(8773)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(5144), ldc:int(5145)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_695 = and:int(var_3_E3:int, ldc:int(-110555688))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(4496), ldc:int(4497)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1905783882))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(119352539))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1862454877))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1146545131))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(637365721))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1192268327))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(312318959))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(19041382))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1780907109))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-111621890))
                            var_11_F4 = and:int(ldc:int(-18361), ldc:int(17336))
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0583:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1918441057))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1666291594))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-229136001))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1624534330))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1935090539))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-50684168))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-861707566))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1431890931))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-603071551))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-612831969))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(135881717))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1352481319))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-49487907))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1575740069))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(561092452))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1607673463))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1728232628))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(670294103))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1582528327))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-25220355))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(2049), ldc:int(1051))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-269304963))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1202907083))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-264450564))
                        var_11_F4 = and:int(ldc:int(-4602), ldc:int(4521))
                    }
                    
                    Label_1147:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(220191499))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-32228255))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1277330946))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1254:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1351567712))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1524771520))
                            goto(Label_1147)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(16)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1112452815))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1734800301))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(843290276))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1317498914))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(804531333))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(218835631))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1304669232))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-975733388))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1363844730))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_695 = and:int(var_3_695:int, ldc:int(-1302544418))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A0 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-887640782))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1374178307))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1951625942))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-841121911))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(8)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1417349741))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-353825564))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1151668486))
                        var_17_6A0 = add:int(var_16_122:int, xor:int(ldc:int(-30686), ldc:int(-30685)))
                        looporswitchbreak()
                    }
                }
                
                var_3_695 = and:int(var_3_695:int, ldc:int(-1253439235))
                
                if (cmple:boolean(var_5_8A = var_17_6A0:int, sub:int(var_6_91:int, xor:int(ldc:int(-31584), ldc:int(-31583))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_695 = and:int(var_3_695:int, ldc:int(-284519531))
            goto(Label_0108)
        }
    }
}
