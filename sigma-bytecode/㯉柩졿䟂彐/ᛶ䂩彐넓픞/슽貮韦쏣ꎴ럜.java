public final class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc {
    private void \uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(java.util.stream.Stream<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b> p0) {
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
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[] \u7049\u760c\uc7fe\u3bd6\u6b5f\u7330() {
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
            invokespecial:void(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\ube23\u51fa\u5f50\u97e6\ubded\u8709, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc))
        }
        
        goto(Label_0006)
    }
    
    private void \ube23\u51fa\u5f50\u97e6\ubded\u8709() {
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
    
    public boolean test(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_2_5F : int
        var_2_6F : int
        var_4_9C : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[]
        var_5_A1 : int
        var_6_AA : int
        
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
        var_2_5F = and:int(ldc:int(1499948442), ldc:int(-587276613))
        
        if (cmpeq:boolean(p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, aconstnull:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56())) {
            return:boolean(and:int[expected:boolean](ldc:int(1185), ldc:int(-1186)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_6F = and:int(var_2_5F:int, ldc:int(-825834816))
            }
            else {
                var_2_6F = and:int(var_2_5F:int, ldc:int(1523480187))
                invokespecial:void(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\ube23\u51fa\u5f50\u97e6\ubded\u8709, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
                
                if (cmpeq:boolean(arraylength:int(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)), ldc:int(0))) {
                    return:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(524288)), ldc:int(0))) {
                var_4_9C = getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
                var_5_A1 = arraylength:int(var_4_9C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[])
                var_6_AA = and:int(ldc:int(-1026), ldc:int(1025))
                
                while (cmplt:boolean(var_6_AA:int, var_5_A1:int)) {
                    if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, loadelement:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(var_4_9C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[], var_6_AA:int)), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        return:boolean(and:int[expected:boolean](ldc:int(257), ldc:int(5259)))
                    }
                    
                    inc:int(var_6_AA, ldc:int(1))
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(-29551), ldc:int(29292)))
            }
            
            var_2_5F = and:int(var_2_6F:int, ldc:int(-53479099))
        }
    }
    
    public it.unimi.dsi.fastutil.ints.IntList \u9033\ub171\u12b2\ua61f\u16f6\u3dd3() {
        var_1_9F : int
        var_3_8D : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[]
        var_4_90 : int
        var_5_99 : int
        
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
            var_1_9F = and:int(ldc:int(-328357450), ldc:int(-1177607202))
            
            if (cmpeq:boolean(getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), aconstnull:IntList())) {
                invokespecial:void(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\ube23\u51fa\u5f50\u97e6\ubded\u8709, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
                putfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc, initobject:IntArrayList[expected:IntList](IntArrayList::<init>, arraylength:int(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc))))
                var_3_8D = getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
                var_4_90 = arraylength:int(var_3_8D:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[])
                var_5_99 = and:int(ldc:int(-24963), ldc:int(24962))
                
                loop {
                    var_1_9F = and:int(var_1_9F:int, ldc:int(-1888907317))
                    
                    if (cmpge:boolean(var_5_99:int, var_4_90:int)) {
                        looporswitchbreak()
                    }
                    
                    invokeinterface:boolean(IntList::add, getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), invokestatic:int(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\u7c6b\u527a\u0a06\u5d20\ub32d\u64ab, loadelement:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(var_3_8D:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[], var_5_99:int)))
                    inc:int(var_5_99, ldc:int(1))
                }
                
                var_1_9F = and:int(var_1_9F:int, ldc:int(-665241742))
                invokeinterface:void(IntList::sort, getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), getstatic:IntComparator[expected:Comparator](IntComparators::NATURAL_COMPARATOR))
            }
            
            return:IntList(getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc))
        }
        
        goto(Label_0006)
    }
    
    public void \u3c25\uf9c5\u3c25\u760c\u4492\u8308(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_75 : int
        
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
            var_2_5F = and:int(ldc:int(-1154024022), ldc:int(-1564742866))
            invokespecial:void(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\ube23\u51fa\u5f50\u97e6\ubded\u8709, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, arraylength:int(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)))
            var_4_75 = and:int(ldc:int(-6613), ldc:int(6608))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1342709446))
                
                if (cmpge:boolean(var_4_75:int, arraylength:int(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uc84e\u0b8e\u8350\ub171\u3e75\u9255, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, loadelement:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), var_4_75:int))
                inc:int(var_4_75, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement \u67e9\u0800\u59ec\u839e\uc2bd\u0800() {
        var_3_7B : JsonArray
        var_4_80 : \u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[]
        var_5_85 : int
        var_6_8E : int
        
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
        
        if (cmpne:boolean(arraylength:int(getfield:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u6435\u8df4\ub70c\u4492\u6d69\u3d4b, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)), and:int(ldc:int(9261), ldc:int(705)))) {
            var_3_7B = initobject:JsonArray(JsonArray::<init>)
            var_4_80 = getfield:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u6435\u8df4\ub70c\u4492\u6d69\u3d4b, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
            var_5_85 = arraylength:int(var_4_80:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[])
            var_6_8E = and:int(ldc:int(-27680), ldc:int(26651))
            
            while (cmplt:boolean(var_6_8E:int, var_5_85:int)) {
                invokevirtual:void(JsonArray::add, var_3_7B:JsonArray, invokeinterface:JsonObject(\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b::\ubded\u5245\u8308\u3c25\ua562\u4492, loadelement:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b(var_4_80:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[], var_6_8E:int)))
                inc:int(var_6_8E, ldc:int(1))
            }
            
            return:JsonElement(var_3_7B:JsonElement)
        }
        
        return:JsonElement(invokeinterface:JsonObject[expected:JsonElement](\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b::\ubded\u5245\u8308\u3c25\ua562\u4492, loadelement:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b(getfield:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u6435\u8df4\ub70c\u4492\u6d69\u3d4b, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), and:int(ldc:int(-19195), ldc:int(19066)))))
    }
    
    public boolean \ub32d\u99f7\u5140\u51b2\ub1b9\ub32d() {
        var_1_5F : int
        stack_E7_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1359533821), ldc:int(-134243461))
            
            if (cmpeq:boolean(arraylength:int(getfield:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u6435\u8df4\ub70c\u4492\u6d69\u3d4b, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)), ldc:int(0))) {
                if (cmpeq:boolean(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), aconstnull:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[]())) {
                    goto(Label_0145)
                }
                
                if (cmpeq:boolean(arraylength:int(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u34df\u3504\u4179\u51fa\u4e72\u36d3, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)), ldc:int(0))) {
                    goto(Label_0145)
                }
            }
            
            Label_0104:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                stack_E7_0 = and:int[expected:boolean](ldc:int(28804), ldc:int(-28805))
                return:boolean(stack_E7_0:boolean)
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-626328847))
            Label_0145:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0104)
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-373297893))
            
            if (logicaland:boolean(cmpne:boolean(getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc), aconstnull:IntList()), logicalnot:boolean(invokeinterface:boolean(IntList::isEmpty, getfield:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u760c\u6cfe\u72f1\u4bc8\u385b\u7e3f, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc))))) {
                goto(Label_0104)
            }
            
            stack_E7_0 = xor:int[expected:boolean](ldc:int(1026), ldc:int(1027))
            return:boolean(stack_E7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \uc2e8\u965f\ud4fe\u62da\u6b5f\uc31c(java.util.stream.Stream<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b> p0) {
        var_1_5F : int
        var_3_68 : \uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc
        stack_86_0 : \uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc [generated]
        
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
            var_1_5F = and:int(ldc:int(-189292182), ldc:int(1868821371))
            var_3_68 = initobject:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::<init>, p0:Stream<? extends \u8df4\uc9f6\u4e72\u1187\u8308\ubb2b>)
            
            if (cmpne:boolean(arraylength:int(getfield:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u6435\u8df4\ub70c\u4492\u6d69\u3d4b, var_3_68:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1327859675))
                stack_86_0 = var_3_68:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc
            }
            else {
                stack_86_0 = getstatic:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u983f\u12b2\u3776\u873d\ubded\u446c)
            }
            
            return:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(stack_86_0:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u3a62\u12b2\u983f\u8cae\uae87\ucef1(\u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab[] p0) {
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
            return:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(invokestatic:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u72f1\ud12e\u5245\ub113\ub7dc\u72f1, invokeinterface:Stream<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Stream<\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab>::map, invokestatic:Stream<\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab>(Arrays::stream, p0:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab[]), invokedynamic:Function<\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(apply:()Ljava/util/function/Function;))))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u67d0\ud171\u76bc\u8cae\u8c8a\u5db4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[] p0) {
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
            return:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(invokestatic:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u72f1\ud12e\u5245\ub113\ub7dc\u72f1, invokestatic:Stream<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Arrays::stream, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[])))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u72f1\ud12e\u5245\ub113\ub7dc\u72f1(java.util.stream.Stream<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0) {
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
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u600f\u647c\u071d\ub102\ua562\u4daf(\u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52> p0) {
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
            return:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(invokestatic:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\uc2e8\u965f\ud4fe\u62da\u6b5f\uc31c, invokestatic:Stream<\u392e\u6435\uc229\u8413\uceb8\uafe7>(Stream<T>::of, initobject:\u392e\u6435\uc229\u8413\uceb8\uafe7(\u392e\u6435\uc229\u8413\uceb8\uafe7::<init>, p0:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>, aconstnull:\u67e9\uae5d\u6c52\u4492\ucfaf\u6c56()))))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u56bd\u416d\u6435\u600f\u3e2a\u7049(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc \u98a4\u4ab3\u718f\u718f\u946b\u3504(com.google.gson.JsonElement p0) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b \u965f\u527a\u12b2\u6b5f\u3c25\uc84e(com.google.gson.JsonObject p0) {
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
    
    public boolean test(java.lang.Object p0) {
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
            return:boolean(invokevirtual:boolean(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::test, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc, checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, p0:Object[expected:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56])))
        }
        
        goto(Label_0006)
    }
    
    private static com.google.gson.JsonSyntaxException lambda$\u965f\u7330\u516c\u965f\u67e9\u718f$7(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:JsonSyntaxException(initobject:JsonSyntaxException(JsonSyntaxException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\uceb8\u0c95\ud158\u3bc9\u960f\uc238), xor:int(ldc:int(9345), ldc:int(9352)))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]), loadelement:String(getstatic:String[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\uceb8\u0c95\ud158\u3bc9\u960f\uc238), and:int(ldc:int(1559), ldc:int(28839)))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b lambda$\u960f\u4975\u5d20\u6ec6\u516c\uc246$6(com.google.gson.JsonElement p0) {
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
            return:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b(invokestatic:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u965f\u527a\u12b2\u6b5f\u3c25\uc84e, invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\uceb8\u0c95\ud158\u3bc9\u960f\uc238), and:int(ldc:int(19), ldc:int(1227))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e lambda$\uf995\u40a9\u8cae\uae87\u0b8e\u4daf$5(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            return:\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e(initobject:\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e(\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e::<init>, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u16f6\u6435\u59ec\u759a\u4cd9\u71ae, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640), aconstnull:\u67e9\uae5d\u6c52\u4492\ucfaf\u6c56()))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e lambda$\uc246\u6cfe\u61a4\u34df\u7af6\u4c2b$4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e(initobject:\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e(\ub1b9\uae5d\ucef1\uc246\u3d64\ud12e::<init>, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, aconstnull:\u67e9\uae5d\u6c52\u4492\ucfaf\u6c56()))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u61a4\u4f4a\ub83f\u61a4\uff55\u4f4a$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1106729578), ldc:int(-251658630))
            
            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(183721846))
                stack_8A_0 = and:int(ldc:int(-7515), ldc:int(7498))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(40), ldc:int(41))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[] lambda$\u8d90\u392e\ua6bd\u8258\uafe7\uc2bd$2(int p0) {
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
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](newarray:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[](\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\ub102\ua068\u5140\ud171\u34df\u52d3$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b p0) {
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
            return:Stream(invokeinterface:Stream<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Collection<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::stream, invokeinterface:Collection<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b::\uc9f6\u960f\uf94d\ubcb0\u392e\u64f2, p0:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[] lambda$\u71f1\ub70c\u47c2\u92ee\ucfaf\u12cb$0(int p0) {
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
            return:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](newarray:\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        stack_307_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_220 : int
        var_3_225 : byte[]
        var_5_226 : int
        var_0_250 : int
        expr_237 : byte [generated]
        stack_27F_2 : byte [generated]
        stack_253_0 : byte [generated]
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
        expr_B5 : int [generated]
        var_3_2F5 : byte[]
        var_5_2F6 : int
        expr_30A : byte [generated]
        var_3_E6 : String
        stack_20C_0 : String[] [generated]
        expr_F8 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-1652036861), ldc:int(-67324115))
            expr_68 = stack_93_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_DA_0 = stack_2B1_0 = stack_307_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8MfRFMABGe79Pwvx9PMA9AP8TRAUsf4WrUj8XOzzEAL2rFAJ8PYOA7z6UAvtAfVKwbL3CzKqNg4BB9EUwAEZ7v0/C/H08wD/8Q8OHgABBAHk/hatSPxc7PMQAvasUAnw9g4DvAEoue8SCfDsEET/7wj8RLrsUwgA/QUOvQIEr0v47ToCBq4BAALkClL/DsIbBLTxJvD2/Eof0vz88Ab5DAP6BKtHAQ5SBxCu5Oz9RAT8VRe/xvAABe/0+0MUsgkNO8zxAfVGyP1PDwqx//PA9Cr8+Q1BCN7/9vSrRwEOUf/8tgASqw8F7e/eSgICEg5JDA76B/Gwr95KAgISDlS49Q0+N8AEAgS2wgINBfwRB/o="))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_220 = expr_6E:int
                var_3_225 = newarray:byte[](byte.class, expr_6E:int)
                var_5_226 = expr_6E:int
                
                loop {
                    var_0_250 = and:int(var_0_61:int, ldc:int(1070920735))
                    var_5_226 = add:int(var_5_226:int, ldc:int(-1))
                    expr_237 = stack_27F_2 = loadelement(expr_68, var_5_226)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_226:int, ldc:int(6)), neg:int(var_4_220:int)), ldc:int(0))) {
                        stack_27F_2 = stack_253_0 = add:byte(expr_237:byte, loadelement:byte(var_3_225:byte[], add:int(var_5_226:int, ldc:int(6))))
                        goto(Label_0611)
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_250 = and:int(var_0_250:int, ldc:int(533127373))
                        stack_27F_2 = stack_253_0 = add:byte(expr_237:byte, ldc:byte(6))
                    }
                    
                    Label_0611:
                    
                    if (cmpne:boolean(and:int(var_0_250:int, ldc:int(32)), ldc:int(0))) {
                        var_0_250 = and:int(var_0_250:int, ldc:int(578795827))
                        goto(Label_0580)
                    }
                    
                    var_0_61 = and:int(var_0_250:int, ldc:int(-101397539))
                    storeelement:byte(var_3_225:byte[], var_5_226:int, stack_27F_2:byte)
                    
                    if (cmpne:boolean(var_5_226:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_DA_0 = stack_2B1_0 = stack_307_0 = var_3_225:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1533211933))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1574423371))
                    var_2_93 = stack_93_0:byte[]
                    expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                        var_3_29F = newarray:byte[](byte.class, expr_97:int)
                        var_5_2A0 = expr_97:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(2145709235))
                            var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                            storeelement:byte(var_3_29F:byte[], var_5_2A0:int, add:int(shl:int(loadelement:byte(stack_2B1_0:byte[], var_5_2A0:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_2A0:int, and:int(ldc:int(9609), ldc:int(2133)))), ldc:int(4)), xor:int(ldc:int(17000), ldc:int(16999)))))
                            
                            if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_DA_0 = stack_2B1_0 = stack_307_0 = var_3_29F:byte[]
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(-105984715))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_2F5 = newarray:byte[](byte.class, expr_B5:int)
                        var_5_2F6 = expr_B5:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(966755071))
                            var_5_2F6 = add:int(var_5_2F6:int, ldc:int(-1))
                            expr_30A = xor:byte(loadelement:byte(stack_307_0:byte[], var_5_2F6:int), ldc:byte(64))
                            storeelement:byte(var_3_2F5:byte[], var_5_2F6:int, add:int(or:int(and:int(shl:int(expr_30A:byte, and:int(ldc:int(8556), ldc:int(3076))), ldc:int(-16)), and:int(shr:int(expr_30A:byte[expected:int], and:int(ldc:int(25124), ldc:int(3076))), ldc:int(15))), ldc:int(94)))
                            
                            if (cmpne:boolean(var_5_2F6:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_DA_0 = stack_2B1_0 = stack_307_0 = var_3_2F5:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_61 = and:int(var_0_61:int, ldc:int(1718998408))
            }
            
            var_3_E6 = initobject:String(String::<init>, stack_DA_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_20C_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(465), ldc:int(475)))
            expr_F8 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18711), ldc:int(18717)))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(27), ldc:int(28)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(-8129), ldc:int(8064)), xor:int(ldc:int(4100), ldc:int(4101))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(1030), ldc:int(1027)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(1328), ldc:int(1329)), and:int(ldc:int(2617), ldc:int(377))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(4133), ldc:int(4141)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(21113), ldc:int(2361)), and:int(ldc:int(1262), ldc:int(12907))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(272), ldc:int(273)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(-12288), ldc:int(-12182)), xor:int(ldc:int(-31478), ldc:int(-31342))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(17527), ldc:int(-19712)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(11450), ldc:int(4508)), xor:int(ldc:int(21178), ldc:int(21103))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(8274), ldc:int(16642)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(16629), ldc:int(2005)), xor:int(ldc:int(-31675), ldc:int(-31571))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(8336), ldc:int(8345)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(2255), ldc:int(2087)), and:int(ldc:int(8951), ldc:int(502))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(543), ldc:int(537)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(16743), ldc:int(16785)), xor:int(ldc:int(16858), ldc:int(16594))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(9352), ldc:int(9355)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(4360), ldc:int(907)), xor:int(ldc:int(660), ldc:int(920))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(4), ldc:int(3094)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(1292), ldc:int(18716)), and:int(ldc:int(26927), ldc:int(4495))))
            putstatic:String[](\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\uceb8\u0c95\ud158\u3bc9\u960f\uc238, expr_F8:String[])
            putstatic:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u983f\u12b2\u3776\u873d\ubded\u446c, initobject:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::<init>, invokestatic:Stream<? extends \u8df4\uc9f6\u4e72\u1187\u8308\ubb2b>(Stream<T>::empty)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\ub70c\u3c25\ub102\u8d98\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6EB : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6F6 : int
        
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
        var_3_6EB = and:int(ldc:int(-468576041), ldc:int(616225343))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1730101420))
        }
        else {
            var_3_6EB = and:int(var_3_6EB:int, ldc:int(819085267))
            var_5_8A = and:int(ldc:int(-4184), ldc:int(4183))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18970), ldc:int(-23135)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6EB:int, ldc:int(1931451579))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(1065), ldc:int(1064)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(137), ldc:int(4675)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6EB = and:int(var_3_E2:int, ldc:int(-493477965))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1040), ldc:int(1041)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1948819229))
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-840784907))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1066915144))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1575551707))
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(735148278))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1183969393))
                    }
                    else {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1363257005))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0628)
                            }
                            
                            goto(Label_0874)
                        }
                    }
                    
                    Label_0436:
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1887980871))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1032779792))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-236255613))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-2021239516))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-365796706))
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(47745902))
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1917299927))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(842456019))
                            var_11_F3 = and:int(ldc:int(5560), ldc:int(-5625))
                            goto(Label_1604)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(548289386))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-434660841))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0874)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1956937481))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(2036931448))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-8723720))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(104670065))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1223603472))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(-358151633))
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1827921727))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0874:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1213206557))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(33049189))
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1281141713))
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(987151923))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(3077), ldc:int(20833))
                                goto(Label_1195)
                            }
                        }
                    }
                    
                    Label_0990:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-143190997))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1244825159))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(226724896))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(985781432))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1911710142))
                            goto(Label_0874)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(639279021))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1060194303))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1778865578))
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(-555726004))
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1918294111))
                        var_11_F3 = and:int(ldc:int(1776), ldc:int(-1777))
                    }
                    
                    Label_1195:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(842067353))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0990)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1532407097))
                            goto(Label_0874)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1331700481))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1596564371))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1195)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(193872952))
                            goto(Label_0990)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0874)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(245476629))
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1501804044))
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6EB = and:int(var_3_6EB:int, ldc:int(-2038370408))
                            loopcontinue()
                        }
                        
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1474561409))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1604)
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1581163059))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(882493372))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(990155465))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-618633043))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(75360216))
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1088890748))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(471789679))
                        loopcontinue()
                    }
                    
                    var_3_6EB = and:int(var_3_6EB:int, ldc:int(-153905065))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1604:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F6 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1615:
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(979279209))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(106661743))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(2028715914))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1214970763))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-288009628))
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1163118571))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(1263303293))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EB:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(676649591))
                        goto(Label_0436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6EB = and:int(var_3_6EB:int, ldc:int(-1273577509))
                        var_17_6F6 = add:int(var_16_121:int, and:int(ldc:int(9617), ldc:int(4097)))
                        looporswitchbreak()
                    }
                    
                    var_3_6EB = and:int(var_3_6EB:int, ldc:int(-2119062365))
                }
                
                var_3_6EB = and:int(var_3_6EB:int, ldc:int(2041839191))
                
                if (cmple:boolean(var_5_8A = var_17_6F6:int, sub:int(var_6_91:int, xor:int(ldc:int(-26623), ldc:int(-26624))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6EB:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_6EB = and:int(var_3_6EB:int, ldc:int(1518328323))
            goto(Label_0108)
        }
    }
}
