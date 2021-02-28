public class \u6435\ub8be\u718f\u6b0d\u67e9.\u6b5f\u6b5f\uc229\ua562\u9af2\u3776 {
    public void \u6b5f\u6b5f\uc229\ua562\u9af2\u3776(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
        var_4_79 : \u0b8e\ud4fe\uc229\u92ee\ud4fe
        var_5_82 : int
        var_6_AF : int
        var_5_9F : int
        
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
            invokespecial:\ub1b9\u62da\u9af2\u92ee\u64f2(\ub1b9\u62da\u9af2\u92ee\u64f2::<init>, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776, checkcast:\u6198\u8df4\u647c\u47c2\u98a4<?>(\u51fa\u12cb\u7330\u74b1\u6c52.\u6198\u8df4\u647c\u47c2\u98a4<?>.class, aconstnull:\u6198\u8df4\u647c\u47c2\u98a4<?>()), and:int(ldc:int(-10229), ldc:int(8564)))
            putfield:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u416d\ud4fe\ubb2b\u62da\u0c95\u6bb9, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776, invokestatic:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::\u8413\u760c\u8308\u76bc\u8350\u3c25))
            var_4_79 = getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\ua3b4\u8aa5\ub113\ubf56\u873d::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, p0:\ua3b4\u8aa5\ub113\ubf56\u873d)
            var_5_82 = and:int(ldc:int(11082), ldc:int(-12107))
            
            while (cmplt:boolean(var_5_82:int, and:int(ldc:int(9287), ldc:int(293)))) {
                var_6_AF = and:int(ldc:int(26752), ldc:int(-26753))
                
                while (cmplt:boolean(var_6_AF:int, ldc:int(9))) {
                    invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u392e\u4d85\uc2e8\u983f\u4f4a\u7bad(\u392e\u4d85\uc2e8\u983f\u4f4a\u7bad::<init>, invokestatic:\ubff1\u7ce1\u6435\u3c25\u071d[expected:\ua61f\uae87\u6b5f\uc31c\ud12e](\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u98a4\u8bb0\u8d98\ub18d\u47c2\uc3e3), add:int(mul:int(var_5_82:int, ldc:int(9)), var_6_AF:int), add:int(ldc:int(9), mul:int(var_6_AF:int, ldc:int(18))), add:int(ldc:int(18), mul:int(var_5_82:int, ldc:int(18)))))
                    inc:int(var_6_AF, ldc:int(1))
                }
                
                inc:int(var_5_82, ldc:int(1))
            }
            
            var_5_9F = and:int(ldc:int(27946), ldc:int(-32171))
            
            while (cmplt:boolean(var_5_9F:int, ldc:int(9))) {
                invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u92ff\ubded\u0c95\u446c\u67d0(\u92ff\ubded\u0c95\u446c\u67d0::<init>, var_4_79:\u0b8e\ud4fe\uc229\u92ee\ud4fe[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], var_5_9F:int, add:int(ldc:int(9), mul:int(var_5_9F:int, ldc:int(18))), ldc:int(112)))
                inc:int(var_5_9F, ldc:int(1))
            }
            
            invokevirtual:void(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\ub19c\u4daf\u93a2\u51b2\u3a62\u6b5f, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776, ldc:float(0.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ubefe\ube23\uf995\ubb2b\ucfaf\u97b7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(593), ldc:int(1025)))
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\u4daf\u93a2\u51b2\u3a62\u6b5f(float p0) {
        var_2_5F : int
        var_5_8A : int
        var_2_11C : int
        var_6_9D : int
        var_7_D3 : int
        var_8_111 : int
        
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
            var_2_5F = and:int(ldc:int(534814066), ldc:int(938006003))
            var_5_8A = d2i:int(add:double(f2d:double(mul:float(p0:float, i2f:float(sub:int(div:int(sub:int(add:int(invokevirtual:int(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::size, getfield:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u416d\ud4fe\ubb2b\u62da\u0c95\u6bb9, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776)), ldc:int(9)), xor:int(ldc:int(8457), ldc:int(8456))), ldc:int(9)), xor:int(ldc:int(2052), ldc:int(2049)))))), ldc:double(0.5)))
            
            if (cmplt:boolean(var_5_8A:int, ldc:int(0))) {
                var_5_8A = and:int(ldc:int(-7897), ldc:int(7896))
            }
            
            var_2_11C = and:int(var_2_5F:int, ldc:int(-1107296809))
            var_6_9D = and:int(ldc:int(-5150), ldc:int(5149))
            
            while (cmplt:boolean(var_6_9D:int, and:int(ldc:int(5), ldc:int(141)))) {
                var_7_D3 = and:int(ldc:int(9272), ldc:int(-9273))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_11C = and:int(var_2_11C:int, ldc:int(-2135820315))
                    }
                    else {
                        var_2_11C = and:int(var_2_11C:int, ldc:int(1878119803))
                        
                        if (cmplt:boolean(var_7_D3:int, ldc:int(9))) {
                            var_8_111 = add:int(var_7_D3:int, mul:int(add:int(var_6_9D:int, var_5_8A:int), ldc:int(9)))
                            
                            if (logicaland:boolean(cmpge:boolean(var_8_111:int, ldc:int(0)), cmplt:boolean(var_8_111:int, invokevirtual:int(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::size, getfield:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u416d\ud4fe\ubb2b\u62da\u0c95\u6bb9, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776))))) {
                                invokevirtual:void(\ubff1\u7ce1\u6435\u3c25\u071d::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, invokestatic:\ubff1\u7ce1\u6435\u3c25\u071d(\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u98a4\u8bb0\u8d98\ub18d\u47c2\uc3e3), add:int(var_7_D3:int, mul:int(var_6_9D:int, ldc:int(9))), checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::get, getfield:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u416d\ud4fe\ubb2b\u62da\u0c95\u6bb9, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776), var_8_111:int)))
                            }
                            else {
                                var_2_11C = and:int(var_2_11C:int, ldc:int(1039308667))
                                invokevirtual:void(\ubff1\u7ce1\u6435\u3c25\u071d::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, invokestatic:\ubff1\u7ce1\u6435\u3c25\u071d(\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u98a4\u8bb0\u8d98\ub18d\u47c2\uc3e3), add:int(var_7_D3:int, mul:int(var_6_9D:int, ldc:int(9))), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                            }
                            
                            var_2_11C = and:int(var_2_11C:int, ldc:int(-168839685))
                            inc:int(var_7_D3, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11C:int, ldc:int(256)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_11C = and:int(var_2_11C:int, ldc:int(1038679903))
                inc:int(var_6_9D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc2bd\u392e\uc29a\ub7dc\u16f6\u4d85() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(100184432), ldc:int(-1896341456))
            
            if (cmple:boolean(invokevirtual:int(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::size, getfield:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u416d\ud4fe\ubb2b\u62da\u0c95\u6bb9, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776)), ldc:int(45))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(503129467))
                stack_8B_0 = and:int(ldc:int(18225), ldc:int(-24438))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(8848), ldc:int(8849))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u7330\u92ff\u071d\u1833\u7873\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1) {
        var_5_9E : \u92ff\ubded\u0c95\u446c\u67d0
        
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
            
            if (cmpge:boolean(p1:int, sub:int(invokeinterface:int(List<E>::size, getfield:List<\u92ff\ubded\u0c95\u446c\u67d0>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u99f7\u4ab3\u0c95\ub113\u4f52\ub32d, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776)), ldc:int(9)))) {
                if (cmplt:boolean(p1:int, invokeinterface:int(List<E>::size, getfield:List<\u92ff\ubded\u0c95\u446c\u67d0>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u99f7\u4ab3\u0c95\ub113\u4f52\ub32d, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776)))) {
                    var_5_9E = checkcast:\u92ff\ubded\u0c95\u446c\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u92ff\ubded\u0c95\u446c\u67d0.class, invokeinterface:\u92ff\ubded\u0c95\u446c\u67d0(List<\u92ff\ubded\u0c95\u446c\u67d0>::get, getfield:List<\u92ff\ubded\u0c95\u446c\u67d0>(\u6b5f\u6b5f\uc229\ua562\u9af2\u3776::\u99f7\u4ab3\u0c95\ub113\u4f52\ub32d, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776), p1:int))
                    
                    if (cmpne:boolean(var_5_9E:\u92ff\ubded\u0c95\u446c\u67d0, aconstnull:\u92ff\ubded\u0c95\u446c\u67d0())) {
                        if (invokevirtual:boolean(\u92ff\ubded\u0c95\u446c\u67d0::\u3bd6\u873d\u98a4\ub70c\u34df\u7873, var_5_9E:\u92ff\ubded\u0c95\u446c\u67d0)) {
                            invokevirtual:void(\u92ff\ubded\u0c95\u446c\u67d0::\u5db4\u4c04\ub83f\u8df4\uf94d\u6fb0, var_5_9E:\u92ff\ubded\u0c95\u446c\u67d0, getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                        }
                    }
                }
            }
            
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf995\uf94d\uc87f\ucef1\u69d9\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u92ff\ubded\u0c95\u446c\u67d0 p1) {
        var_3_5F : int
        stack_89_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(1610738509), ldc:int(1799452719))
            
            if (cmpeq:boolean(getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\u92ff\ubded\u0c95\u446c\u67d0::\ucef1\u93a2\u8df4\u3d64\u9a18\u4179, p1:\u92ff\ubded\u0c95\u446c\u67d0), invokestatic:\ubff1\u7ce1\u6435\u3c25\u071d[expected:\ua61f\uae87\u6b5f\uc31c\ud12e](\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u98a4\u8bb0\u8d98\ub18d\u47c2\uc3e3))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-84334515))
                stack_89_0 = and:int(ldc:int(3150), ldc:int(-19663))
            }
            else {
                stack_89_0 = and:int(ldc:int(12433), ldc:int(267))
            }
            
            return:boolean(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3504\u983f\uc246\u3a62\u416d\ud217(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u92ff\ubded\u0c95\u446c\u67d0 p0) {
        var_2_5F : int
        stack_89_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(716685853), ldc:int(-1969237221))
            
            if (cmpeq:boolean(getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\u92ff\ubded\u0c95\u446c\u67d0::\ucef1\u93a2\u8df4\u3d64\u9a18\u4179, p0:\u92ff\ubded\u0c95\u446c\u67d0), invokestatic:\ubff1\u7ce1\u6435\u3c25\u071d[expected:\ua61f\uae87\u6b5f\uc31c\ud12e](\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u98a4\u8bb0\u8d98\ub18d\u47c2\uc3e3))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-553674407))
                stack_89_0 = and:int(ldc:int(12084), ldc:int(-16181))
            }
            else {
                stack_89_0 = and:int(ldc:int(7105), ldc:int(16387))
            }
            
            return:boolean(stack_89_0:int)
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
    
    public void \uf995\u960f\ub70c\u8709\u64ab\u56bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_648 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_653 : int
        
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
        var_3_648 = and:int(ldc:int(-1808540641), ldc:int(-560177193))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u6b5f\uc229\ua562\u9af2\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
            var_3_648 = and:int(var_3_648:int, ldc:int(-1246440452))
            var_5_7D = and:int(ldc:int(5714), ldc:int(-5715))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26075), ldc:int(25050)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_648:int, ldc:int(-594389858))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1177), ldc:int(611)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17609), ldc:int(12803)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_648 = and:int(var_3_D2:int, ldc:int(-30215275))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(2080), ldc:int(2081)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-678113376))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-158041459))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-2113882357))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-478957628))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1415483032))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-888877945))
                    }
                    else {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1859037985))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(764602445))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-731707624))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1479441951))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1438451))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(723473366))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-431897844))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(2104383228))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-61508203))
                        var_11_E3 = and:int(ldc:int(26433), ldc:int(-26434))
                        goto(Label_1483)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-226704641))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(2034620383))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1422878550))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1700806485))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1949241740))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(1094754851))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1315774755))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1538965336))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(221230933))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1906039666))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1509828331))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(499613101))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-908482542))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-222309762))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0853:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(826837020))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1814404748))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-2107374603))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(2046610251))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1191610721))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(8721), ldc:int(8720))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0969:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1261646544))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(679985622))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1594499288))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-191377249))
                        var_11_E3 = and:int(ldc:int(-7749), ldc:int(7748))
                    }
                    
                    Label_1114:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0969)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(1680058874))
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-698428036))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(277241415))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(1995031115))
                            goto(Label_1114)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0969)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0853)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-671333617))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1334643939))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1483)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1325:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1102528559))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1924386740))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1826332178))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1306931893))
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1695920978))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-705340289))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(512)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(354003291))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_648 = and:int(var_3_648:int, ldc:int(-1172934305))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1483:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_653 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(577405386))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1527134232))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1917132436))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1111275970))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-621447434))
                        var_17_653 = add:int(var_16_111:int, and:int(ldc:int(24611), ldc:int(6721)))
                        looporswitchbreak()
                    }
                    
                    var_3_648 = and:int(var_3_648:int, ldc:int(-654809822))
                }
                
                var_3_648 = and:int(var_3_648:int, ldc:int(-1124270889))
                
                if (cmple:boolean(var_5_7D = var_17_653:int, sub:int(var_6_84:int, xor:int(ldc:int(3072), ldc:int(3073))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_648 = and:int(var_3_648:int, ldc:int(1020805792))
            goto(Label_0106)
        }
    }
}
