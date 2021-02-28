public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u8d90\u92ff\u718f\u3bc9\u8cae\u392e {
    public void \u8d90\u92ff\u718f\u3bc9\u8cae\u392e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u385b\ud7e8\u71ae\u7043\uc3e3\u3776 p0) {
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
            invokespecial:\ub18d\uae87\u92ee\u624e\u7873\uc31c(\ub18d\uae87\u92ee\u624e\u7873\uc31c::<init>, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e)
            putfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e, invokestatic:ArrayList[expected:List<String>](Lists::newArrayList))
            putfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\ucb79\u5140\u12b2\uae5d\u3dd3\uff55, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e, p0:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.lang.String> \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(java.util.List<java.lang.String> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
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
            invokeinterface:void(List<E>::clear, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e))
            invokeinterface:boolean(List<String>::addAll, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e), p0:List<String>[expected:Collection<? extends String>])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u1833\uc910\uf9c5\ud217\u4bc8\u7873() {
        var_1_1CB : int
        var_3_63 : Calendar
        var_1_A7 : int
        stack_2C3_0 : String [generated]
        
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
            var_1_1CB = and:int(ldc:int(602784682), ldc:int(1005443890))
            var_3_63 = invokestatic:Calendar(Calendar::getInstance)
            invokevirtual:void(Calendar::setTime, var_3_63:Calendar, initobject:Date(Date::<init>))
            
            if (cmpeq:boolean(add:int(invokevirtual:int(Calendar::get, var_3_63:Calendar, and:int(ldc:int(4367), ldc:int(17026))), and:int(ldc:int(63), ldc:int(4097))), ldc:int(12))) {
                if (cmpeq:boolean(invokevirtual:int(Calendar::get, var_3_63:Calendar, and:int(ldc:int(16581), ldc:int(5645))), ldc:int(24))) {
                    return:String(loadelement:String(getstatic:String[](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0), and:int(ldc:int(30488), ldc:int(-30490))))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0411)
                }
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0363)
                }
                
                if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0294)
                }
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_A7 = and:int(var_1_1CB:int, ldc:int(-1334386604))
                }
                else {
                    var_1_A7 = and:int(var_1_1CB:int, ldc:int(-135463961))
                    
                    if (cmpeq:boolean(add:int(invokevirtual:int(Calendar::get, var_3_63:Calendar, and:int(ldc:int(22043), ldc:int(8450))), xor:int(ldc:int(456), ldc:int(457))), xor:int(ldc:int(2448), ldc:int(2449)))) {
                        if (cmpeq:boolean(invokevirtual:int(Calendar::get, var_3_63:Calendar, xor:int(ldc:int(-16381), ldc:int(-16378))), xor:int(ldc:int(8710), ldc:int(8711)))) {
                            return:String(loadelement:String(getstatic:String[](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0), xor:int(ldc:int(402), ldc:int(403))))
                        }
                    }
                }
                
                Label_0205:
                
                if (cmpne:boolean(and:int(var_1_A7:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_A7:int, ldc:int(-1868454050))
                    goto(Label_0411)
                }
                
                if (cmpeq:boolean(and:int(var_1_A7:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_A7:int, ldc:int(646316923))
                    goto(Label_0363)
                }
                
                if (cmpeq:boolean(and:int(var_1_A7:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_A7:int, ldc:int(2065307664))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_A7:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1CB = and:int(var_1_A7:int, ldc:int(-627808196))
                        loopcontinue()
                    }
                    
                    var_1_1CB = and:int(var_1_A7:int, ldc:int(-1208182338))
                    
                    if (cmpeq:boolean(add:int(invokevirtual:int(Calendar::get, var_3_63:Calendar, xor:int(ldc:int(4119), ldc:int(4117))), xor:int(ldc:int(12288), ldc:int(12289))), ldc:int(10))) {
                        if (cmpeq:boolean(invokevirtual:int(Calendar::get, var_3_63:Calendar, and:int(ldc:int(615), ldc:int(16389))), ldc:int(31))) {
                            return:String(loadelement:String(getstatic:String[](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0), xor:int(ldc:int(3841), ldc:int(3843))))
                        }
                    }
                }
                
                Label_0294:
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_1CB:int, ldc:int(2030321393))
                    goto(Label_0411)
                }
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(32)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_1CB:int, ldc:int(478316911))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_A7 = and:int(var_1_1CB:int, ldc:int(-1313159747))
                        goto(Label_0205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1CB = and:int(var_1_1CB:int, ldc:int(1792841635))
                    
                    if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e))) {
                        return:String(aconstnull:String())
                    }
                }
                
                Label_0363:
                
                if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(32)), ldc:int(0))) {
                        var_1_A7 = and:int(var_1_1CB:int, ldc:int(-87625036))
                        goto(Label_0205)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1CB = and:int(var_1_1CB:int, ldc:int(-85085910))
                    
                    if (cmpne:boolean(getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\ucb79\u5140\u12b2\uae5d\u3dd3\uff55, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e), aconstnull:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776())) {
                        if (cmpeq:boolean(invokevirtual:int(Random::nextInt, getstatic:Random(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u873d\u5bc4\u8258\u516c\u8389\u72f1), invokeinterface:int(List<E>::size, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e))), ldc:int(42))) {
                            stack_2C3_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(String::toUpperCase, invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\ub7dc\u6d99\u516c\ub32d\ub113\u7ce1, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\ucb79\u5140\u12b2\uae5d\u3dd3\uff55, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e)), getstatic:Locale(Locale::ROOT))), loadelement:String(getstatic:String[](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0), and:int(ldc:int(5127), ldc:int(2307)))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0411:
                
                if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0363)
                }
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0294)
                }
                
                if (cmpeq:boolean(and:int(var_1_1CB:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_A7 = and:int(var_1_1CB:int, ldc:int(-319918263))
                    goto(Label_0205)
                }
                
                if (cmpne:boolean(and:int(var_1_1CB:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1CB = and:int(var_1_1CB:int, ldc:int(2009896302))
                    stack_2C3_0 = checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e), invokevirtual:int(Random::nextInt, getstatic:Random(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u873d\u5bc4\u8258\u516c\u8389\u72f1), invokeinterface:int(List<E>::size, getfield:List<String>(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u4c2b\u8cae\ub171\u7bad\u183a\uafe7, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e)))))
                    looporswitchbreak()
                }
                
                var_1_1CB = and:int(var_1_1CB:int, ldc:int(607765009))
            }
            
            return:String(stack_2C3_0:String)
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(java.lang.Object p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
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
            invokevirtual:void(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e, checkcast:List(java.util.List.class, p0:Object[expected:List<String>]), p1:\u6c52\u52d3\u516c\uae87\uae5d, p2:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
            return:Object(invokevirtual:List<String>[expected:Object](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u88c5\u1833\uc87f\u6d69\u69d9\u3e75, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\ubf56\u64f2\u392e\u98a4\u120d))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c56\u8753\uae5d\u7d52\ub70c\ub83f$0(java.lang.String p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(248691600), ldc:int(530279382))
            
            if (cmpeq:boolean(invokevirtual:int(String::hashCode, p0:String), ldc:int(125780783))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1885706603))
                stack_8D_0 = and:int(ldc:int(29466), ldc:int(-30623))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(649), ldc:int(648))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_314 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_120_0 : byte[] [generated]
        stack_217_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        stack_327_0 : byte[] [generated]
        var_4_1F1 : int
        var_3_1F6 : byte[]
        var_5_1F7 : int
        expr_21A : byte [generated]
        var_0_31D : int
        expr_327 : byte [generated]
        stack_357_2 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_259 : byte[]
        var_5_25A : int
        expr_CE : int [generated]
        expr_FD : int [generated]
        var_3_12C : String
        expr_134 : String[] [generated]
        expr_13E : String[] [generated]
        
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
        var_0_314 = and:int(ldc:int(-1567997310), ldc:int(-1678780004))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_CC_0 = stack_CE_0 = stack_FB_0 = stack_FD_0 = stack_120_0 = stack_217_0 = stack_26B_0 = stack_2D1_0 = stack_327_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nIZHunaDc4yGeIkmwHuQH9ZmdZUeqJWBeokgsFGyeY0fq3uZeXlZeXmZeXl5OW+4jHp4eYUr0WyObHU4xW16dZJvcoo7xINtBQo=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1F1 = expr_6E:int
        var_3_1F6 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1F7 = expr_6E:int
        Label_0505:
        
        while (cmpeq:boolean(and:int(var_0_314:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0690)
            }
            
            var_0_314 = and:int(var_0_314:int, ldc:int(-470294546))
            var_5_1F7 = add:int(var_5_1F7:int, ldc:int(-1))
            expr_21A = add:byte(loadelement:byte(stack_217_0:byte[], var_5_1F7:int), ldc:byte(4))
            storeelement:byte(var_3_1F6:byte[], var_5_1F7:int, or:int(and:int(shl:int(expr_21A:byte, xor:int(ldc:int(2054), ldc:int(2050))), ldc:int(-16)), and:int(shr:int(expr_21A:byte[expected:int], and:int(ldc:int(532), ldc:int(7341))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1F7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CC_0 = stack_CE_0 = stack_FB_0 = stack_FD_0 = stack_120_0 = stack_217_0 = stack_26B_0 = stack_2D1_0 = stack_327_0 = var_3_1F6:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0768)
        Label_0690:
        
        while (cmpeq:boolean(and:int(var_0_314:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0505)
            }
            
            var_0_314 = and:int(var_0_314:int, ldc:int(-681164068))
            var_5_1F7 = add:int(var_5_1F7:int, ldc:int(-1))
            storeelement:byte(var_3_1F6:byte[], var_5_1F7:int, xor:byte(loadelement:byte(stack_2D1_0:byte[], var_5_1F7:int), ldc:byte(125)))
            
            if (cmpne:boolean(var_5_1F7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CC_0 = stack_CE_0 = stack_FB_0 = stack_FD_0 = stack_120_0 = stack_217_0 = stack_26B_0 = stack_2D1_0 = stack_327_0 = var_3_1F6:byte[]
            goto(Label_0211)
        }
        
        Label_0768:
        
        while (cmpeq:boolean(and:int(var_0_314:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(16384)), ldc:int(0))) {
                var_0_314 = and:int(var_0_314:int, ldc:int(-77682802))
                goto(Label_0505)
            }
            
            var_0_31D = and:int(var_0_314:int, ldc:int(-751080297))
            var_5_1F7 = add:int(var_5_1F7:int, ldc:int(-1))
            expr_327 = loadelement:byte(stack_327_0:byte[], var_5_1F7:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1F7:int, ldc:int(1)), neg:int(var_4_1F1:int)), ldc:int(0))) {
                var_0_31D = and:int(var_0_31D:int, ldc:int(-1760330542))
                stack_357_2 = add:byte(expr_327:byte, ldc:byte(1))
            }
            else {
                stack_357_2 = add:byte(expr_327:byte, loadelement:byte(var_3_1F6:byte[], add:int(var_5_1F7:int, ldc:int(1))))
            }
            
            var_0_314 = and:int(var_0_31D:int, ldc:int(-1494223919))
            storeelement:byte(var_3_1F6:byte[], var_5_1F7:int, stack_357_2:byte)
            
            if (cmpne:boolean(var_5_1F7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CC_0 = stack_CE_0 = stack_FB_0 = stack_FD_0 = stack_120_0 = stack_217_0 = stack_26B_0 = stack_2D1_0 = stack_327_0 = var_3_1F6:byte[]
            goto(Label_0258)
        }
        
        goto(Label_0690)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_314 = and:int(var_0_314:int, ldc:int(-581109188))
            goto(Label_0211)
        }
        
        if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(32)), ldc:int(0))) {
            var_0_314 = and:int(var_0_314:int, ldc:int(-1091056960))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_259 = newarray:byte[](byte.class, expr_9F:int)
                var_5_25A = expr_9F:int
                
                loop {
                    var_0_314 = and:int(var_0_314:int, ldc:int(-1912179714))
                    var_5_25A = add:int(var_5_25A:int, ldc:int(-1))
                    storeelement:byte(var_3_259:byte[], var_5_25A:int, add:int(shl:int(loadelement:byte(stack_26B_0:byte[], var_5_25A:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_25A:int, xor:int(ldc:int(4148), ldc:int(4149)))), ldc:int(4)), and:int(ldc:int(47), ldc:int(18447)))))
                    
                    if (cmpne:boolean(var_5_25A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CC_0 = stack_CE_0 = stack_FB_0 = stack_FD_0 = stack_120_0 = stack_217_0 = stack_26B_0 = stack_2D1_0 = stack_327_0 = var_3_259:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(256)), ldc:int(0))) {
            var_0_314 = and:int(var_0_314:int, ldc:int(940055742))
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_314 = and:int(var_0_314:int, ldc:int(-1162647580))
            expr_CE = arraylength:int(stack_CE_0:byte[])
            
            if (cmpne:boolean(expr_CE:int, ldc:int(0))) {
                var_4_1F1 = expr_CE:int
                var_3_1F6 = newarray:byte[](byte.class, expr_CE:int)
                var_5_1F7 = expr_CE:int
                goto(Label_0690)
            }
        }
        
        Label_0211:
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_314 = and:int(var_0_314:int, ldc:int(-900521096))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_314 = and:int(var_0_314:int, ldc:int(-1022671481))
            expr_FD = arraylength:int(stack_FD_0:byte[])
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_4_1F1 = expr_FD:int
                var_3_1F6 = newarray:byte[](byte.class, expr_FD:int)
                var_5_1F7 = expr_FD:int
                goto(Label_0768)
            }
        }
        
        Label_0258:
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_0_314:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(8192)), ldc:int(0))) {
            var_3_12C = initobject:String(String::<init>, stack_120_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24837), ldc:int(1221)))
            expr_13E = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18563), ldc:int(18566)))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(-15357), ldc:int(-15360)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(-19053), ldc:int(19048)), and:int(ldc:int(135), ldc:int(14359))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(898), ldc:int(899)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(100), ldc:int(99)), xor:int(ldc:int(8387), ldc:int(8405))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(-15676), ldc:int(9530)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(-30198), ldc:int(-30180)), xor:int(ldc:int(150), ldc:int(180))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(2185), ldc:int(2187)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(16480), ldc:int(16450)), and:int(ldc:int(1335), ldc:int(567))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(-28528), ldc:int(-28524)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(1023), ldc:int(1079)), xor:int(ldc:int(-14292), ldc:int(-14235))))
            putstatic:String[](\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0, expr_13E:String[])
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\ud171\u9af2\u4492\uc9f6\u72f1\ud12e, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_134:String[], xor:int(ldc:int(20481), ldc:int(20485)))))
            putstatic:Random(\u8d90\u92ff\u718f\u3bc9\u8cae\u392e::\u873d\u5bc4\u8258\u516c\u8389\u72f1, initobject:Random(Random::<init>))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u9a18\ua3b4\ud171\u4cd9\u3bd6\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BE : int
        
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
        var_3_6B3 = and:int(ldc:int(1746699636), ldc:int(2147259821))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-537413343))
        }
        else {
            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2109724447))
            var_5_8A = and:int(ldc:int(-24535), ldc:int(3984))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32364), ldc:int(30306)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B3:int, ldc:int(-308382228))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(1672), ldc:int(1673)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(16481), ldc:int(4353)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B3 = and:int(var_3_DA:int, ldc:int(-6503099))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(2049), ldc:int(2048)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(105555585))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-650531313))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(14880369))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-132296746))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1074049517))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1026720316))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-230520464))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1222222684))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-2093123676))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1292989200))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(244058970))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1772043767))
                        var_11_EB = and:int(ldc:int(-13099), ldc:int(13096))
                        goto(Label_1593)
                    }
                    
                    Label_0593:
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1437385964))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-155697420))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1373373675))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2028922147))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-10699387))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1102773588))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-722682350))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-315259656))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-4390241))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1979143358))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-160865866))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2021402615))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0866:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1333864097))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1144)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-108180382))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(500155324))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1838994844))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(26715), ldc:int(257))
                                goto(Label_1144)
                            }
                        }
                    }
                    
                    Label_0978:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-988503757))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(324748486))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-517865503))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1824686559))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1382840182))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2025723861))
                        var_11_EB = and:int(ldc:int(4589), ldc:int(-4590))
                    }
                    
                    Label_1144:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-10586322))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-348755577))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2080558563))
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1081632600))
                            goto(Label_0866)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1205974529))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(80695031))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-854148185))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-481435545))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-348141713))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1450)
                            }
                        }
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1007390714))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1144)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(789781119))
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1572234891))
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(997808999))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-48047124))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1935280295))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-314578964))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1593)
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1852087645))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1518142927))
                        goto(Label_1144)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-354212538))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-995931212))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(798452439))
                        loopcontinue()
                    }
                    
                    var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1855954220))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1593:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1604:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1774075099))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1801417987))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1032480657))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1874657965))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2073920861))
                        var_17_6BE = add:int(var_16_119:int, and:int(ldc:int(16385), ldc:int(12293)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-115415643))
                
                if (cmple:boolean(var_5_8A = var_17_6BE:int, sub:int(var_6_91:int, xor:int(ldc:int(258), ldc:int(259))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
