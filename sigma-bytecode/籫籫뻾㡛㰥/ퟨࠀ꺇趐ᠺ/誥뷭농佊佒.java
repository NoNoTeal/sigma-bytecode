public interface \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 {
    \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc7fe\u4975\u3bd6\u5bc4\u8cae\u839e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, boolean p2);
    
    void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1);
    
    void \u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0);
    
    \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f \u16f6\u3c25\ud171\ub32d\ub6ab\ub171() {
        var_1_5F : int
        var_3_66 : \uc29a\u6198\u6bb9\u4492\u965f[]
        var_4_71 : int
        var_5_8C : \uc29a\u6198\u6bb9\u4492\u965f
        
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
        var_1_5F = and:int(ldc:int(-456735824), ldc:int(-840393900))
        var_3_66 = invokeinterface:\uc29a\u6198\u6bb9\u4492\u965f[](\u8aa5\ubded\ub18d\u4f4a\u4f52::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u8aa5\ubded\ub18d\u4f4a\u4f52)
        var_4_71 = sub:int(arraylength:int(var_3_66:\uc29a\u6198\u6bb9\u4492\u965f[]), and:int(ldc:int(14341), ldc:int(145)))
        
        loop {
            var_1_5F = and:int(var_1_5F:int, ldc:int(1860669373))
            
            if (cmplt:boolean(var_4_71:int, ldc:int(0))) {
                return:\uc29a\u6198\u6bb9\u4492\u965f(aconstnull:\uc29a\u6198\u6bb9\u4492\u965f())
            }
            
            var_5_8C = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(var_3_66:\uc29a\u6198\u6bb9\u4492\u965f[], var_4_71:int)
            
            if (logicalnot:boolean(invokestatic:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, var_5_8C:\uc29a\u6198\u6bb9\u4492\u965f))) {
                return:\uc29a\u6198\u6bb9\u4492\u965f(var_5_8C:\uc29a\u6198\u6bb9\u4492\u965f)
            }
            
            inc:int(var_4_71, ldc:int(-1))
        }
    }
    
    int \u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4() {
        var_1_5F : int
        var_3_66 : \uc29a\u6198\u6bb9\u4492\u965f
        stack_87_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1134970461), ldc:int(-478150821))
            var_3_66 = invokeinterface:\uc29a\u6198\u6bb9\u4492\u965f(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u16f6\u3c25\ud171\ub32d\ub6ab\ub171, this:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            
            if (cmpne:boolean(var_3_66:\uc29a\u6198\u6bb9\u4492\u965f, aconstnull:\uc29a\u6198\u6bb9\u4492\u965f())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1285137253))
                stack_87_0 = invokevirtual:int(\uc29a\u6198\u6bb9\u4492\u965f::\u3e2a\u983f\u8350\u98a4\u6fb0\ub70c, var_3_66:\uc29a\u6198\u6bb9\u4492\u965f)
            }
            else {
                stack_87_0 = and:int(ldc:int(-14230), ldc:int(13829))
            }
            
            return:int(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u839e\u67d0\u71f1\u4c2b\u3dd3\u156b();
    
    \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[] \uc84e\u446c\u4f4a\uc910\u9a18\u416d();
    
    java.util.Collection<java.util.Map.Entry<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52>> \uc7fe\u1187\u7c6b\u759a\uc9f6\u3d64();
    
    void \u4f4a\u8d90\u8753\u59ec\u56bd\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, long[] p1);
    
    \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52 \ub70c\uc84e\u9937\u759a\u385b\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0);
    
    int \u8258\u7af6\ubb2b\u6198\u6fb0\u9a18(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, int p1, int p2);
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \u4f52\u4daf\uc910\ud217\uc3e3\u8d98();
    
    void \u3e75\ud171\u7bad\u3776\u36d3\ub83f(long p0);
    
    java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1();
    
    void \u8c8a\u69d9\u600f\uc87f\u40a9\ub6ab(java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> p0);
    
    boolean \u8d90\u647c\u47c2\ud523\ub18d\ufcaf(int p0, int p1) {
        var_3_5F : int
        var_3_8E : int
        var_5_90 : int
        
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
            var_3_5F = and:int(ldc:int(1833061896), ldc:int(1810232646))
            
            if (cmplt:boolean(p0:int, ldc:int(0))) {
                p0 = and:int(ldc:int(2930), ldc:int(-2931))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1234011343))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2135453601))
                    
                    if (cmpge:boolean(p1:int, and:int(ldc:int(17667), ldc:int(12612)))) {
                        p1 = and:int(ldc:int(8447), ldc:int(4607))
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_8E = and:int(var_3_5F:int, ldc:int(1868724114))
            var_5_90 = p0:int
            
            while (cmple:boolean(var_5_90:int, p1:int)) {
                if (logicalnot:boolean(invokestatic:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, loadelement:\uc29a\u6198\u6bb9\u4492\u965f(invokeinterface:\uc29a\u6198\u6bb9\u4492\u965f[](\u8aa5\ubded\ub18d\u4f4a\u4f52::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u8aa5\ubded\ub18d\u4f4a\u4f52), shr:int(var_5_90:int, and:int(ldc:int(9245), ldc:int(4100))))))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-24417), ldc:int(7968)))
                }
                
                var_3_8E = and:int(var_3_8E:int, ldc:int(1803343332))
                inc:int(var_5_90, ldc:int(16))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(1041), ldc:int(16389)))
        }
        
        goto(Label_0006)
    }
    
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 \u8c8a\u4179\u416d\u64f2\u2dcc\u3776();
    
    void \u3711\u839e\u3a62\ubff1\ub102\u7e3f(boolean p0);
    
    boolean \u446c\uc7fe\u5d20\ube23\u4bc8\ud51e();
    
    \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u8753\ud523\u6cfe\u0c95\u946b\u385b();
    
    void \ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0);
    
    void \u8350\u071d\ua61f\u5140\u2dcc\u3e2a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            invokeinterface:void(Logger::warn, invokestatic:Logger(LogManager::getLogger), ldc:String("Trying to mark a block for PostProcessing @ {}, but this operation is not supported."), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    it.unimi.dsi.fastutil.shorts.ShortList[] \u12b2\u8df4\u156b\uc9f6\u51fa\u97e6();
    
    void \u6435\uc87f\u6d69\u12cb\u7ce1\u3d64(short p0, int p1) {
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
            invokeinterface:boolean(ShortList::add, invokestatic:ShortList(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uf9c5\u4975\u5bc4\u8308\uc2bd\ub7dc, invokeinterface:ShortList[](\u8aa5\ubded\ub18d\u4f4a\u4f52::\u12b2\u8df4\u156b\uc9f6\u51fa\u97e6, this:\u8aa5\ubded\ub18d\u4f4a\u4f52), p1:int), p0:short)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokeinterface:void(Logger::warn, invokestatic:Logger(LogManager::getLogger), ldc:String("Trying to set a BlockEntity, but this operation is not supported."))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0);
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubefe\u4e72\u6d99\uf995\u759a\uc84e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0);
    
    java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u6c56\u5db4\u9937\u3bc9\u647c\ufcaf();
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u34df\u983f\u647c\ufcaf\ub102\u3e2a();
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56();
    
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa \u183a\u7af6\u36d3\uc9f6\u6bb9\u5245();
    
    void \uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975(long p0);
    
    long \uc229\ubb2b\u62da\uc29a\u8753\u9255();
    
    it.unimi.dsi.fastutil.shorts.ShortList \uf9c5\u4975\u5bc4\u8308\uc2bd\ub7dc(it.unimi.dsi.fastutil.shorts.ShortList[] p0, int p1) {
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
            
            if (cmpeq:boolean(loadelement:ShortList(p0:ShortList[], p1:int), aconstnull:ShortList())) {
                storeelement:ShortList(p0:ShortList[], p1:int, initobject:ShortArrayList[expected:ShortList](ShortArrayList::<init>))
            }
            
            return:ShortList(loadelement:ShortList(p0:ShortList[], p1:int))
        }
        
        goto(Label_0006)
    }
    
    boolean \ub83f\u51fa\uc2bd\u88c5\ua6bd\uafe7();
    
    void \u62da\u5fe1\uc229\u74b1\ufe34\u5bc4(boolean p0);
}
