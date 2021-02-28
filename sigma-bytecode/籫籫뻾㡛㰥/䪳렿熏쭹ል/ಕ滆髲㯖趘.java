public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u0c95\u6ec6\u9af2\u3bd6\u8d98 {
    public void \u0c95\u6ec6\u9af2\u3bd6\u8d98(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
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
    
    private void \ub19c\u7873\u4d85\u3e2a\u624e\u8d98() {
        var_3_6D : long
        stack_142_0 : int[] [generated]
        expr_11E : int [generated]
        
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
            var_3_6D = sub:long(invokevirtual:long(Runtime::totalMemory, invokestatic:Runtime(Runtime::getRuntime)), invokevirtual:long(Runtime::freeMemory, invokestatic:Runtime(Runtime::getRuntime)))
            storeelement:String(getfield:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u52d3\u8aa5\u3d64\u92ff\u071d\u72f1, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98), and:int(ldc:int(-30011), ldc:int(21554)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u6d99\u4f52\u446c\u5654\u3776\u3e2a), and:int(ldc:int(-20155), ldc:int(17962)))), div:long(div:long(var_3_6D:long, ldc:long(1024L)), ldc:long(1024L))), loadelement:String(getstatic:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u6d99\u4f52\u446c\u5654\u3776\u3e2a), xor:int(ldc:int(-14208), ldc:int(-14207)))), div:long(mul:long(invokevirtual:long(Runtime::freeMemory, invokestatic:Runtime(Runtime::getRuntime)), ldc:long(100L)), invokevirtual:long(Runtime::maxMemory, invokestatic:Runtime(Runtime::getRuntime)))), loadelement:String(getstatic:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u6d99\u4f52\u446c\u5654\u3776\u3e2a), and:int(ldc:int(17666), ldc:int(10331))))))
            storeelement:String(getfield:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u52d3\u8aa5\u3d64\u92ff\u071d\u72f1, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98), xor:int(ldc:int(514), ldc:int(515)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u6d99\u4f52\u446c\u5654\u3776\u3e2a), xor:int(ldc:int(6336), ldc:int(6339)))), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\ufcaf\ud7e8\ud158\u6435\u759a\u6435), mul:double(invokespecial:double(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u624e\ua61f\u392e\ubb2b\u64ab\uc238, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98, getfield:long[](\u88c5\ud171\ub113\u6435\ud51e::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u61a4\u600f\uae87\ube23\u927d\u4179, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98))), ldc:double(1.0E-6)))), loadelement:String(getstatic:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u6d99\u4f52\u446c\u5654\u3776\u3e2a), xor:int(ldc:int(533), ldc:int(529))))))
            stack_142_0 = getfield:int[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98)
            expr_11E = getfield:int(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u8350\ub70c\u8753\u0800\u0c95\ud217, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98)
            putfield:int(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u8350\ub70c\u8753\u0800\u0c95\ud217, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98, add:int(expr_11E:int, and:int(ldc:int(16641), ldc:int(11267))))
            storeelement:int(stack_142_0:int[], and:int(expr_11E:int, and:int(ldc:int(6399), ldc:int(8447))), l2i:int(div:long(mul:long(var_3_6D:long, ldc:long(100L)), invokevirtual:long(Runtime::maxMemory, invokestatic:Runtime(Runtime::getRuntime)))))
            invokevirtual:void(Component::repaint, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98[expected:Component])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private double \u624e\ua61f\u392e\ubb2b\u64ab\uc238(long[] p0) {
        var_2_5F : int
        var_4_61 : long
        var_7_69 : int
        var_8_72 : int
        
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
            var_2_5F = and:int(ldc:int(-695085175), ldc:int(-923293763))
            var_4_61 = ldc:long(0L)
            var_7_69 = arraylength:int(p0:long[])
            var_8_72 = and:int(ldc:int(-27745), ldc:int(27744))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-2071201797))
                
                if (cmpge:boolean(var_8_72:int, var_7_69:int)) {
                    looporswitchbreak()
                }
                
                var_4_61 = add:long(var_4_61:long, loadelement:long(p0:long[], var_8_72:int))
                inc:int(var_8_72, ldc:int(1))
            }
            
            return:double(div:double(l2d:double(var_4_61:long), i2d:double(arraylength:int(p0:long[]))))
        }
        
        goto(Label_0006)
    }
    
    public void paint(java.awt.Graphics p0) {
        var_2_5F : int
        var_4_94 : int
        var_5_ED : int
        var_4_D0 : int
        var_5_13B : String
        
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
            var_2_5F = and:int(ldc:int(1651477941), ldc:int(-151177129))
            invokevirtual:void(Graphics::setColor, p0:Graphics, initobject:Color(Color::<init>, ldc:int(16777215)))
            invokevirtual:void(Graphics::fillRect, p0:Graphics, and:int(ldc:int(-21412), ldc:int(21283)), and:int(ldc:int(6952), ldc:int(-8047)), xor:int(ldc:int(8967), ldc:int(8911)), xor:int(ldc:int(406), ldc:int(352)))
            var_4_94 = and:int(ldc:int(1890), ldc:int(-1907))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(380959965))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-604530081))
                    
                    if (cmplt:boolean(var_4_94:int, xor:int(ldc:int(3789), ldc:int(4045)))) {
                        var_5_ED = loadelement:int(getfield:int[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98), and:int(add:int(var_4_94:int, getfield:int(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u8350\ub70c\u8753\u0800\u0c95\ud217, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98)), xor:int(ldc:int(1168), ldc:int(1135))))
                        invokevirtual:void(Graphics::setColor, p0:Graphics, initobject:Color(Color::<init>, shl:int(add:int(var_5_ED:int, ldc:int(28)), ldc:int(16))))
                        invokevirtual:void(Graphics::fillRect, p0:Graphics, var_4_94:int, sub:int(ldc:int(100), var_5_ED:int), xor:int(ldc:int(544), ldc:int(545)), var_5_ED:int)
                        inc:int(var_4_94, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(Graphics::setColor, p0:Graphics, getstatic:Color(Color::BLACK))
            var_4_D0 = and:int(ldc:int(-18256), ldc:int(17735))
            
            while (cmplt:boolean(var_4_D0:int, arraylength:int(getfield:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u52d3\u8aa5\u3d64\u92ff\u071d\u72f1, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98)))) {
                var_5_13B = loadelement:String(getfield:String[](\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u52d3\u8aa5\u3d64\u92ff\u071d\u72f1, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98), var_4_D0:int)
                
                if (cmpne:boolean(var_5_13B:String, aconstnull:String())) {
                    invokevirtual:void(Graphics::drawString, p0:Graphics, var_5_13B:String, ldc:int(32), add:int(ldc:int(116), mul:int(var_4_D0:int, ldc:int(16))))
                }
                
                inc:int(var_4_D0, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u5654\ud523\ub171\u624e\ub1b9() {
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
            invokevirtual:void(Timer::stop, getfield:Timer(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\u0c95\ubded\ucfaf\u946b\ubb2b\ube23, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u071d\u8753\u385b\u98a4\u946b\u67d0$1(java.awt.event.ActionEvent p0) {
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
            invokespecial:void(\u0c95\u6ec6\u9af2\u3bd6\u8d98::\ub19c\u7873\u4d85\u3e2a\u624e\u8d98, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud171\u7ce1\u12cb\ubefe\u647c\u3a62$0(java.text.DecimalFormat p0) {
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
            invokevirtual:void(DecimalFormat::setDecimalFormatSymbols, p0:DecimalFormat, invokestatic:DecimalFormatSymbols(DecimalFormatSymbols::getInstance, getstatic:Locale(Locale::ROOT)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \ubb2b\ud217\u4c04\u4c04\ua562\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(1893093599), ldc:int(-151558713))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\u6ec6\u9af2\u3bd6\u8d98[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(916446606))
            var_5_81 = and:int(ldc:int(2868), ldc:int(-2869))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(343), ldc:int(-2392)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6BA:int, ldc:int(1882606750))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(26949), ldc:int(5633)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(8329), ldc:int(8328)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_D1:int, ldc:int(842486006))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(13347), ldc:int(16385)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-21944071))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-674967747))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2062927214))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(794680921))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-611788465))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-938718199))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1630212671))
                    }
                    else {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-106019137))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1413344771))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1884183737))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-449000191))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1028054502))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2049432822))
                        var_11_E2 = and:int(ldc:int(-28435), ldc:int(26370))
                        goto(Label_1571)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1954365085))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1342217444))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-99601394))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(530577408))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1213314897))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(73165779))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-130193338))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1191621943))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1294163206))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(537691849))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(10400519))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1029568292))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1185980177))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1237247454))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1197081374))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1057268492))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1437679030))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1143229649))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1193875066))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4609), ldc:int(19585))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1279917953))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(563587951))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-895891405))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1058589872))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1357134144))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1191749889))
                        var_11_E2 = and:int(ldc:int(10560), ldc:int(-10561))
                    }
                    
                    Label_1182:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(963928745))
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-187316792))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-224968297))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1655853746))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1225075983))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1182)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2016529125))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1594194492))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2048224015))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1893695190))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1571)
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(189101670))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1209960226))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-611840252))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-95488977))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(1060062094))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(659509459))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1478635375))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1896875204))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1754933544))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1874368705))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1044459726))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(481208372))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-120625705))
                        var_17_6C5 = add:int(var_16_110:int, and:int(ldc:int(22533), ldc:int(9891)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(2001721774))
                
                if (cmple:boolean(var_5_81 = var_17_6C5:int, sub:int(var_6_88:int, and:int(ldc:int(8231), ldc:int(16977))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
