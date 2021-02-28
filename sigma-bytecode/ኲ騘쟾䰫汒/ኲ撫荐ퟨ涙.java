public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u64ab\u8350\ud7e8\u6d99 {
    public void \u12b2\u64ab\u8350\ud7e8\u6d99(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p1, \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p2) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u12b2\u64ab\u8350\ud7e8\u6d99)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ucfaf\u98a4\u3d64\u5db4\u8709\u0b8e, this:\u12b2\u64ab\u8350\ud7e8\u6d99, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7049\uae5d\uff55\ubb2b\u4975\u156b, this:\u12b2\u64ab\u8350\ud7e8\u6d99, p1:\ud12e\u946b\u97b7\u51b2\u3d64)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u3711\u8cae\u8709\u624e\u5bc4, this:\u12b2\u64ab\u8350\ud7e8\u6d99, p2:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    private void \u8d90\ub83f\u3e75\u8c8a\u8350\u836c(boolean p0) {
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
            
            if (p0:boolean) {
                invokevirtual:void(Thread::start, initobject:\u92ff\u7873\u7e3f\u3711\u624e[expected:Thread](\u92ff\u7873\u7e3f\u3711\u624e::<init>, this:\u12b2\u64ab\u8350\ud7e8\u6d99, loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), and:int(ldc:int(4130), ldc:int(9239)))))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99), this:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u183a\u5f50\u6d69\u4c2b\uf9c5\u7af6(long p0) {
        var_3_64 : int
        var_5_68 : \u61a4\u8aa5\uff55\u718f\ub8be
        var_6_75 : \uc3e3\u8308\u3c25\u4ab3\u6fb0
        var_6_130 : \uae5d\u5654\uc910\ub18d\u7d52
        
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
            var_3_64 = and:int(and:int(ldc:int(-593548673), ldc:int(-34900398)), ldc:int(-810060058))
            var_5_68 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                var_3_64 = and:int(var_3_64:int, ldc:int(-10227233))
                var_6_75 = invokevirtual:\uc3e3\u8308\u3c25\u4ab3\u6fb0(\u61a4\u8aa5\uff55\u718f\ub8be::\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, var_5_68:\u61a4\u8aa5\uff55\u718f\ub8be, p0:long)
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-1504056315))
                        goto(Label_0263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-470706134))
                        goto(Label_0220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-38148409))
                        putfield:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u67e9\u8640\u88c5\u385b\u3dd3\u8bb0, this:\u12b2\u64ab\u8350\ud7e8\u6d99, invokespecial:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\ub70c\u0c95\u4e72\uc238\u7bad\u4c04, this:\u12b2\u64ab\u8350\ud7e8\u6d99, getfield:int(\uc3e3\u8308\u3c25\u4ab3\u6fb0::\u071d\u3bd6\u071d\u446c\u3711\u416d, var_6_75:\uc3e3\u8308\u3c25\u4ab3\u6fb0)))
                    }
                    
                    Label_0174:
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64 = and:int(var_3_64:int, ldc:int(1142815763))
                            loopcontinue()
                        }
                        
                        var_3_64 = and:int(var_3_64:int, ldc:int(-827513498))
                        putfield:String(\u12b2\u64ab\u8350\ud7e8\u6d99::\uc84e\ube23\u3e2a\u3e75\u3a62\u36d3, this:\u12b2\u64ab\u8350\ud7e8\u6d99, invokestatic:String(\u12b2\u64ab\u8350\ud7e8\u6d99::\u8308\u759a\u446c\ubefe\u4c2b\u3776, getfield:long(\uc3e3\u8308\u3c25\u4ab3\u6fb0::\u385b\u7049\uae87\ub7dc\u6fb0\u8d98, var_6_75:\uc3e3\u8308\u3c25\u4ab3\u6fb0)))
                    }
                    
                    Label_0220:
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(368088662))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0174)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64 = and:int(var_3_64:int, ldc:int(-18011796))
                        putfield:\ub70c\u7006\u4d85\ub18d\u6b0d(\u12b2\u64ab\u8350\ud7e8\u6d99::\u9033\u3776\u88c5\u0800\u5654\u6ec6, this:\u12b2\u64ab\u8350\ud7e8\u6d99, getfield:\ub70c\u7006\u4d85\ub18d\u6b0d(\uc3e3\u8308\u3c25\u4ab3\u6fb0::\u6c56\u647c\u97b7\u6d99\u5654\u385b, var_6_75:\uc3e3\u8308\u3c25\u4ab3\u6fb0))
                    }
                    
                    Label_0263:
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1073741824)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1566585046))
                }
                
                var_3_64 = and:int(var_3_64:int, ldc:int(-299473049))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_6_130) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u12b2\u64ab\u8350\ud7e8\u6d99::\u6d99\uafe7\ud7e8\u527a\u5bc4\u6ec6), loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(4099), ldc:int(4096))))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, var_6_130:\uae5d\u5654\uc910\ub18d\u7d52, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ucfaf\u98a4\u3d64\u5db4\u8709\u0b8e, this:\u12b2\u64ab\u8350\ud7e8\u6d99)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u8308\u759a\u446c\ubefe\u4c2b\u3776(long p0) {
        var_4_6C : GregorianCalendar
        
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
            var_4_6C = initobject:GregorianCalendar(GregorianCalendar::<init>, invokestatic:TimeZone(TimeZone::getDefault))
            invokevirtual:void(Calendar::setTimeInMillis, var_4_6C:GregorianCalendar[expected:Calendar], p0:long)
            return:String(invokevirtual:String(DateFormat::format, invokestatic:DateFormat(DateFormat::getDateTimeInstance), invokevirtual:Date(Calendar::getTime, var_4_6C:GregorianCalendar[expected:Calendar])))
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99)), and:int[expected:boolean](ldc:int(1262), ldc:int(-1263)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, and:int(ldc:int(6425), ldc:int(384)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ucfaf\u98a4\u3d64\u5db4\u8709\u0b8e, this:\u12b2\u64ab\u8350\ud7e8\u6d99))
        return:boolean(and:int[expected:boolean](ldc:int(20483), ldc:int(65)))
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_63 : int
        var_7_79 : int
        
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
            var_5_63 = and:int(ldc:int(-1684382717), ldc:int(-1229203985))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            var_7_79 = sub:int(div:int(getfield:int(\u12b2\u64ab\u8350\ud7e8\u6d99::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u64ab\u8350\ud7e8\u6d99), xor:int(ldc:int(9253), ldc:int(9255))), ldc:int(100))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c), div:int(getfield:int(\u12b2\u64ab\u8350\ud7e8\u6d99::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u64ab\u8350\ud7e8\u6d99), and:int(ldc:int(4694), ldc:int(16386))), ldc:int(17), ldc:int(16777215))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u760c\u8350\u4c04\u47c2\u52d3\u4c2b), i2f:float(var_7_79:int), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(5401), ldc:int(-5978)))), ldc:int(10526880))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u071d\u6198\ud12e\uc229\u93a2\ua6bd, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:String(\u12b2\u64ab\u8350\ud7e8\u6d99::\uc84e\ube23\u3e2a\u3e75\u3a62\u36d3, this:\u12b2\u64ab\u8350\ud7e8\u6d99), i2f:float(var_7_79:int), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(9), ldc:int(2949)))), ldc:int(16777215))
            
            if (cmpne:boolean(getfield:\ub70c\u7006\u4d85\ub18d\u6b0d(\u12b2\u64ab\u8350\ud7e8\u6d99::\u9033\u3776\u88c5\u0800\u5654\u6ec6, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getstatic:\ub70c\u7006\u4d85\ub18d\u6b0d(\ub70c\u7006\u4d85\ub18d\u6b0d::\u4e72\u600f\u8258\u7ce1\u8413\uafe7))) {
                var_5_63 = and:int(var_5_63:int, ldc:int(-624234585))
                
                if (cmpeq:boolean(getfield:\ub70c\u7006\u4d85\ub18d\u6b0d(\u12b2\u64ab\u8350\ud7e8\u6d99::\u9033\u3776\u88c5\u0800\u5654\u6ec6, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getstatic:\ub70c\u7006\u4d85\ub18d\u6b0d(\ub70c\u7006\u4d85\ub18d\u6b0d::\u7006\u927d\u3e75\u3dd3\u7af6\u98a4))) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2), i2f:float(var_7_79:int), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(5131), ldc:int(3)))), ldc:int(10526880))
                }
            }
            else {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7ce1\u4f52\u760c\ub32d\u51b2\u6198), i2f:float(var_7_79:int), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(1047), ldc:int(12291)))), ldc:int(10526880))
            }
            
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u64ab\u8350\ud7e8\u6d99), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u67e9\u8640\u88c5\u385b\u3dd3\u8bb0, this:\u12b2\u64ab\u8350\ud7e8\u6d99), i2f:float(var_7_79:int), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(2068), ldc:int(16677)))), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent \ub70c\u0c95\u4e72\uc238\u7bad\u4c04(int p0) {
        var_2_61 : int
        var_2_95 : int
        var_4_9A : int
        var_5_A0 : int
        var_6_B4 : StringTextComponent
        
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
        var_2_61 = and:int(ldc:int(426552880), ldc:int(2001927741))
        
        if (cmplt:boolean(p0:int, ldc:int(0))) {
            if (getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7049\uae5d\uff55\ubb2b\u4975\u156b, this:\u12b2\u64ab\u8350\ud7e8\u6d99))) {
                return:ITextComponent(getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u718f\u67d0\u8c8a\u92ff\u3bd6\u4ab3))
            }
        }
        
        do {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1787024967))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(929742654))
                
                if (cmpgt:boolean(p0:int, and:int(ldc:int(1597), ldc:int(6337)))) {
                    loopcontinue()
                }
                
                return:ITextComponent(getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u8d90\u873d\ubff1\u56bd\ub171\u8350))
            }
        } while (cmpeq:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0)))
        
        var_2_95 = and:int(var_2_61:int, ldc:int(1399713395))
        var_4_9A = div:int(p0:int, ldc:int(30))
        var_5_A0 = rem:int(p0:int, ldc:int(30))
        var_6_B4 = initobject:StringTextComponent(StringTextComponent::<init>, loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), and:int(ldc:int(13430), ldc:int(2948))))
        
        if (cmpgt:boolean(var_4_9A:int, ldc:int(0))) {
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], invokestatic:String(Integer::toString, var_4_9A:int)), loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(8197), ldc:int(8192))))
            
            if (cmpne:boolean(var_4_9A:int, xor:int(ldc:int(20504), ldc:int(20505)))) {
                goto(Label_0348)
            }
            
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u4975\ud12e\u2dcc\u718f\ub83f\u4d85))
        }
        
        Label_0187:
        
        if (cmpne:boolean(and:int(var_2_95:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0428)
        }
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0348)
        }
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(536870912)), ldc:int(0))) {
            var_2_95 = and:int(var_2_95:int, ldc:int(-1152145736))
            
            if (cmpgt:boolean(var_5_A0:int, ldc:int(0))) {
                if (cmple:boolean(var_4_9A:int, ldc:int(0))) {
                    goto(Label_0428)
                }
                
                invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(-30590), ldc:int(-30588))))
                goto(Label_0428)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_2_95:int, ldc:int(67108864)), ldc:int(0))) {
            var_2_95 = and:int(var_2_95:int, ldc:int(1028400396))
            goto(Label_0428)
        }
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_95:int, ldc:int(512)), ldc:int(0))) {
                return:ITextComponent(var_6_B4:StringTextComponent[expected:ITextComponent])
            }
            
            goto(Label_0187)
        }
        
        Label_0348:
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_95:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0222)
            }
            
            if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_95 = and:int(var_2_95:int, ldc:int(543994290))
                goto(Label_0187)
            }
            
            var_2_95 = and:int(var_2_95:int, ldc:int(432600889))
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7330\u3bd6\u7043\uc238\ub1b9\u64ab))
            goto(Label_0187)
        }
        
        Label_0428:
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0348)
        }
        
        if (cmpeq:boolean(and:int(var_2_95:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_2_95:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0187)
        }
        
        var_2_95 = and:int(var_2_95:int, ldc:int(2112925690))
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], invokestatic:String(Integer::toString, var_5_A0:int)), loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(2317), ldc:int(2312))))
        
        if (cmpne:boolean(var_5_A0:int, xor:int(ldc:int(-32637), ldc:int(-32638)))) {
            var_2_95 = and:int(var_2_95:int, ldc:int(-70125765))
            invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e))
            goto(Label_0222)
        }
        
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_6_B4:StringTextComponent[expected:IFormattableTextComponent], getstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u8d98\u3d64\u759a\uc229\uafe7\u6b5f))
        goto(Label_0222)
    }
    
    private void lambda$\u6198\u8350\u4f4a\u392e\u3c25\ubded$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99), initobject:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u12b2\u9a18\uc7fe\u4c2b\u6c52/\u12b2\u64ab\u8350\ud7e8\u6d99;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\uae87\ub19c\u9937\u836c\u34df\ub8be), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), and:int(ldc:int(17287), ldc:int(5127)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(771), ldc:int(779)))), xor:int[expected:boolean](ldc:int(394), ldc:int(395))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6198\ub6ab\u960f\u6ec6\ud523\uc238$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ucfaf\u98a4\u3d64\u5db4\u8709\u0b8e, this:\u12b2\u64ab\u8350\ud7e8\u6d99))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_4_9F : String
        
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
            var_4_9F = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), xor:int(ldc:int(6282), ldc:int(6275)))), getfield:String(\ud12e\u946b\u97b7\u51b2\u3d64::\u1187\u62da\u718f\u3c25\u6ec6\u5d20, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7049\uae5d\uff55\ubb2b\u4975\u156b, this:\u12b2\u64ab\u8350\ud7e8\u6d99))), loadelement:String(getstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a), and:int(ldc:int(4250), ldc:int(2635)))), invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\u3a62\u0a06\u600f\u8640\ubff1\u92ff, invokevirtual:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u5654\u36d3\u416d\u836c\u6cfe, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99)))))
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u16f6\u8d98\u3711\u6d69\u98a4\u946b, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u12b2\u64ab\u8350\ud7e8\u6d99)), var_4_9F:String)
            invokevirtual:void(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\ub6ab\u92ff\u8350\u624e\ub102\u5f50, invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), var_4_9F:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 \ubf56\u983f\u71ae\uc2e8\uc4d2\u4f52(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u64ab\u8350\ud7e8\u6d99 p0) {
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
            return:\ud12e\u946b\u97b7\u51b2\u3d64(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7049\uae5d\uff55\ubb2b\u4975\u156b, p0:\u12b2\u64ab\u8350\ud7e8\u6d99))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u3d64\uc84e\u3a62\u5bc4\u3dd3\u92ff() {
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
            return:Logger(getstatic:Logger(\u12b2\u64ab\u8350\ud7e8\u6d99::\u6d99\uafe7\ud7e8\u527a\u5bc4\u6ec6))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \uc910\u8cae\ud158\uc238\u47c2\ub6ab(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u64ab\u8350\ud7e8\u6d99 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u12b2\u64ab\u8350\ud7e8\u6d99))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 \u960f\u600f\u5fe1\ud7e8\u97e6\u7af6(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u64ab\u8350\ud7e8\u6d99 p0) {
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
            return:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u64ab\u8350\ud7e8\u6d99::\ubf56\u3711\u8cae\u8709\u624e\u5bc4, p0:\u12b2\u64ab\u8350\ud7e8\u6d99))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u873d\u7bad\u40a9\u718f\u52d3\u385b(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u12b2\u64ab\u8350\ud7e8\u6d99 p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u12b2\u64ab\u8350\ud7e8\u6d99::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u12b2\u64ab\u8350\ud7e8\u6d99))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_48B : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_13C_0 : byte[] [generated]
        stack_49E_0 : byte[] [generated]
        stack_4FD_0 : byte[] [generated]
        stack_577_0 : byte[] [generated]
        stack_5CD_0 : byte[] [generated]
        var_4_476 : int
        var_3_47B : byte[]
        var_5_47C : int
        expr_49E : byte [generated]
        var_0_4F3 : int
        expr_4FD : byte [generated]
        stack_545_2 : byte [generated]
        stack_522_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_DC : byte[]
        expr_E0 : int [generated]
        var_3_565 : byte[]
        var_5_566 : int
        expr_110 : int [generated]
        var_3_5BB : byte[]
        var_5_5BC : int
        var_3_148 : String
        expr_150 : String[] [generated]
        expr_15A : String[] [generated]
        var_3_3AB : String[]
        
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
        var_0_48B = and:int(ldc:int(1317695283), ldc:int(2138826685))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DC_0 = stack_DE_0 = stack_10E_0 = stack_110_0 = stack_13C_0 = stack_49E_0 = stack_4FD_0 = stack_577_0 = stack_5CD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bkZZgbiYScnggaqJEN5/2GHw+pC4cQ9QwtCOYdDo4JDYyCExEYERUKDAmOJ5L6joqOgrUC9ZoMDIqMDI2LJLif7G6AvAhvJ6Nm/BMejByM/oyQlYoMCYcugXadDo4JDYyCExEbEZiaif+MoB5sAhsODASGFLeObA0HH66Beg6KjoO9iecOgxMdgJ8MoB5sAhsODASGFLeObA0HH66Beg6KjoO0iWgdhoETkR4tC28El6oHf4ygHmwCGw4MBIYUt45sDQcfroF6DoqOg7SJaB2GgRORHi0LbwSYqoZ/DKAebAIbDgwEhhS3jmwNBx+lieYdDo4JDYyCExEeIR9gDAufjKAebAIbDgwEhhS3jmwNBx+lieYdDo4JDYyCExEeIR9gBwiWn4ygHmwCGw4MBIYUt45sDQcfpYnmHQ6OCQ2MghMRHiET5IYfBJeajY8MoB5sAhsODASGFLeObA0HH6WJ5h0OjgkNjIITER4hE+aMEx6NDQ8MoB5sAhsODASGFLeObA0HH6WJ5h0OjgkNjIITER4tAXkFDJ+DBBEVn44AlwCMC5+MoB5sAhsODASGFLeObA0HH6WJ5h0OjgkNjIITER4tDu8JCwKTHwygHmwCGw4MBIYUt45sDQcfpYnmHQ6OCQ2MghMRHi0O7wkLDYAWH4ygHmwCGw4MBIYUt45sDQcfpYnmHQ6OCQ2MghMRHigBdhYGjQEUFZ6tj+AHCJcTlokFHwygHmwCGw4MBIYUt45sDQcfpYnmHQ6OCQ2MghMRHigJ5Z2IgxUfDKAebAIbDgwEhhS3jmwNBx+lieYdDo4JDYyCExEeKQtiFB6OA5aJBR8MoB5sAhsODASGFLeObA0HH6WJ5h0OjgkNjIITER4pC24AlhNNPI")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_476 = expr_6E:int
        var_3_47B = newarray:byte[](byte.class, expr_6E:int)
        var_5_47C = expr_6E:int
        Label_1150:
        
        while (cmpne:boolean(and:int(var_0_48B:int, ldc:int(1)), ldc:int(0))) {
            var_0_48B = and:int(var_0_48B:int, ldc:int(1991669693))
            var_5_47C = add:int(var_5_47C:int, ldc:int(-1))
            expr_49E = loadelement:byte(stack_49E_0:byte[], var_5_47C:int)
            storeelement:byte(var_3_47B:byte[], var_5_47C:int, add:int(or:int(and:int(shl:int(expr_49E:byte, xor:int(ldc:int(-28414), ldc:int(-28410))), ldc:int(-16)), and:int(shr:int(expr_49E:byte[expected:int], xor:int(ldc:int(1129), ldc:int(1133))), ldc:int(15))), ldc:int(114)))
            
            if (cmpne:boolean(var_5_47C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_10E_0 = stack_110_0 = stack_13C_0 = stack_49E_0 = stack_4FD_0 = stack_577_0 = stack_5CD_0 = var_3_47B:byte[]
            goto(Label_0115)
        }
        
        var_0_48B = and:int(var_0_48B:int, ldc:int(-1980373983))
        Label_1254:
        
        while (cmpne:boolean(and:int(var_0_48B:int, ldc:int(1)), ldc:int(0))) {
            var_0_4F3 = and:int(var_0_48B:int, ldc:int(-1977419781))
            var_5_47C = add:int(var_5_47C:int, ldc:int(-1))
            expr_4FD = stack_545_2 = loadelement(stack_4FD_0, var_5_47C)
            
            if (cmplt:boolean(add:int(add:int(var_5_47C:int, ldc:int(2)), neg:int(var_4_476:int)), ldc:int(0))) {
                stack_545_2 = stack_522_0 = add:byte(expr_4FD:byte, loadelement:byte(var_3_47B:byte[], add:int(var_5_47C:int, ldc:int(2))))
                goto(Label_1330)
            }
            
            Label_1290:
            
            if (cmpne:boolean(and:int(var_0_4F3:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_4F3 = and:int(var_0_4F3:int, ldc:int(278676448))
            }
            else {
                var_0_4F3 = and:int(var_0_4F3:int, ldc:int(621539185))
                stack_545_2 = stack_522_0 = add:byte(expr_4FD:byte, ldc:byte(2))
            }
            
            Label_1330:
            
            if (cmpeq:boolean(and:int(var_0_4F3:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1290)
            }
            
            var_0_48B = and:int(var_0_4F3:int, ldc:int(-1952450697))
            storeelement:byte(var_3_47B:byte[], var_5_47C:int, stack_545_2:byte)
            
            if (cmpne:boolean(var_5_47C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_10E_0 = stack_110_0 = stack_13C_0 = stack_49E_0 = stack_4FD_0 = stack_577_0 = stack_5CD_0 = var_3_47B:byte[]
            goto(Label_0172)
        }
        
        goto(Label_1150)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(16384)), ldc:int(0))) {
            var_0_48B = and:int(var_0_48B:int, ldc:int(-20121266))
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0229)
        }
        
        if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(512)), ldc:int(0))) {
            var_0_48B = and:int(var_0_48B:int, ldc:int(1843872928))
        }
        else {
            var_0_48B = and:int(var_0_48B:int, ldc:int(-860362761))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_476 = expr_A7:int
                var_3_47B = newarray:byte[](byte.class, expr_A7:int)
                var_5_47C = expr_A7:int
                goto(Label_1254)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(32768)), ldc:int(0))) {
            var_0_48B = and:int(var_0_48B:int, ldc:int(-1100060382))
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(1024)), ldc:int(0))) {
                var_0_48B = and:int(var_0_48B:int, ldc:int(-1055184678))
                goto(Label_0115)
            }
            
            var_0_48B = and:int(var_0_48B:int, ldc:int(1909124983))
            var_2_DC = stack_DC_0:byte[]
            expr_E0 = add:int(arraylength:int(stack_DE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E0:int, ldc:int(0))) {
                var_3_565 = newarray:byte[](byte.class, expr_E0:int)
                var_5_566 = expr_E0:int
                
                loop {
                    var_0_48B = and:int(var_0_48B:int, ldc:int(-1862864909))
                    var_5_566 = add:int(var_5_566:int, ldc:int(-1))
                    storeelement:byte(var_3_565:byte[], var_5_566:int, add:int(shl:int(loadelement:byte(stack_577_0:byte[], var_5_566:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_DC:byte[], add:int(var_5_566:int, xor:int(ldc:int(2050), ldc:int(2051)))), ldc:int(7)), and:int(ldc:int(1217), ldc:int(2065)))))
                    
                    if (cmpne:boolean(var_5_566:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_10E_0 = stack_110_0 = stack_13C_0 = stack_49E_0 = stack_4FD_0 = stack_577_0 = stack_5CD_0 = var_3_565:byte[]
            }
        }
        
        Label_0229:
        
        if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(256)), ldc:int(0))) {
                var_0_48B = and:int(var_0_48B:int, ldc:int(182824693))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_48B = and:int(var_0_48B:int, ldc:int(839874549))
            expr_110 = arraylength:int(stack_110_0:byte[])
            
            if (cmpne:boolean(expr_110:int, ldc:int(0))) {
                var_3_5BB = newarray:byte[](byte.class, expr_110:int)
                var_5_5BC = expr_110:int
                
                loop {
                    var_0_48B = and:int(var_0_48B:int, ldc:int(-1703481551))
                    var_5_5BC = add:int(var_5_5BC:int, ldc:int(-1))
                    storeelement:byte(var_3_5BB:byte[], var_5_5BC:int, xor:byte(loadelement:byte(stack_5CD_0:byte[], var_5_5BC:int), ldc:byte(7)))
                    
                    if (cmpne:boolean(var_5_5BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_10E_0 = stack_110_0 = stack_13C_0 = stack_49E_0 = stack_4FD_0 = stack_577_0 = stack_5CD_0 = var_3_5BB:byte[]
            }
        }
        
        Label_0277:
        
        if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_48B:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_48B:int, ldc:int(512)), ldc:int(0))) {
            var_0_48B = and:int(var_0_48B:int, ldc:int(-1787802034))
            goto(Label_0115)
        }
        
        var_3_148 = initobject:String(String::<init>, stack_13C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_150 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(95), ldc:int(53)))
        expr_15A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3103), ldc:int(9141)))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(193), ldc:int(197)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(21317), ldc:int(-21358)), and:int(ldc:int(9379), ldc:int(-9444))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(1287), ldc:int(16965)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(9217), ldc:int(-9218)), xor:int(ldc:int(-32256), ldc:int(-32255))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(9606), ldc:int(9612)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(3092), ldc:int(3093)), xor:int(ldc:int(22545), ldc:int(22557))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(3073), ldc:int(3079)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(4172), ldc:int(8349)), and:int(ldc:int(78), ldc:int(14))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(135), ldc:int(10531)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(16657), ldc:int(16671)), and:int(ldc:int(10287), ldc:int(4151))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(24611), ldc:int(24609)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(2068), ldc:int(2099)), and:int(ldc:int(254), ldc:int(2107))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(-32765), ldc:int(-32758)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(12794), ldc:int(2107)), and:int(ldc:int(4205), ldc:int(11113))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(-32766), ldc:int(-32765)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(6271), ldc:int(17001)), xor:int(ldc:int(962), ldc:int(840))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(25119), ldc:int(2087)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(52), ldc:int(190)), and:int(ldc:int(26803), ldc:int(955))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(-14329), ldc:int(-14321)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(22691), ldc:int(22544)), and:int(ldc:int(17916), ldc:int(8926))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(524), ldc:int(543)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(220), ldc:int(17663)), and:int(ldc:int(20788), ldc:int(2497))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(12331), ldc:int(12351)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(1331), ldc:int(1075)), xor:int(ldc:int(-14238), ldc:int(-14009))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(2281), ldc:int(2278)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(0), ldc:int(293)), and:int(ldc:int(12125), ldc:int(16717))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(-18418), ldc:int(1393)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(1357), ldc:int(8541)), and:int(ldc:int(2420), ldc:int(16892))))
        storeelement:String(expr_150:String[], and:int(ldc:int(18576), ldc:int(318)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(4764), ldc:int(5096)), and:int(ldc:int(10724), ldc:int(420))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(12370), ldc:int(12355)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(8376), ldc:int(8476)), and:int(ldc:int(16859), ldc:int(6634))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(-32691), ldc:int(-32673)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(-32376), ldc:int(-32702)), and:int(ldc:int(497), ldc:int(3067))))
        storeelement:String(expr_150:String[], and:int(ldc:int(142), ldc:int(271)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(296), ldc:int(217)), xor:int(ldc:int(9563), ldc:int(10111))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(1549), ldc:int(1537)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(21412), ldc:int(8821)), and:int(ldc:int(21086), ldc:int(10954))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(6145), ldc:int(6156)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(4846), ldc:int(8778)), xor:int(ldc:int(-31893), ldc:int(-32488))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(-24560), ldc:int(-24549)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(9137), ldc:int(8642)), xor:int(ldc:int(1697), ldc:int(1080))))
        putstatic:String[](\u12b2\u64ab\u8350\ud7e8\u6d99::\u7c6b\u34df\uf995\u4179\ub70c\u8c8a, expr_15A:String[])
        var_3_3AB = expr_150:String[]
        putstatic:Logger(\u12b2\u64ab\u8350\ud7e8\u6d99::\u6d99\uafe7\ud7e8\u527a\u5bc4\u6ec6, invokestatic:Logger(LogManager::getLogger))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u0c95\u2dcc\u120d\uf9c5\ud4fe\u494c, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], xor:int(ldc:int(8546), ldc:int(8553)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u760c\u8350\u4c04\u47c2\u52d3\u4c2b, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(23868), ldc:int(14)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7ce1\u4f52\u760c\ub32d\u51b2\u6198, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], xor:int(ldc:int(8197), ldc:int(8200)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], xor:int(ldc:int(-28661), ldc:int(-28667)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u718f\u67d0\u8c8a\u92ff\u3bd6\u4ab3, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], xor:int(ldc:int(2058), ldc:int(2053)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u8d90\u873d\ubff1\u56bd\ub171\u8350, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(305), ldc:int(2202)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(4117), ldc:int(24793)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(2067), ldc:int(28950)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u8d98\u3d64\u759a\uc229\uafe7\u6b5f, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(791), ldc:int(219)))))
        putstatic:ITextComponent(\u12b2\u64ab\u8350\ud7e8\u6d99::\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3AB:String[], and:int(ldc:int(12308), ldc:int(19476)))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C2 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_6CD : int
        
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
        var_3_6C2 = and:int(ldc:int(1339800992), ldc:int(2139821024))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(2130408714))
            var_5_80 = and:int(ldc:int(-19172), ldc:int(19169))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20003), ldc:int(20002)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_6C2:int, ldc:int(2147196262))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(17415), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(1537), ldc:int(20565)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_6C2 = and:int(var_3_D0:int, ldc:int(-22323781))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(16552), ldc:int(16553)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1240121199))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-674194702))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-306423439))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1721903811))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1736359001))
                    }
                    else {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-559990923))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1597891131))
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1142038661))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-519751459))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1261824303))
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-39086304))
                        var_11_E1 = and:int(ldc:int(26440), ldc:int(-26441))
                        goto(Label_1588)
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1564590790))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1921212647))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(687993497))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1827461504))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1420363959))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(462619970))
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-20202016))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1807950574))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-808369703))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(614671752))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1059013828))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1061995449))
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-287622724))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1512283690))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-299163997))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1788863528))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1517466474))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1572042381))
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1858860843))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(9609), ldc:int(4677))
                                goto(Label_1157)
                            }
                        }
                    }
                    
                    Label_0989:
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1657760839))
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1173186359))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-189826601))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1182889836))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(670929588))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1876800430))
                        var_11_E1 = and:int(ldc:int(30725), ldc:int(-32102))
                    }
                    
                    Label_1157:
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1487161762))
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1597334690))
                            goto(Label_0989)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1239025527))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1331230138))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-5392117))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1417)
                            }
                        }
                    }
                    
                    Label_1282:
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1173365075))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1157)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0989)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(947281680))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1213501099))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-374102543))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-807716004))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1588)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1417:
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1200794133))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(288261743))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1462151181))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-889129762))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(965030612))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1436862654))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-1998653171))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-2035157670))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-542392381))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1588:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CD = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1599:
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-578151490))
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-498986189))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1007573759))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(1115370806))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-521317338))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C2 = and:int(var_3_6C2:int, ldc:int(2144934837))
                        var_17_6CD = add:int(var_16_10F:int, and:int(ldc:int(10753), ldc:int(17435)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C2 = and:int(var_3_6C2:int, ldc:int(811953869))
                }
                
                var_3_6C2 = and:int(var_3_6C2:int, ldc:int(-561406039))
                
                if (cmple:boolean(var_5_80 = var_17_6CD:int, sub:int(var_6_87:int, xor:int(ldc:int(1541), ldc:int(1540))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_6C2:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
