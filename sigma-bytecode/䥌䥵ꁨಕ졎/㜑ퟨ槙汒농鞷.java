public interface \u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C> {
    boolean \u97e6\u8c8a\u8258\ubded\u8d90\u4492(C extends \u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1);
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u6cfe\ube23\u36d3\u527a\uae5d\ubded(C extends \u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0);
    
    boolean \u4d85\uc7fe\uff55\ua562\u873d\u6c52(int p0, int p1);
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u446c\ucef1\u1187\u8aa5\u7330\u5245();
    
    \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u9255\u52d3\uc4d2\u416d\u624e\u392e(C extends \u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0) {
        var_2_5F : int
        var_4_6C : \u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_5_75 : int
        var_6_B3 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        
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
            var_2_5F = and:int(ldc:int(964451514), ldc:int(964509695))
            var_4_6C = invokestatic:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::\ua61f\ub19c\u4492\u8df4\u6198\u5db4, invokeinterface:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, p0:C extends \ua61f\uae87\u6b5f\uc31c\ud12e[expected:\ua61f\uae87\u6b5f\uc31c\ud12e]), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
            var_5_75 = and:int(ldc:int(21889), ldc:int(-21890))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-958030276))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1118309324))
                    
                    if (cmplt:boolean(var_5_75:int, invokevirtual:int(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::size, var_4_6C:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))) {
                        var_6_B3 = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ua61f\uae87\u6b5f\uc31c\ud12e::\u72f1\ubefe\u34df\u51b2\u4daf\u6bb9, p0:C extends \ua61f\uae87\u6b5f\uc31c\ud12e[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], var_5_75:int))
                        
                        if (invokevirtual:boolean(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\ub102\u74b1\u8753\u156b\u759a\u8258, var_6_B3:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)) {
                            invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::set, var_4_6C:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_5_75:int, initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\ub32d\uc29a\uae5d\u8258\u5654\uceb8, var_6_B3:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)))
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(2107520186))
                        inc:int(var_5_75, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(var_4_6C:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
        }
        
        goto(Label_0006)
    }
    
    \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc> \ud51e\u6cfe\u36d3\u5f50\u5140\ubefe() {
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
            return:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(invokestatic:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::\u8413\u760c\u8308\u76bc\u8350\u3c25))
        }
        
        goto(Label_0006)
    }
    
    boolean \u6cfe\u1187\ub102\u34df\u183a\uf9c5() {
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
            return:boolean(and:int[expected:boolean](ldc:int(1085), ldc:int(-1088)))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String \u5bc4\ucef1\ud523\u6bb9\ubcb0\ud217() {
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
            return:String(ldc:String(""))
        }
        
        goto(Label_0006)
    }
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \uc2bd\ub18d\u446c\u7330\u156b\u873d() {
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
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u873d\ucb79\u6d99\u72f1\ub7dc\u9937)))
        }
        
        goto(Label_0006)
    }
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u52d3\u385b\ub70c\u5db4\u67d0\ubcb0();
    
    \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<?> \uc246\u56bd\u4f4a\u72f1\u2dcc\ua3b4();
    
    \u36d3\u9033\u6b0d\u983f\u8d90.\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<?> \uc246\u92ff\u392e\u494c\u071d\uff55();
}
