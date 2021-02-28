public interface \u51fa\u12cb\u7330\u74b1\u6c52.\uf94d\u071d\u760c\u9937\u0800\ua6bd {
    java.lang.String \u71f1\u5d20\u56bd\u5654\u6435\u6c56(int p0);
    
    java.lang.String lambda$\u3711\u5db4\u5d20\uc31c\u2dcc\u494c$3(int p0) {
        var_1_139 : int
        var_3_66 : double
        var_5_6C : double
        var_7_74 : double
        var_9_7C : double
        var_11_84 : double
        stack_1D9_0 : String [generated]
        
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
        var_1_139 = and:int(ldc:int(1014796569), ldc:int(1325178155))
        var_3_66 = div:double(i2d:double(p0:int), ldc:double(20.0))
        var_5_6C = div:double(var_3_66:double, ldc:double(60.0))
        var_7_74 = div:double(var_5_6C:double, ldc:double(60.0))
        var_9_7C = div:double(var_7_74:double, ldc:double(24.0))
        var_11_84 = div:double(var_9_7C:double, ldc:double(365.0))
        
        if (cmple:boolean(var_11_84:double, ldc:double(0.5))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_139:int, ldc:int(256)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(2094074311))
                    goto(Label_0280)
                }
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(-1400900708))
                    
                    if (cmpgt:boolean(var_9_7C:double, ldc:double(0.5))) {
                        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_9_7C:double)), ldc:String(" d"))))
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0280)
                }
                
                if (cmpeq:boolean(and:int(var_1_139:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(506007894))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_139:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_139 = and:int(var_1_139:int, ldc:int(914347401))
                    
                    if (cmpgt:boolean(var_7_74:double, ldc:double(0.5))) {
                        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_7_74:double)), ldc:String(" h"))))
                    }
                }
                
                Label_0229:
                
                if (cmpeq:boolean(and:int(var_1_139:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(812323298))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_139:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0186)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_139:int, ldc:int(4)), ldc:int(0))) {
                        var_1_139 = and:int(var_1_139:int, ldc:int(-903215482))
                        loopcontinue()
                    }
                    
                    var_1_139 = and:int(var_1_139:int, ldc:int(-991453202))
                    
                    if (cmpgt:boolean(var_5_6C:double, ldc:double(0.5))) {
                        stack_1D9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_5_6C:double)), ldc:String(" m")))
                        looporswitchbreak()
                    }
                }
                
                Label_0280:
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(929094484))
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_1_139:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_139 = and:int(var_1_139:int, ldc:int(2121636797))
                    stack_1D9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_3_66:double), ldc:String(" s")))
                    looporswitchbreak()
                }
            }
            
            return:String(stack_1D9_0:String)
        }
        
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_11_84:double)), ldc:String(" y"))))
    }
    
    java.lang.String lambda$\u69d9\ud158\u74b1\u7d52\u6b0d\u51fa$2(int p0) {
        var_1_9E : int
        var_3_66 : double
        var_5_6C : double
        stack_F9_0 : String [generated]
        
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
        var_1_9E = and:int(ldc:int(986074125), ldc:int(-522791251))
        var_3_66 = div:double(i2d:double(p0:int), ldc:double(100.0))
        var_5_6C = div:double(var_3_66:double, ldc:double(1000.0))
        
        if (cmple:boolean(var_5_6C:double, ldc:double(0.5))) {
            do {
                if (cmpeq:boolean(and:int(var_1_9E:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-1611412090))
                }
                else {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-1513171953))
                    
                    if (cmple:boolean(var_3_66:double, ldc:double(0.5))) {
                        loopcontinue()
                    }
                    
                    stack_F9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_3_66:double)), ldc:String(" m")))
                    return:String(stack_F9_0:String)
                }
            } while (cmpeq:boolean(and:int(var_1_9E:int, ldc:int(4)), ldc:int(0)))
            
            var_1_9E = and:int(var_1_9E:int, ldc:int(2015849551))
            stack_F9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:int), ldc:String(" cm")))
            return:String(stack_F9_0:String)
        }
        
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), var_5_6C:double)), ldc:String(" km"))))
    }
    
    java.lang.String lambda$\u88c5\uafe7\ub70c\u8258\u61a4\u8d98$1(int p0) {
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
            return:String(invokevirtual:String(NumberFormat::format, getstatic:DecimalFormat[expected:NumberFormat](\uf94d\u071d\u760c\u9937\u0800\ua6bd::\ub18d\u6435\u7873\u7af6\u071d\u624e), mul:double(i2d:double(p0:int), ldc:double(0.1))))
        }
        
        goto(Label_0006)
    }
    
    void lambda$\ua068\u7bad\u4d85\u8709\u5245\u3d64$0(java.text.DecimalFormat p0) {
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
}
