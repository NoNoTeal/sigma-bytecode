public abstract class \u516c\u3d64\u718f\ub171\u6b5f.\u760c\ua3b4\u99f7\u7330\u4975 {
    public void \u760c\ua3b4\u99f7\u7330\u4975(java.io.File p0) {
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
            invokespecial:Object(Object::<init>, this:\u760c\ua3b4\u99f7\u7330\u4975)
            putfield:File(\u760c\ua3b4\u99f7\u7330\u4975::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u760c\ua3b4\u99f7\u7330\u4975, p0:File)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u2dcc\ub7dc\u4179\uf9c5\u6b0d\u718f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
        stack_93_0 : String [generated]
        expr_69 : Object[] [generated]
        
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
            stack_93_0 = ldc:String("%s/%s/%s")
            expr_69 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2115), ldc:int(5171)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(2887), ldc:int(-3928)), invokevirtual:String[expected:Object](\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f))
            storeelement:Object(expr_69:Object[], xor:int(ldc:int(260), ldc:int(261)), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(16922), ldc:int(1094)), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
            return:String(invokestatic:String(String::format, stack_93_0:String, expr_69:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u7d52\u9937\u759a\u64ab\ua6bd\uc2e8(java.io.File p0, java.io.File p1) {
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
            return:String(invokevirtual:String(URI::getPath, invokevirtual:URI(URI::relativize, invokevirtual:URI(File::toURI, p0:File), invokevirtual:URI(File::toURI, p1:File))))
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \uc4d2\ubb2b\ufe34\u960f\u6435\u600f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:InputStream(invokevirtual:InputStream(\u760c\ua3b4\u99f7\u7330\u4975::\ubb2b\u4daf\u8d98\u760c\u47c2\u40a9, this:\u760c\ua3b4\u99f7\u7330\u4975, invokestatic:String(\u760c\ua3b4\u99f7\u7330\u4975::\u2dcc\ub7dc\u4179\uf9c5\u6b0d\u718f, p0:\u983f\u6c56\u6bb9\u927d\u965f, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u718f\u52d3\u12b2\u93a2\u4179\u97b7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:boolean(invokevirtual:boolean(\u760c\ua3b4\u99f7\u7330\u4975::\u718f\u52d3\u12b2\u93a2\u4179\u97b7, this:\u760c\ua3b4\u99f7\u7330\u4975, invokestatic:String(\u760c\ua3b4\u99f7\u7330\u4975::\u2dcc\ub7dc\u4179\uf9c5\u6b0d\u718f, p0:\u983f\u6c56\u6bb9\u927d\u965f, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public abstract java.io.InputStream \ubb2b\u4daf\u8d98\u760c\u47c2\u40a9(java.lang.String p0);
    
    public java.io.InputStream \uc246\u9af2\uafe7\u9033\u5d20\ubcb0(java.lang.String p0) {
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
        
        if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(String::contains, p0:String, ldc:String[expected:CharSequence]("/")), invokevirtual:boolean(String::contains, p0:String, ldc:String[expected:CharSequence]("\\"))))) {
            return:InputStream(invokevirtual:InputStream(\u760c\ua3b4\u99f7\u7330\u4975::\ubb2b\u4daf\u8d98\u760c\u47c2\u40a9, this:\u760c\ua3b4\u99f7\u7330\u4975, p0:String))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Root resources can only be filenames, not paths (no / allowed!)")))
    }
    
    public abstract boolean \u718f\u52d3\u12b2\u93a2\u4179\u97b7(java.lang.String p0);
    
    public void \u8c8a\uae5d\u8640\ua3b4\u4492\u98a4(java.lang.String p0) {
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
            invokeinterface:void(Logger::warn, getstatic:Logger(\u760c\ua3b4\u99f7\u7330\u4975::\ucb79\u6bb9\u6d69\u6c52\u8d98\u527a), ldc:String("ResourcePack: ignored non-lowercase namespace: {} in {}"), p0:String[expected:Object], getfield:File[expected:Object](\u760c\ua3b4\u99f7\u7330\u4975::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u760c\ua3b4\u99f7\u7330\u4975))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \u624e\ub8be\u4c2b\uc84e\u4975\u6fb0(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ub113\u8350\u839e\ubb2b\ub83f<T> p0) {
        var_4_6B : InputStream
        var_5_6E : Throwable
        var_6_76 : T
        var_7_AA : Throwable
        var_9_CF : Throwable
        
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
            var_4_6B = invokevirtual:InputStream(\u760c\ua3b4\u99f7\u7330\u4975::\ubb2b\u4daf\u8d98\u760c\u47c2\u40a9, this:\u760c\ua3b4\u99f7\u7330\u4975, ldc:String("pack.mcmeta"))
            var_5_6E = aconstnull:Throwable()
            
            try {
                var_6_76 = invokestatic:T(\u760c\ua3b4\u99f7\u7330\u4975::\u76bc\u759a\u47c2\u61a4\ud4fe\u3c25, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>, var_4_6B:InputStream)
            }
            catch (java.lang.Throwable var_7_AA) {
                var_5_6E = var_7_AA:Throwable
                athrow(var_7_AA:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6B:InputStream, aconstnull:InputStream())) {
                    if (cmpne:boolean(var_5_6E:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(InputStream::close, var_4_6B:InputStream)
                        }
                        catch (java.lang.Throwable var_9_CF) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_6E:Throwable, var_9_CF:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(InputStream::close, var_4_6B:InputStream)
                    }
                }
            }
            
            return:T(var_6_76:T)
        }
        
        goto(Label_0006)
    }
    
    public static T \u76bc\u759a\u47c2\u61a4\ud4fe\u3c25(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ub113\u8350\u839e\ubb2b\ub83f<T> p0, java.io.InputStream p1) {
        var_4_77 : BufferedReader
        var_5_7A : Throwable
        var_6_81 : JsonObject
        var_7_B5 : Throwable
        var_9_DA : Throwable
        stack_FD_0 : Object [generated]
        var_4_141 : JsonParseException
        
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
        
        try {
            var_4_77 = initobject:BufferedReader(BufferedReader::<init>, initobject:InputStreamReader[expected:Reader](InputStreamReader::<init>, p1:InputStream, getstatic:Charset(StandardCharsets::UTF_8)))
            var_5_7A = aconstnull:Throwable()
            
            try {
                var_6_81 = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, var_4_77:BufferedReader[expected:Reader])
            }
            catch (java.lang.Throwable var_7_B5) {
                var_5_7A = var_7_B5:Throwable
                athrow(var_7_B5:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_77:BufferedReader, aconstnull:BufferedReader())) {
                    if (cmpne:boolean(var_5_7A:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(BufferedReader::close, var_4_77:BufferedReader)
                        }
                        catch (java.lang.Throwable var_9_DA) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_7A:Throwable, var_9_DA:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(BufferedReader::close, var_4_77:BufferedReader)
                    }
                }
            }
        }
        catch (java.io.IOException | com.google.gson.JsonParseException ex_FD) {
            invokeinterface:void(Logger::error, getstatic:Logger(\u760c\ua3b4\u99f7\u7330\u4975::\ucb79\u6bb9\u6d69\u6c52\u8d98\u527a), ldc:String("Couldn't load {} metadata"), invokeinterface:String[expected:Object](\ub113\u8350\u839e\ubb2b\ub83f::\u8709\u88c5\ubb2b\u67e9\u6435\ub6ab, p0:\ub113\u8350\u839e\ubb2b\ub83f), stack_FD_0:Object)
            return:T(aconstnull:T())
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(JsonObject::has, var_6_81:JsonObject, invokeinterface:String(\ub113\u8350\u839e\ubb2b\ub83f<T>::\u8709\u88c5\ubb2b\u67e9\u6435\ub6ab, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>)))) {
            return:T(aconstnull:T())
        }
        
        try {
            return:T(invokeinterface:T(\ub113\u8350\u839e\ubb2b\ub83f<T>::\u3504\u873d\ub70c\ube23\u7049\ubff1, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>, invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, var_6_81:JsonObject, invokeinterface:String(\ub113\u8350\u839e\ubb2b\ub83f<T>::\u8709\u88c5\ubb2b\u67e9\u6435\ub6ab, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>))))
        }
        catch (com.google.gson.JsonParseException var_4_141) {
            invokeinterface:void(Logger::error, getstatic:Logger(\u760c\ua3b4\u99f7\u7330\u4975::\ucb79\u6bb9\u6d69\u6c52\u8d98\u527a), ldc:String("Couldn't load {} metadata"), invokeinterface:String[expected:Object](\ub113\u8350\u839e\ubb2b\ub83f<T>::\u8709\u88c5\ubb2b\u67e9\u6435\ub6ab, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>), var_4_141:JsonParseException[expected:Object])
            return:T(aconstnull:T())
        }
    }
    
    public java.lang.String \u8cae\u7d52\u647c\u3bd6\u0c95\u965f() {
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
            return:String(invokevirtual:String(File::getName, getfield:File(\u760c\ua3b4\u99f7\u7330\u4975::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u760c\ua3b4\u99f7\u7330\u4975)))
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
            putstatic:Logger(\u760c\ua3b4\u99f7\u7330\u4975::\ucb79\u6bb9\u6d69\u6c52\u8d98\u527a, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d64\u3711\ud4fe\u1833\u36d3\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_687 : int
        
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
        var_3_67C = and:int(ldc:int(-2098302142), ldc:int(-218301746))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\ua3b4\u99f7\u7330\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_67C = and:int(var_3_67C:int, ldc:int(-1191183446))
            var_5_7D = and:int(ldc:int(31973), ldc:int(-32494))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23249), ldc:int(23056)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_67C:int, ldc:int(2125455178))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, xor:int(ldc:int(4234), ldc:int(4235)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(4611), ldc:int(16401)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_67C = and:int(var_3_CD:int, ldc:int(2038028839))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-30200), ldc:int(-30199)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1675457942))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-260932747))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-620095728))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-2040993079))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1064607925))
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1996553237))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(698962623))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1520788287))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1821328069))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(2127733853))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1936249438))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-848668725))
                            var_11_DE = and:int(ldc:int(9165), ldc:int(-9166))
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1059768138))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1718759050))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1221829996))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-136584817))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(766442031))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(2051306117))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-321775842))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-802145464))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(136872527))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(451599191))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(247642961))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-127611385))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1398245518))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(-28607), ldc:int(-28608))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1619450008))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1431838542))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-16267445))
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(50906499))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(733835907))
                        var_11_DE = and:int(ldc:int(-1410), ldc:int(1409))
                    }
                    
                    Label_1103:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(816217842))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(1169400387))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1980721729))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-1697094338))
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-370731679))
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-1081362793))
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-957810898))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-889056401))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1903299190))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(1840371627))
                            goto(Label_1103)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67C = and:int(var_3_67C:int, ldc:int(-2020724023))
                            loopcontinue()
                        }
                        
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-122882158))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                        goto(Label_1510)
                    }
                    
                    Label_1382:
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-553417575))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(2125530797))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-2007011675))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67C = and:int(var_3_67C:int, ldc:int(2100884282))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1510:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_687 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1521:
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(473624977))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(903747421))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1104521770))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-288983117))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1190829741))
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(103899199))
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-1668321930))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67C = and:int(var_3_67C:int, ldc:int(-726993250))
                        var_17_687 = add:int(var_16_10C:int, and:int(ldc:int(1045), ldc:int(897)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67C = and:int(var_3_67C:int, ldc:int(636157606))
                
                if (cmple:boolean(var_5_7D = var_17_687:int, sub:int(var_6_84:int, and:int(ldc:int(13385), ldc:int(2865))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_67C:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
