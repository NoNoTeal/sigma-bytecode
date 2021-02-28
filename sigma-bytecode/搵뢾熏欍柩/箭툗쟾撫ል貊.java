public class \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a {
    private void \u7bad\ud217\uc7fe\u64ab\u120d\u8c8a(java.lang.String p0, java.util.List<net.minecraft.util.text.Style> p1, it.unimi.dsi.fastutil.ints.Int2IntFunction p2) {
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
            invokespecial:Object(Object::<init>, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a)
            putfield:String(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u72f1\u1833\uc3e3\u759a\u624e\u3bc9, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, p0:String)
            putfield:List<Style>(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u5fe1\u6c52\u3504\u873d\ub7dc\uff55, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, invokestatic:ImmutableList[expected:List<Style>](ImmutableList::copyOf, p1:List<Style>[expected:Collection]))
            putfield:Int2IntFunction(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, p2:Int2IntFunction)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u873d\uc246\u9a18\u72f1\u61a4\ubf56() {
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
            return:String(getfield:String(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u72f1\u1833\uc3e3\u759a\u624e\u3bc9, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> \u7330\uff55\u527a\ub171\u93a2\u5654(int p0, int p1, boolean p2) {
        var_4_61 : int
        var_4_133 : int
        var_6_71 : ArrayList
        var_7_80 : Style
        var_8_83 : int
        var_9_8C : int
        var_10_EE : int
        var_11_FE : Style
        var_12_126 : String
        stack_155_0 : ArrayList [generated]
        stack_155_1 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        var_4_183 : int
        var_9_176 : String
        stack_1A5_0 : ArrayList [generated]
        stack_1A5_1 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        stack_1B7_0 : List [generated]
        
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
        var_4_61 = and:int(ldc:int(1713050765), ldc:int(-1088964628))
        
        if (cmpne:boolean(p1:int, ldc:int(0))) {
            var_4_133 = and:int(var_4_61:int, ldc:int(1417409725))
            var_6_71 = invokestatic:ArrayList(Lists::newArrayList)
            var_7_80 = checkcast:Style(net.minecraft.util.text.Style.class, invokeinterface:Style(List<Style>::get, getfield:List<Style>(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u5fe1\u6c52\u3504\u873d\ub7dc\uff55, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a), p0:int))
            var_8_83 = p0:int
            var_9_8C = and:int(ldc:int(97), ldc:int(26627))
            
            while (cmplt:boolean(var_9_8C:int, p1:int)) {
                var_10_EE = add:int(p0:int, var_9_8C:int)
                var_11_FE = checkcast:Style(net.minecraft.util.text.Style.class, invokeinterface:Style(List<Style>::get, getfield:List<Style>(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u5fe1\u6c52\u3504\u873d\ub7dc\uff55, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a), var_10_EE:int))
                
                if (logicalnot:boolean(invokevirtual:boolean(Style::equals, var_11_FE:Style, var_7_80:Style[expected:Object]))) {
                    var_12_126 = invokevirtual:String(String::substring, getfield:String(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u72f1\u1833\uc3e3\u759a\u624e\u3bc9, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a), var_8_83:int, var_10_EE:int)
                    stack_155_0 = var_6_71:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>
                    
                    if (logicalnot:boolean(p2:boolean)) {
                        var_4_133 = and:int(var_4_133:int, ldc:int(500215695))
                        stack_155_1 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u071d\u9937\ud523\uae5d\u759a\uc238, var_12_126:String, var_7_80:Style)
                    }
                    else {
                        stack_155_1 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u6c52\uc229\uc246\u51b2\ubcb0\ud51e, var_12_126:String, var_7_80:Style, getfield:Int2IntFunction(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a))
                    }
                    
                    var_4_133 = and:int(var_4_133:int, ldc:int(-302878770))
                    invokeinterface:boolean(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::add, stack_155_0:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>[expected:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>], stack_155_1:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
                    var_7_80 = var_11_FE:Style
                    var_8_83 = var_10_EE:int
                }
                
                var_4_133 = and:int(var_4_133:int, ldc:int(-432093538))
                inc:int(var_9_8C, ldc:int(1))
            }
            
            var_4_183 = and:int(var_4_133:int, ldc:int(-1348585588))
            
            if (cmplt:boolean(var_8_83:int, add:int(p0:int, p1:int))) {
                var_9_176 = invokevirtual:String(String::substring, getfield:String(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u72f1\u1833\uc3e3\u759a\u624e\u3bc9, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a), var_8_83:int, add:int(p0:int, p1:int))
                stack_1A5_0 = var_6_71:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>
                
                if (logicalnot:boolean(p2:boolean)) {
                    var_4_183 = and:int(var_4_183:int, ldc:int(1306510572))
                    stack_1A5_1 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u071d\u9937\ud523\uae5d\u759a\uc238, var_9_176:String, var_7_80:Style)
                }
                else {
                    stack_1A5_1 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u6c52\uc229\uc246\u51b2\ubcb0\ud51e, var_9_176:String, var_7_80:Style, getfield:Int2IntFunction(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a))
                }
                
                var_4_183 = and:int(var_4_183:int, ldc:int(1331301534))
                invokeinterface:boolean(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::add, stack_1A5_0:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>[expected:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>], stack_1A5_1:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_183:int, ldc:int(67108864)), ldc:int(0))) {
                    var_4_183 = and:int(var_4_183:int, ldc:int(343758301))
                    
                    if (p2:boolean) {
                        stack_1B7_0 = invokestatic:List(Lists::reverse, var_6_71:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>[expected:List])
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_183:int, ldc:int(1048576)), ldc:int(0))) {
                    stack_1B7_0 = var_6_71:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>[expected:List]
                    looporswitchbreak()
                }
                
                var_4_183 = and:int(var_4_183:int, ldc:int(-574934721))
            }
            
            return:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(stack_1B7_0:List)
        }
        
        return:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(invokestatic:ImmutableList[expected:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>](ImmutableList::of))
    }
    
    public static \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a \u760c\uae5d\ud7e8\u4c2b\u7873\u40a9(net.minecraft.util.text.ITextProperties p0, it.unimi.dsi.fastutil.ints.Int2IntFunction p1, java.util.function.UnaryOperator<java.lang.String> p2) {
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
    
    private static java.util.Optional lambda$\uf94d\ubf56\u946b\u4f4a\u946b\ud4fe$1(java.lang.StringBuilder p0, java.util.List p1, net.minecraft.util.text.Style p2, java.lang.String p3) {
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
    
    private static boolean lambda$\u4c2b\uae5d\u416d\u3711\ud36e\ud36e$0(java.lang.StringBuilder p0, java.util.List p1, int p2, net.minecraft.util.text.Style p3, int p4) {
        var_5_61 : int
        var_7_6F : int
        var_8_78 : int
        
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
            var_5_61 = and:int(ldc:int(-797692246), ldc:int(-354646369))
            invokevirtual:StringBuilder(StringBuilder::appendCodePoint, p0:StringBuilder, p4:int)
            var_7_6F = invokestatic:int(Character::charCount, p4:int)
            var_8_78 = and:int(ldc:int(425), ldc:int(-426))
            
            loop {
                var_5_61 = and:int(var_5_61:int, ldc:int(-537581894))
                
                if (cmpge:boolean(var_8_78:int, var_7_6F:int)) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<Style>::add, p1:List<Style>, p3:Style)
                inc:int(var_8_78, ldc:int(1))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(8209), ldc:int(18733)))
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
    
    public void \u7d52\ubb2b\u392e\uc87f\u4cd9\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_658 : int
        
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
        var_3_64D = and:int(ldc:int(-182357069), ldc:int(-1792149826))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-1749156122))
            var_5_7D = and:int(ldc:int(10812), ldc:int(-27389))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21025), ldc:int(-22050)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_64D:int, ldc:int(-579933261))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, and:int(ldc:int(149), ldc:int(26145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, and:int(ldc:int(4161), ldc:int(3767)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_64D = and:int(var_3_D6:int, ldc:int(-1082392847))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1947), ldc:int(6145)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1119901398))
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(388055201))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-489676947))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1952545727))
                    }
                    else {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-576063568))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0560)
                            }
                            
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1866760170))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-401887485))
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-915342285))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1212419078))
                            var_11_E7 = and:int(ldc:int(9664), ldc:int(-9665))
                            goto(Label_1501)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0560:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1726599208))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-883619332))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-476836119))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1582239525))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1847571468))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1112348402))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(93610211))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1063313685))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1646231898))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1331560273))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-529328839))
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(512652286))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1391685402))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1318147))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0851:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-344015035))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-576358472))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(9289), ldc:int(929))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1982698615))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-584245844))
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-810722939))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-243003097))
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-3535012))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1746738512))
                        var_11_E7 = and:int(ldc:int(-1092), ldc:int(1091))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1245348146))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-419022532))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-2034798263))
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1539258550))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1082595673))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1366)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(757503554))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-310682126))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0851)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(794685827))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1083770199))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                            goto(Label_1501)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1366:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-623101479))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2072174636))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1673044807))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1530189023))
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(-148413765))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1501:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_658 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1512:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-63742124))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(196640385))
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-721845604))
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1750536222))
                        var_17_658 = add:int(var_16_115:int, and:int(ldc:int(4105), ldc:int(25635)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64D = and:int(var_3_64D:int, ldc:int(-575542362))
                
                if (cmple:boolean(var_5_7D = var_17_658:int, sub:int(var_6_84:int, xor:int(ldc:int(640), ldc:int(641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-434505963))
            goto(Label_0106)
        }
    }
}
