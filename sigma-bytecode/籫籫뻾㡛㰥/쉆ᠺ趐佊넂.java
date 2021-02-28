public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102 {
    public void \uc246\u183a\u8d90\u4f4a\ub102(\u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, int p2, int p3, boolean p4) {
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
            putfield:\uc246\u156b\u7ce1\u3d64\u7873(\uc246\u183a\u8d90\u4f4a\ub102::\u3776\ud523\u9255\ucfaf\u8413\u759a, this:\uc246\u183a\u8d90\u4f4a\ub102, p0:\uc246\u156b\u7ce1\u3d64\u7873)
            invokespecial:Object(Object::<init>, this:\uc246\u183a\u8d90\u4f4a\ub102)
            putfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102, invokestatic:HashSet[expected:Set<\u51fa\u6c52\u7330\u7330\u960f>](Sets::newHashSet))
            putfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102, initobject:\u873d\uc229\u839e\uf94d\uae87\u6d69(\u873d\uc229\u839e\uf94d\uae87\u6d69::<init>, invokestatic:\ube23\uc238\u5140\u4cd9\u8aa5(\uc246\u156b\u7ce1\u3d64\u7873::\u927d\u0800\uc87f\ube23\u7873\u40a9, p0:\uc246\u156b\u7ce1\u3d64\u7873), p1:\u7d52\u718f\u3776\u6fb0\ub83f, p3:int, p4:boolean, invokedynamic:Consumer<\u946b\u6d99\u8df4\u12cb\u5d20<?>>(accept:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\uc246\u183a\u8d90\u4f4a\ub102;)Ljava/util/function/Consumer;, this:\uc246\u183a\u8d90\u4f4a\ub102)))
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            putfield:int(\uc246\u183a\u8d90\u4f4a\ub102::\u64ab\u8308\u40a9\ubefe\u4f52\uf9c5, this:\uc246\u183a\u8d90\u4f4a\ub102, p2:int)
            putfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\uc246\u183a\u8d90\u4f4a\ub102::\ud171\u47c2\u5f50\uc246\uc84e\u3504, this:\uc246\u183a\u8d90\u4f4a\ub102, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_A6 : int
        stack_C1_0 : int [generated]
        
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
            var_2_A6 = and:int(ldc:int(-1210457923), ldc:int(-403204612))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102.class, p0:Object)) {
                if (cmpne:boolean(invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, checkcast:\uc246\u183a\u8d90\u4f4a\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102.class, p0:Object[expected:\uc246\u183a\u8d90\u4f4a\ub102]))), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102)))) {
                    goto(Label_0155)
                }
                
                stack_C1_0 = xor:int[expected:boolean](ldc:int(2352), ldc:int(2353))
                return:boolean(stack_C1_0:boolean)
            }
            
            Label_0103:
            
            if (cmpne:boolean(and:int(var_2_A6:int, ldc:int(128)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(8799), ldc:int(-8800)))
            }
            
            var_2_A6 = and:int(var_2_A6:int, ldc:int(-1752506820))
            Label_0155:
            
            if (cmpne:boolean(and:int(var_2_A6:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0103)
            }
            
            var_2_A6 = and:int(var_2_A6:int, ldc:int(-1415614530))
            stack_C1_0 = and:int[expected:boolean](ldc:int(9273), ldc:int(-27708))
            return:boolean(stack_C1_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102)))
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\u64ab\ud158\uc4d2\u6ec6\u183a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
        var_2_5F : int
        var_4_69 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        
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
            var_2_5F = and:int(ldc:int(486881202), ldc:int(245704106))
            var_4_69 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Set<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1635289106))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6435\u6b5f\u6c56\u5bc4\u2dcc\u5db4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
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
            invokevirtual:void(\uc246\u183a\u8d90\u4f4a\ub102::\u759a\u64ab\ud158\uc4d2\u6ec6\u183a, this:\uc246\u183a\u8d90\u4f4a\ub102, p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102))) {
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, getfield:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u51fa\u6c52\u7330\u7330\u960f](\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102))), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u494c\u7006\u8df4\u6c52\uc246\ubefe() {
        var_1_5F : int
        var_3_69 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        
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
            var_1_5F = and:int(ldc:int(2132762847), ldc:int(2142105955))
            var_3_69 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Set<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1934585266))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u873d\uc229\u839e\uf94d\uae87\u6d69::\ud523\uc246\u62da\u12cb\u494c\ub1b9, getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102), checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_3_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubefe\u56bd\u4bc8\u4f52\u93a2\u6c52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            
            if (invokeinterface:boolean(Set<E>::remove, getfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object])) {
                invokevirtual:void(\u873d\uc229\u839e\uf94d\uae87\u6d69::\ud523\uc246\u62da\u12cb\u494c\ub1b9, getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u7c6b\u8bb0\u6b5f\u183a\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_2_AE : int
        var_4_80 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_5_9B : int
        stack_115_0 : int [generated]
        var_2_1CB : int
        var_7_13C : int
        var_8_184 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_9_192 : \u8bb0\u4975\ub7dc\u47c2\u3e75
        stack_1E7_0 : int [generated]
        
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
            var_2_AE = and:int(ldc:int(-1958369955), ldc:int(-1545620051))
            
            if (cmpne:boolean(p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102))) {
                var_4_80 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u5db4\ubb2b\ube23\uc2e8\u873d\ub32d, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u873d\uc229\u839e\uf94d\uae87\u6d69::\ub171\u5bc4\u7873\u99f7\u9033\ubefe, getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102)))
                var_5_9B = invokestatic:int(Math::min, invokespecial:int(\uc246\u183a\u8d90\u4f4a\ub102::\ub171\ua3b4\ud158\u62da\u6cfe\u3a62, this:\uc246\u183a\u8d90\u4f4a\ub102), mul:int(sub:int(invokestatic:int(\uc246\u156b\u7ce1\u3d64\u7873::\u92ff\u9033\u7bad\u8aa5\u0800\uae87, getfield:\uc246\u156b\u7ce1\u3d64\u7873(\uc246\u183a\u8d90\u4f4a\ub102::\u3776\ud523\u9255\ucfaf\u8413\u759a, this:\uc246\u183a\u8d90\u4f4a\ub102)), xor:int(ldc:int(1056), ldc:int(1057))), ldc:int(16)))
                
                if (cmpge:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), i2d:double(neg:int(var_5_9B:int)))) {
                    if (cmple:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), i2d:double(var_5_9B:int))) {
                        if (cmpge:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), i2d:double(neg:int(var_5_9B:int)))) {
                            if (cmple:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), i2d:double(var_5_9B:int))) {
                                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\u71f1\u71f1\u5d20\ubefe\u8d98, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f)) {
                                    stack_115_0 = and:int(ldc:int(16385), ldc:int(1025))
                                    goto(Label_0272)
                                }
                            }
                        }
                    }
                }
                
                var_2_AE = and:int(var_2_AE:int, ldc:int(-211423747))
                stack_115_0 = and:int(ldc:int(-22406), ldc:int(20741))
                Label_0272:
                var_2_1CB = and:int(var_2_AE:int, ldc:int(-413162097))
                
                if (cmpeq:boolean(stack_115_0:int, ldc:int(0))) {
                    var_2_AE = and:int(var_2_1CB:int, ldc:int(-1494108819))
                    
                    if (invokeinterface:boolean(Set<E>::remove, getfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object])) {
                        invokevirtual:void(\u873d\uc229\u839e\uf94d\uae87\u6d69::\ud523\uc246\u62da\u12cb\u494c\ub1b9, getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f)
                    }
                }
                else {
                    var_7_13C = getfield:boolean[expected:int](\u7d52\u718f\u3776\u6fb0\ub83f::\u16f6\u3d64\u0c95\u8258\u5f50\u69d9, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102))
                    
                    if (cmpeq:boolean(var_7_13C:int, ldc:int(0))) {
                        var_8_184 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102)), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102)))
                        var_9_192 = invokevirtual:\u8bb0\u4975\ub7dc\u47c2\u3e75(\uc246\u156b\u7ce1\u3d64\u7873::\ud158\u5f50\u3d64\u16f6\ufe34\ub7dc, getfield:\uc246\u156b\u7ce1\u3d64\u7873(\uc246\u183a\u8d90\u4f4a\ub102::\u3776\ud523\u9255\ucfaf\u8413\u759a, this:\uc246\u183a\u8d90\u4f4a\ub102), invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, var_8_184:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))
                        
                        if (cmpne:boolean(var_9_192:\u8bb0\u4975\ub7dc\u47c2\u3e75, aconstnull:\u8bb0\u4975\ub7dc\u47c2\u3e75())) {
                            if (cmpne:boolean(invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uafe7\u8350\u3a62\u6b0d\uae5d\ucef1, var_9_192:\u8bb0\u4975\ub7dc\u47c2\u3e75), aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                                if (cmpgt:boolean(invokestatic:int(\uc246\u156b\u7ce1\u3d64\u7873::\u74b1\u8389\u3711\u6b5f\ucfaf\u6d69, var_8_184:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p0:\u51fa\u6c52\u7330\u7330\u960f, and:int[expected:boolean](ldc:int(1392), ldc:int(-1393))), invokestatic:int(\uc246\u156b\u7ce1\u3d64\u7873::\u92ff\u9033\u7bad\u8aa5\u0800\uae87, getfield:\uc246\u156b\u7ce1\u3d64\u7873(\uc246\u183a\u8d90\u4f4a\ub102::\u3776\ud523\u9255\ucfaf\u8413\u759a, this:\uc246\u183a\u8d90\u4f4a\ub102)))) {
                                    var_2_1CB = and:int(var_2_1CB:int, ldc:int(-916210195))
                                    stack_1E7_0 = and:int(ldc:int(-13053), ldc:int(12900))
                                }
                                else {
                                    stack_1E7_0 = and:int(ldc:int(22065), ldc:int(3))
                                }
                                
                                var_2_1CB = and:int(var_2_1CB:int, ldc:int(-1815892083))
                                var_7_13C = stack_1E7_0:int
                            }
                        }
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_1CB:int, ldc:int(65536)), ldc:int(0))) {
                            var_2_1CB = and:int(var_2_1CB:int, ldc:int(-1677990019))
                            
                            if (cmpne:boolean(var_7_13C:int, ldc:int(0))) {
                                if (invokeinterface:boolean(Set<\u51fa\u6c52\u7330\u7330\u960f>::add, getfield:Set<\u51fa\u6c52\u7330\u7330\u960f>(\uc246\u183a\u8d90\u4f4a\ub102::\u0b8e\u4d85\u98a4\ub7dc\ua3b4\u5654, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f)) {
                                    invokevirtual:void(\u873d\uc229\u839e\uf94d\uae87\u6d69::\u9af2\u8709\uf9c5\ub6ab\u4179\uc2e8, getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, this:\uc246\u183a\u8d90\u4f4a\ub102), p0:\u51fa\u6c52\u7330\u7330\u960f)
                                }
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_2_1CB:int, ldc:int(32768)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_1CB = and:int(var_2_1CB:int, ldc:int(1485495731))
                    }
                    
                    var_2_AE = and:int(var_2_1CB:int, ldc:int(-1887718017))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u5140\ub19c\u873d\u516c\u759a\ud4fe(int p0) {
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
            return:int(invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\ud4fe\uae87\u6c52\u92ee\u4e72\u8640, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, invokestatic:\ube23\uc238\u5140\u4cd9\u8aa5(\uc246\u156b\u7ce1\u3d64\u7873::\u927d\u0800\uc87f\ube23\u7873\u40a9, getfield:\uc246\u156b\u7ce1\u3d64\u7873(\uc246\u183a\u8d90\u4f4a\ub102::\u3776\ud523\u9255\ucfaf\u8413\u759a, this:\uc246\u183a\u8d90\u4f4a\ub102))), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private int \ub171\ua3b4\ud158\u62da\u6cfe\u3a62() {
        var_1_61 : int
        var_3_69 : Collection<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_4_6E : int
        var_5_76 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_1_84 : int
        var_7_D0 : int
        
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
            var_1_61 = and:int(ldc:int(1461221873), ldc:int(1933524291))
            var_3_69 = invokevirtual:Collection<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u97b7\u4f52\u8df4\uc246\u3bc9\uc84e, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, this:\uc246\u183a\u8d90\u4f4a\ub102))
            var_4_6E = getfield:int(\uc246\u183a\u8d90\u4f4a\ub102::\u64ab\u8308\u40a9\ubefe\u4f52\uf9c5, this:\uc246\u183a\u8d90\u4f4a\ub102)
            var_5_76 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(Collection<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, var_3_69:Collection<\u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_84 = and:int(var_1_61:int, ldc:int(2046559870))
                }
                else {
                    var_1_84 = and:int(var_1_61:int, ldc:int(2113518429))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_76:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)) {
                        var_7_D0 = mul:int(invokevirtual:int(\u9255\u0c95\u4cd9\ube23\u760c<T>::\u52d3\u92ee\u527a\u836c\uc246\u67e9, invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_76:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)))), ldc:int(16))
                        
                        if (cmpgt:boolean(var_7_D0:int, var_4_6E:int)) {
                            var_4_6E = var_7_D0:int
                        }
                        
                        var_1_61 = and:int(var_1_84:int, ldc:int(1975221705))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_84:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_84:int, ldc:int(597002889))
            }
            
            return:int(invokespecial:int(\uc246\u183a\u8d90\u4f4a\ub102::\u5140\ub19c\u873d\u516c\u759a\ud4fe, this:\uc246\u183a\u8d90\u4f4a\ub102, var_4_6E:int))
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u7c6b\u8bb0\u6b5f\u183a\ud158(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p0) {
        var_2_61 : int
        var_4_68 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        
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
            var_2_61 = and:int(ldc:int(1627290058), ldc:int(1885329759))
            var_4_68 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p0:List<\u51fa\u6c52\u7330\u7330\u960f>)
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(2121758822))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_68:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uc246\u183a\u8d90\u4f4a\ub102::\u88c5\u7c6b\u8bb0\u6b5f\u183a\ud158, this:\uc246\u183a\u8d90\u4f4a\ub102, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_68:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \ub171\u392e\u8df4\u64f2\u7330\u69d9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102 p0) {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\uc246\u183a\u8d90\u4f4a\ub102::\ubded\u5fe1\u47c2\u6d69\u47c2\u5245, p0:\uc246\u183a\u8d90\u4f4a\ub102))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 \ub18d\u12b2\u69d9\ua6bd\u3dd3\u8308(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102 p0) {
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
            return:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\uc246\u183a\u8d90\u4f4a\ub102::\ud171\u47c2\u5f50\uc246\uc84e\u3504, p0:\uc246\u183a\u8d90\u4f4a\ub102))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 \ua3b4\ubff1\u965f\u47c2\u965f\uff55(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p1) {
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
            return:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(putfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\uc246\u183a\u8d90\u4f4a\ub102::\ud171\u47c2\u5f50\uc246\uc84e\u3504, p0:\uc246\u183a\u8d90\u4f4a\ub102, p1:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2))
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u839e\uf94d\uae87\u6d69 \u51b2\ua562\u52d3\u3e2a\uc29a\uc2e8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc246\u183a\u8d90\u4f4a\ub102 p0) {
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
            return:\u873d\uc229\u839e\uf94d\uae87\u6d69(getfield:\u873d\uc229\u839e\uf94d\uae87\u6d69(\uc246\u183a\u8d90\u4f4a\ub102::\u0c95\u3c25\u3776\u6435\u76bc\u7ce1, p0:\uc246\u183a\u8d90\u4f4a\ub102))
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
    
    public void \u9255\u3bd6\u392e\ubded\u67d0\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_64D = and:int(ldc:int(1431177431), ldc:int(1299065567))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc246\u183a\u8d90\u4f4a\ub102[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-211099761))
            var_5_81 = and:int(ldc:int(-6749), ldc:int(6744))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21860), ldc:int(-21989)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64D:int, ldc:int(1908308159))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(4242), ldc:int(4243)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(18461), ldc:int(801)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64D = and:int(var_3_DA:int, ldc:int(1362079631))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(24585), ldc:int(24584)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1095882788))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-811117873))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1321313774))
                    }
                    else {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-242541859))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0547)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-159776412))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-994658819))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-605344259))
                            var_11_EB = and:int(ldc:int(17281), ldc:int(-17314))
                            goto(Label_1493)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0547:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1156958880))
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1568136359))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1351651322))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1703672738))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-2134988350))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1104811315))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1662701461))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(934641693))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-458835666))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-833666764))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(229721388))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-485761601))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2099866620))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(115064775))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2100175800))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1399095619))
                            goto(Label_0547)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-953156665))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-16127), ldc:int(-16128))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1602947075))
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1031899096))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1814622689))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1801572646))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1017210387))
                        var_11_EB = and:int(ldc:int(-25384), ldc:int(25127))
                    }
                    
                    Label_1098:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-574362839))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2095011177))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-400715649))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-79295683))
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1551680460))
                            goto(Label_0547)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(2132463317))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1098)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-160567566))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0547)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-584289036))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(15981923))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1471035797))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1493)
                    }
                    
                    Label_1358:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1449307576))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-20741237))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-773389262))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1306721465))
                        goto(Label_0547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(-417375577))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1493:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_658 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1504:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1950342843))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1331607456))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(822157666))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-205741580))
                        goto(Label_0547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-576754803))
                        var_17_658 = add:int(var_16_119:int, and:int(ldc:int(225), ldc:int(1801)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64D = and:int(var_3_64D:int, ldc:int(1362017255))
                
                if (cmple:boolean(var_5_81 = var_17_658:int, sub:int(var_6_88:int, and:int(ldc:int(14901), ldc:int(1153))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-1599935134))
            goto(Label_0108)
        }
    }
}
