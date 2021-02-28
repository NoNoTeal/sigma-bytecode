public class \u51fa\u12cb\u7330\u74b1\u6c52.\u3e2a\u6d99\u8640\ub171\u6cfe {
    public void \u3e2a\u6d99\u8640\ub171\u6cfe(java.lang.String p0, boolean p1) {
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
    
    public void finalize() {
        var_1_114 : int
        
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
            var_1_114 = and:int(ldc:int(-2013246463), ldc:int(-579961460))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(-898934475))
                        goto(Label_0243)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(-1187685618))
                        goto(Label_0197)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(-777584670))
                        
                        if (cmpeq:boolean(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3e2a\u6d99\u8640\ub171\u6cfe::\ubefe\u99f7\ub18d\u759a\u7bad, this:\u3e2a\u6d99\u8640\ub171\u6cfe), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                            goto(Label_0197)
                        }
                    }
                    
                    Label_0145:
                    
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(-1727409916))
                        goto(Label_0243)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(4)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(-893779149))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_114:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_114 = and:int(var_1_114:int, ldc:int(-4302963))
                        invokevirtual:void(\u6b0d\ua068\uc4d2\u5245\u4d85::\uff55\u3d4b\u946b\uf94d\u071d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c), getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3e2a\u6d99\u8640\ub171\u6cfe::\ubefe\u99f7\ub18d\u759a\u7bad, this:\u3e2a\u6d99\u8640\ub171\u6cfe))
                    }
                    
                    Label_0197:
                    
                    if (cmpeq:boolean(and:int(var_1_114:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_114:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_114 = and:int(var_1_114:int, ldc:int(-670037131))
                            goto(Label_0145)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_114:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_114 = and:int(var_1_114:int, ldc:int(1112576682))
                            loopcontinue()
                        }
                        
                        var_1_114 = and:int(var_1_114:int, ldc:int(-736802593))
                        invokespecial:void(Object::finalize, this:\u3e2a\u6d99\u8640\ub171\u6cfe[expected:Object])
                    }
                    
                    Label_0243:
                    
                    if (cmpne:boolean(and:int(var_1_114:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_114:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_114 = and:int(var_1_114:int, ldc:int(385661595))
                        goto(Label_0145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_114:int, ldc:int(536870912)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_114 = and:int(var_1_114:int, ldc:int(-1702737894))
            }
            finally {
                invokespecial:void(Object::finalize, this:\u3e2a\u6d99\u8640\ub171\u6cfe[expected:Object])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe \u69d9\u4179\u8258\uae5d\ua562() {
        var_1_165 : int
        var_3_160 : IOException
        
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
            var_1_165 = and:int(ldc:int(-72975001), ldc:int(-181691010))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0312)
                }
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(32)), ldc:int(0))) {
                    var_1_165 = and:int(var_1_165:int, ldc:int(53589524))
                    goto(Label_0249)
                }
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_165 = and:int(var_1_165:int, ldc:int(-2029613920))
                }
                else {
                    var_1_165 = and:int(var_1_165:int, ldc:int(-1084121114))
                    
                    if (cmpne:boolean(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3e2a\u6d99\u8640\ub171\u6cfe::\ubefe\u99f7\ub18d\u759a\u7bad, this:\u3e2a\u6d99\u8640\ub171\u6cfe), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_1_165:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_165 = and:int(var_1_165:int, ldc:int(-1396364142))
                    goto(Label_0312)
                }
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0249)
                }
                
                if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(4)), ldc:int(0))) {
                    var_1_165 = and:int(var_1_165:int, ldc:int(-771657461))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_165 = and:int(var_1_165:int, ldc:int(-206528721))
                    
                    if (cmpeq:boolean(getfield:BufferedImage(\u3e2a\u6d99\u8640\ub171\u6cfe::\ud171\u47c2\u647c\u946b\u960f, this:\u3e2a\u6d99\u8640\ub171\u6cfe), aconstnull:BufferedImage())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_1_165:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_165:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_165 = and:int(var_1_165:int, ldc:int(1911825985))
                        goto(Label_0249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_165 = and:int(var_1_165:int, ldc:int(-109510674))
                }
                
                try {
                    Label_0312:
                    
                    do {
                        Label_0249:
                        
                        if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(67108864)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(4096)), ldc:int(0))) {
                                var_1_165 = and:int(var_1_165:int, ldc:int(-635353445))
                                goto(Label_0208)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_0152)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(16777216)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_1_165 = and:int(var_1_165:int, ldc:int(-1246651026))
                            putfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3e2a\u6d99\u8640\ub171\u6cfe::\ubefe\u99f7\ub18d\u759a\u7bad, this:\u3e2a\u6d99\u8640\ub171\u6cfe, invokestatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5245\u7af6\u6bb9\u3e2a\u8bb0\uc7fe::\ud523\u4c2b\uc2bd\u97e6\ubff1\u759a, loadelement:String(getstatic:String[](\u3e2a\u6d99\u8640\ub171\u6cfe::\u7873\u873d\u960f\u983f\ubded), and:int(ldc:int(5322), ldc:int(-5323))), getfield:BufferedImage(\u3e2a\u6d99\u8640\ub171\u6cfe::\ud171\u47c2\u647c\u946b\u960f, this:\u3e2a\u6d99\u8640\ub171\u6cfe)))
                        }
                    } while (cmpne:boolean(and:int(var_1_165:int, ldc:int(524288)), ldc:int(0)))
                    
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_165:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_165 = and:int(var_1_165:int, ldc:int(-719208658))
                }
                catch (java.io.IOException var_3_160) {
                    var_1_165 = and:int(var_1_165:int, ldc:int(-684507210))
                    invokevirtual:void(Throwable::printStackTrace, var_3_160:IOException[expected:Throwable])
                }
                
                looporswitchbreak()
            }
            
            return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3e2a\u6d99\u8640\ub171\u6cfe::\ubefe\u99f7\ub18d\u759a\u7bad, this:\u3e2a\u6d99\u8640\ub171\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub83f\ucb79\u8d98\ub70c\uc9f6() {
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
            return:boolean(getfield:boolean(\u3e2a\u6d99\u8640\ub171\u6cfe::\u9937\u4ab3\u8d98\u8709\u76bc, this:\u3e2a\u6d99\u8640\ub171\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub70c\u9033\u2dcc\u4c2b\uff55() {
        var_1_5F : int
        stack_9C_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1223233911), ldc:int(-629298017))
            
            if (logicaland:boolean(getfield:boolean(\u3e2a\u6d99\u8640\ub171\u6cfe::\ub83f\ucb79\u8d98\ub70c\uc9f6, this:\u3e2a\u6d99\u8640\ub171\u6cfe), cmpgt:boolean(getfield:long(\u3e2a\u6d99\u8640\ub171\u6cfe::\u69d9\u4179\u8258\uae5d\ua562, this:\u3e2a\u6d99\u8640\ub171\u6cfe), sub:long(invokestatic:long(System::currentTimeMillis), ldc:long(300000L))))) {
                stack_9C_0 = and:int(ldc:int(16395), ldc:int(1153))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-890534754))
                stack_9C_0 = and:int(ldc:int(12752), ldc:int(-30171))
            }
            
            return:boolean(stack_9C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u47c2\u647c\u946b\u960f(boolean p0) {
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
            putfield:boolean(\u3e2a\u6d99\u8640\ub171\u6cfe::\ub83f\ucb79\u8d98\ub70c\uc9f6, this:\u3e2a\u6d99\u8640\ub171\u6cfe, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ubefe\u99f7\ub18d\u759a\u7bad() {
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
            return:String(getfield:String(\u3e2a\u6d99\u8640\ub171\u6cfe::\ub70c\u9033\u2dcc\u4c2b\uff55, this:\u3e2a\u6d99\u8640\ub171\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public void \u7c6b\u64f2\u62da\ub171\uf94d(java.lang.String p0) {
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
            putfield:String(\u3e2a\u6d99\u8640\ub171\u6cfe::\ub70c\u9033\u2dcc\u4c2b\uff55, this:\u3e2a\u6d99\u8640\ub171\u6cfe, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u76bc\u36d3\u6435\u1833\u34df() {
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
            return:String(getfield:String(\u3e2a\u6d99\u8640\ub171\u6cfe::\uceb8\u446c\u624e\u8350\u40a9, this:\u3e2a\u6d99\u8640\ub171\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u416d\uf9c5\u7c6b\u51b2\ud217$0(java.lang.String p0) {
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
            
            try {
                putfield:BufferedImage(\u3e2a\u6d99\u8640\ub171\u6cfe::\ud171\u47c2\u647c\u946b\u960f, this:\u3e2a\u6d99\u8640\ub171\u6cfe, invokestatic:BufferedImage(ImageIO::read, initobject:URL(URL::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3e2a\u6d99\u8640\ub171\u6cfe::\u7873\u873d\u960f\u983f\ubded), xor:int(ldc:int(86), ldc:int(87)))), p0:String), loadelement:String(getstatic:String[](\u3e2a\u6d99\u8640\ub171\u6cfe::\u7873\u873d\u960f\u983f\ubded), xor:int(ldc:int(8229), ldc:int(8231))))))))
            }
            catch (java.io.IOException stack_B2_0) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CF : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_13E_0 : byte[] [generated]
        stack_1E2_0 : byte[] [generated]
        stack_266_0 : byte[] [generated]
        stack_2B7_0 : byte[] [generated]
        stack_30D_0 : byte[] [generated]
        var_4_1BA : int
        var_3_1BF : byte[]
        var_5_1C0 : int
        var_0_1D8 : int
        expr_1E2 : byte [generated]
        stack_221_2 : byte [generated]
        stack_1FF_0 : byte [generated]
        expr_266 : byte [generated]
        expr_9E : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_2A5 : byte[]
        var_5_2A6 : int
        expr_10E : int [generated]
        var_3_2FB : byte[]
        var_5_2FC : int
        var_3_14A : String
        stack_1B3_0 : String[] [generated]
        expr_15C : String[] [generated]
        
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
        var_0_1CF = and:int(ldc:int(-562568152), ldc:int(1045649293))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_13E_0 = stack_1E2_0 = stack_266_0 = stack_2B7_0 = stack_30D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("EvDACGgA4BA3p/ji2DgIEAgYoDYqqPAwoBBQ6NhQOM7SKMhA9qLwgChwKMhmNgc=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BA = expr_6B:int
        var_3_1BF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C0 = expr_6B:int
        Label_0450:
        
        while (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1CF:int, ldc:int(-1636222421))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_1E2 = stack_221_2 = loadelement(stack_1E2_0, var_5_1C0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C0:int, ldc:int(1)), neg:int(var_4_1BA:int)), ldc:int(0))) {
                stack_221_2 = stack_1FF_0 = add:byte(expr_1E2:byte, loadelement:byte(var_3_1BF:byte[], add:int(var_5_1C0:int, ldc:int(1))))
                goto(Label_0527)
            }
            
            Label_0495:
            
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1047852604))
                stack_221_2 = stack_1FF_0 = add:byte(expr_1E2:byte, ldc:byte(1))
            }
            
            Label_0527:
            
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0495)
            }
            
            var_0_1CF = and:int(var_0_1D8:int, ldc:int(-621124757))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, stack_221_2:byte)
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_13E_0 = stack_1E2_0 = stack_266_0 = stack_2B7_0 = stack_30D_0 = var_3_1BF:byte[]
            goto(Label_0112)
        }
        
        var_0_1CF = and:int(var_0_1CF:int, ldc:int(351838674))
        Label_0583:
        
        while (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(-1074148562))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_266 = loadelement:byte(stack_266_0:byte[], var_5_1C0:int)
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, or:int(and:int(shl:int(expr_266:byte, xor:int(ldc:int(3075), ldc:int(3079))), ldc:int(-16)), and:int(shr:int(expr_266:byte[expected:int], xor:int(ldc:int(-32767), ldc:int(-32763))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_13E_0 = stack_1E2_0 = stack_266_0 = stack_2B7_0 = stack_30D_0 = var_3_1BF:byte[]
            goto(Label_0163)
        }
        
        var_0_1CF = and:int(var_0_1CF:int, ldc:int(-1807885631))
        goto(Label_0450)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(978480509))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(-19505668))
        }
        else {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(-537184225))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1BA = expr_9E:int
                var_3_1BF = newarray:byte[](byte.class, expr_9E:int)
                var_5_1C0 = expr_9E:int
                goto(Label_0583)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(8)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(1582762468))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(488321832))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(517787101))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_2A5 = newarray:byte[](byte.class, expr_D3:int)
                var_5_2A6 = expr_D3:int
                
                loop {
                    var_0_1CF = and:int(var_0_1CF:int, ldc:int(511179101))
                    var_5_2A6 = add:int(var_5_2A6:int, ldc:int(-1))
                    storeelement:byte(var_3_2A5:byte[], var_5_2A6:int, add:int(shl:int(loadelement:byte(stack_2B7_0:byte[], var_5_2A6:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_2A6:int, and:int(ldc:int(2819), ldc:int(1)))), ldc:int(7)), and:int(ldc:int(9747), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_5_2A6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_13E_0 = stack_1E2_0 = stack_266_0 = stack_2B7_0 = stack_30D_0 = var_3_2A5:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(-1758113030))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1CF = and:int(var_0_1CF:int, ldc:int(-599466874))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1CF = and:int(var_0_1CF:int, ldc:int(-790485486))
                goto(Label_0112)
            }
            
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(1515464474))
            expr_10E = arraylength:int(stack_10E_0:byte[])
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_2FB = newarray:byte[](byte.class, expr_10E:int)
                var_5_2FC = expr_10E:int
                
                loop {
                    var_0_1CF = and:int(var_0_1CF:int, ldc:int(-2548070))
                    var_5_2FC = add:int(var_5_2FC:int, ldc:int(-1))
                    storeelement:byte(var_3_2FB:byte[], var_5_2FC:int, add:byte(xor:byte(loadelement:byte(stack_30D_0:byte[], var_5_2FC:int), ldc:byte(126)), ldc:byte(118)))
                    
                    if (cmpne:boolean(var_5_2FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_13E_0 = stack_1E2_0 = stack_266_0 = stack_2B7_0 = stack_30D_0 = var_3_2FB:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(1317820713))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_1CF:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1CF = and:int(var_0_1CF:int, ldc:int(1859746374))
            goto(Label_0112)
        }
        
        var_3_14A = initobject:String(String::<init>, stack_13E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B3_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1667), ldc:int(2067)))
        expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(23523), ldc:int(1035)))
        storeelement:String(expr_15C:String[], and:int(ldc:int(910), ldc:int(-911)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(10573), ldc:int(-10574)), and:int(ldc:int(-27862), ldc:int(25797))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(16387), ldc:int(6234)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(-7605), ldc:int(7348)), xor:int(ldc:int(28672), ldc:int(28676))))
        storeelement:String(expr_15C:String[], xor:int(ldc:int(12312), ldc:int(12313)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(540), ldc:int(2340)), xor:int(ldc:int(10297), ldc:int(10263))))
        putstatic:String[](\u3e2a\u6d99\u8640\ub171\u6cfe::\u7873\u873d\u960f\u983f\ubded, expr_15C:String[])
    }
    
    public void \u51fa\u72f1\u527a\ud12e\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62E : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_639 : int
        
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
        var_3_62E = and:int(ldc:int(-1357908057), ldc:int(2079555214))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e2a\u6d99\u8640\ub171\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
            var_3_62E = and:int(var_3_62E:int, ldc:int(-82601338))
            var_5_80 = and:int(ldc:int(-20413), ldc:int(19900))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26830), ldc:int(10445)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_62E:int, ldc:int(1057215175))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, and:int(ldc:int(4099), ldc:int(8261)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(2085), ldc:int(8779)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_62E = and:int(var_3_CF:int, ldc:int(805035175))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(323), ldc:int(641)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1171391331))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-272639026))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0366:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-778586718))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-700751871))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1850112375))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(534080906))
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1182874871))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-547818527))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1334133855))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1806433191))
                        var_11_E0 = and:int(ldc:int(-3713), ldc:int(3712))
                        goto(Label_1464)
                    }
                    
                    Label_0553:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-559289433))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1635577254))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1048604862))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-901463277))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(637988447))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-9649652))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0366)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-626818149))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(735548919))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(763726460))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-711968640))
                            goto(Label_0366)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(564498274))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-340830977))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1912886467))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0366)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1401171126))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1151355202))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(8259), ldc:int(8258))
                                goto(Label_1077)
                            }
                        }
                    }
                    
                    Label_0916:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(409646342))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1029511573))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1107547941))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1470696427))
                            goto(Label_0366)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(2109781601))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1806645479))
                        var_11_E0 = and:int(ldc:int(-5259), ldc:int(5258))
                    }
                    
                    Label_1077:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1300643036))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-602595846))
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1322098173))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1835330384))
                            goto(Label_0366)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1195179307))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1800092591))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-969447870))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1077)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(593727532))
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1479236129))
                            goto(Label_0366)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(2065670078))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1464)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1386772199))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(889633462))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-151912115))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(586819233))
                        goto(Label_0366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1319250321))
                        loopcontinue()
                    }
                    
                    var_3_62E = and:int(var_3_62E:int, ldc:int(1062444719))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1464:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_639 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1475:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-496200190))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(39637199))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-471734612))
                        goto(Label_0366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-13668162))
                        var_17_639 = add:int(var_16_10E:int, and:int(ldc:int(16549), ldc:int(2627)))
                        looporswitchbreak()
                    }
                    
                    var_3_62E = and:int(var_3_62E:int, ldc:int(-1220574317))
                }
                
                var_3_62E = and:int(var_3_62E:int, ldc:int(-1087900425))
                
                if (cmple:boolean(var_5_80 = var_17_639:int, sub:int(var_6_87:int, xor:int(ldc:int(8233), ldc:int(8232))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
