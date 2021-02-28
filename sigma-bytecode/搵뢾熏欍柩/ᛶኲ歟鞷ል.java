public class \u6435\ub8be\u718f\u6b0d\u67e9.\u16f6\u12b2\u6b5f\u97b7\u120d {
    public void \u16f6\u12b2\u6b5f\u97b7\u120d() {
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
            invokespecial:Object(Object::<init>, this:\u16f6\u12b2\u6b5f\u97b7\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7c6b\u12cb\u67d0\ud12e\u5bc4<T> \ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c(long p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u40a9\u8cae\u8389\uff55\ua61f p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7c6b\u12cb\u67d0\ud12e\u5bc4<T> p2, int p3, java.util.function.LongFunction<C> p4) {
        var_6_61 : int
        var_8_64 : \u7c6b\u12cb\u67d0\ud12e\u5bc4<T>
        var_9_6D : int
        
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
            var_6_61 = and:int(ldc:int(817026660), ldc:int(1880227358))
            var_8_64 = p2:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>
            var_9_6D = and:int(ldc:int(23300), ldc:int(-24461))
            
            loop {
                var_6_61 = and:int(var_6_61:int, ldc:int(928489084))
                
                if (cmpge:boolean(var_9_6D:int, p3:int)) {
                    looporswitchbreak()
                }
                
                var_8_64 = invokeinterface:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, p1:\u40a9\u8cae\u8389\uff55\ua61f, checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p4:LongFunction<C>, add:long(p0:long, i2l:long(var_9_6D:int)))), var_8_64:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>)
                inc:int(var_9_6D, ldc:int(1))
            }
            
            return:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(var_8_64:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>)
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7c6b\u12cb\u67d0\ud12e\u5bc4<T> \u3dd3\uafe7\u74b1\u4daf\u8d98\ufe34(boolean p0, int p1, int p2, java.util.function.LongFunction<C> p3) {
        var_4_460 : int
        var_6_10B : \u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>
        var_7_12F : \u7c6b\u12cb\u67d0\ud12e\u5bc4<R>
        var_6_220 : \u7c6b\u12cb\u67d0\ud12e\u5bc4<R>
        var_8_24B : \u7c6b\u12cb\u67d0\ud12e\u5bc4<T>
        var_9_2D4 : \u7c6b\u12cb\u67d0\ud12e\u5bc4<R>
        var_8_322 : \u7c6b\u12cb\u67d0\ud12e\u5bc4<R>
        var_9_338 : \u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>
        var_11_341 : int
        
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
            var_4_460 = and:int(ldc:int(-1863432553), ldc:int(-1683230737))
            var_6_10B = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u7c6b\ub171\u6ec6\u76bc\u8389[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u7c6b\ub171\u6ec6\u76bc\u8389::\u3e2a\uc9f6\u62da\u0c95\u98a4\u600f), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(70L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(50L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2001L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\u624e\u4ab3\uc31c\ub70c\ucb79\u836c), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2000L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u8258\uc9f6\u6d69\ubcb0\u516c::\ua3b4\u6bb9\u3dd3\u392e\ud158\u183a, getstatic:\u7c6b\u8389\u8bb0\u47c2\ube23[expected:\u8258\uc9f6\u6d69\ubcb0\u516c](\u7c6b\u8389\u8bb0\u47c2\ube23::\u1833\u494c\uc4d2\u4492\u4ab3\u392e), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1L)))))))))))
            var_7_12F = invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(2001L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u8258\uc9f6\u6d69\ubcb0\u516c::\ua3b4\u6bb9\u3dd3\u392e\ud158\u183a, getstatic:\ud523\u4c2b\u92ee\u527a\u6ec6[expected:\u8258\uc9f6\u6d69\ubcb0\u516c](\ud523\u4c2b\u92ee\u527a\u6ec6::\u6ec6\u1833\u76bc\u7006\u385b\uff55), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L)))), ldc:int(6), p3:LongFunction<C>)
            var_6_220 = invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u839e\ud36e\u12cb\u7873\u8308[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u839e\ud36e\u12cb\u7873\u8308::\u52d3\u7ce1\u7043\u3d64\ucfaf\u72f1), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(4L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\ucfaf\u446c\u3c25\u071d\ub171[expected:\u40a9\u8cae\u8389\uff55\ua61f](\ucfaf\u446c\u3c25\u071d\ub171::\u5fe1\u4c04\uf995\u385b\u960f\u4daf), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(5L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(4L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2003L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2002L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u6b5f\ud12e\u7bad\u69d9\ub1b9[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u6b5f\ud12e\u7bad\u69d9\ub1b9::\u3776\u97e6\u5140\uc4d2\ub83f\u99f7), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(3L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u4c04\u61a4\u7049\u72f1\u5bc4[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u4c04\u61a4\u7049\u72f1\u5bc4::\u6b5f\ubcb0\ubff1\u6d99\ub32d\u7ce1), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\uc2e8\u6ec6\u72f1\u6198\u718f[expected:\u40a9\u8cae\u8389\uff55\ua61f](\uc2e8\u6ec6\u72f1\u6198\u718f::\u516c\ubefe\u62da\u3a62\uc7fe\ua068), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(3L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u6cfe\uff55\u72f1\u446c\u446c[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u6cfe\uff55\u72f1\u446c\u446c::\u4bc8\u6d69\u4f52\u5d20\u4bc8\u92ff), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(2L))), var_6_10B:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>)))))))))), and:int(ldc:int(5512), ldc:int(-5513)), p3:LongFunction<C>)
            var_8_24B = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u99f7\u7ce1\u516c\ubb2b\uc2e8[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u99f7\u7ce1\u516c\ubb2b\uc2e8::\u156b\u7e3f\u8389\u183a\u3d64\u9033), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(100L))), invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), var_6_220:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>, and:int(ldc:int(-19520), ldc:int(3110)), p3:LongFunction<C>))
            var_9_2D4 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u527a\u3776\u4cd9\u7af6\u6b0d::\ub70c\u6435\u67e9\ub18d\ub1b9\u4975, getstatic:\u9255\u8bb0\ub18d\uc3e3\ufe34[expected:\u527a\u3776\u4cd9\u7af6\u6b0d](\u9255\u8bb0\ub18d\uc3e3\ufe34::\u74b1\uc246\u69d9\u8cae\u92ff\u3711), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1000L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u446c\u6fb0\ua3b4\u36d3\uc238[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u446c\u6fb0\ua3b4\u36d3\uc238::\u47c2\ub18d\u120d\u960f\u76bc\uc238), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1000L))), invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\ub18d\u7006\ucb79\u7c6b\uc9f6[expected:\u40a9\u8cae\u8389\uff55\ua61f](\ub18d\u7006\ucb79\u7c6b\uc9f6::\ud36e\u64ab\u64ab\u9af2\u6d99\u071d), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1001L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, initobject:\u3504\u836c\uc87f\ud7e8\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3504\u836c\uc87f\ud7e8\uae5d::<init>, p0:boolean), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(200L))), var_6_220:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>)), xor:int(ldc:int(2568), ldc:int(2570)), p3:LongFunction<C>)), invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), var_8_24B:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>, and:int(ldc:int(8854), ldc:int(16426)), p3:LongFunction<C>))
            var_8_322 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u4f52\u600f\u0800\ufe34\u56bd[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u4f52\u600f\u0800\ufe34\u56bd::\u3e2a\u93a2\u4f4a\u0a06\ub7dc\u647c), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1000L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u40a9\ub6ab\u0c95\u0b8e\u56bd[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u40a9\ub6ab\u0c95\u0b8e\u56bd::\ub7dc\u527a\ud523\u3d64\u6ec6\uae5d), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1L))), invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), invokestatic:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u16f6\u12b2\u6b5f\u97b7\u120d::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, ldc:long(1000L), getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), var_8_24B:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>, and:int(ldc:int(8467), ldc:int(16930)), p3:LongFunction<C>), p2:int, p3:LongFunction<C>)))
            var_9_338 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8709\uc2e8\u3d64\u74b1\uf94d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8709\uc2e8\u3d64\u74b1\uf94d::\ud217\u59ec\u3e2a\uc910\ua562\uae5d), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1001L))), var_9_2D4:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>)
            var_11_341 = and:int(ldc:int(-8987), ldc:int(8986))
            
            loop {
                if (cmpne:boolean(and:int(var_4_460:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1068)
                }
                
                if (cmpne:boolean(and:int(var_4_460:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1011)
                }
                
                if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_460 = and:int(var_4_460:int, ldc:int(-1190205713))
                    
                    if (cmplt:boolean(var_11_341:int, p1:int)) {
                        var_9_338 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u3c25\u3e75\u6ec6\uc910\uae5d[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u3c25\u3e75\u6ec6\uc910\uae5d::\uf995\u7d52\u56bd\u8cae\u4c04\ub8be), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, i2l:long(add:int(xor:int(ldc:int(16719), ldc:int(17063)), var_11_341:int)))), var_9_338:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>)
                        
                        if (cmpne:boolean(var_11_341:int, ldc:int(0))) {
                            goto(Label_1011)
                        }
                        
                        var_9_338 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8413\uc87f\u6b5f\u8c8a\u8258[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8413\uc87f\u6b5f\u8c8a\u8258::\u69d9\ubb2b\u6c52\u4975\u7ce1\u7af6), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(3L))), var_9_338:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>)
                        goto(Label_1011)
                    }
                }
                
                Label_0872:
                
                if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1068)
                }
                
                if (cmpne:boolean(and:int(var_4_460:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_460:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_1011:
                
                if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(4)), ldc:int(0))) {
                    var_4_460 = and:int(var_4_460:int, ldc:int(-766136405))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_460:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0872)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_460 = and:int(var_4_460:int, ldc:int(-811740601))
                    
                    if (cmpne:boolean(var_11_341:int, xor:int(ldc:int(99), ldc:int(98)))) {
                        if (cmpne:boolean(p1:int, xor:int(ldc:int(-29692), ldc:int(-29691)))) {
                            goto(Label_1191)
                        }
                    }
                }
                
                Label_1068:
                
                if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_460 = and:int(var_4_460:int, ldc:int(1853572193))
                    goto(Label_1011)
                }
                
                if (cmpeq:boolean(and:int(var_4_460:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0872)
                }
                
                if (cmpne:boolean(and:int(var_4_460:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_460 = and:int(var_4_460:int, ldc:int(-633156280))
                    loopcontinue()
                }
                
                var_4_460 = and:int(var_4_460:int, ldc:int(-356564049))
                var_9_338 = invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u8709\u16f6\u5f50\uc29a\u5f50[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u8709\u16f6\u5f50\uc29a\u5f50::\u6198\u7bad\ucb79\u9937\ubcb0\ubb2b), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<\u7049\u5db4\u8709\ud217\uc2e8>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1000L))), var_9_338:\u7c6b\u12cb\u67d0\ud12e\u5bc4<\u7049\u5db4\u8709\ud217\uc2e8>)
                Label_1191:
                var_4_460 = and:int(var_4_460:int, ldc:int(-1307783426))
                inc:int(var_11_341, ldc:int(1))
            }
            
            return:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u527a\u3776\u4cd9\u7af6\u6b0d::\ub70c\u6435\u67e9\ub18d\ub1b9\u4975, getstatic:\u960f\ub7dc\ub113\u7c6b\ufe34[expected:\u527a\u3776\u4cd9\u7af6\u6b0d](\u960f\ub7dc\ub113\u7c6b\ufe34::\ua068\u5245\u4e72\u4cd9\u74b1\u8753), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(100L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>(\u527a\u3776\u4cd9\u7af6\u6b0d::\ub70c\u6435\u67e9\ub18d\ub1b9\u4975, getstatic:\u0800\u97e6\u8640\u8389\u12cb[expected:\u527a\u3776\u4cd9\u7af6\u6b0d](\u0800\u97e6\u8640\u8389\u12cb::\u6cfe\ud171\u4bc8\ub70c\ua562\u6d99), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(100L))), invokevirtual:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>(\u40a9\u8cae\u8389\uff55\ua61f::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, getstatic:\u4f52\u600f\u0800\ufe34\u56bd[expected:\u40a9\u8cae\u8389\uff55\ua61f](\u4f52\u600f\u0800\ufe34\u56bd::\u3e2a\u93a2\u4f4a\u0a06\ub7dc\u647c), checkcast:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>[expected:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<R>](C extends \ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>.class, invokeinterface:C extends \ubb2b\uc246\u0c95\u6c56\u7330\u4e72<T>(LongFunction<C>::apply, p3:LongFunction<C>, ldc:long(1000L))), var_9_338:\u7c6b\u12cb\u67d0\ud12e\u5bc4<R>), var_8_322:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>), var_7_12F:\u7c6b\u12cb\u67d0\ud12e\u5bc4<T>))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\u12cb\uae87\u8bb0\u40a9\u873d \u836c\uc238\u9937\u6b5f\u3bc9\ud12e(long p0, boolean p1, int p2, int p3) {
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
    
    public static boolean \u51fa\u6bb9\u6b5f\u4ab3\uc84e\u7af6(int p0, int p1) {
        var_2_61 : int
        var_2_A9 : int
        stack_D4_0 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(-1948966576), ldc:int(-740836397))
        
        if (cmpne:boolean(p0:int, p1:int)) {
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_A9 = and:int(var_2_61:int, ldc:int(-1956558108))
                }
                else {
                    var_2_A9 = and:int(var_2_61:int, ldc:int(-1826097737))
                    
                    if (cmpeq:boolean(invokeinterface:int(Int2IntMap::get, getstatic:Int2IntMap(\u16f6\u12b2\u6b5f\u97b7\u120d::\u8413\uae87\u7c6b\u983f\ua61f\u8389), p0:int), invokeinterface:int(Int2IntMap::get, getstatic:Int2IntMap(\u16f6\u12b2\u6b5f\u97b7\u120d::\u8413\uae87\u7c6b\u983f\ua61f\u8389), p1:int))) {
                        stack_D4_0 = xor:int(ldc:int(3216), ldc:int(3217))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_A9:int, ldc:int(32)), ldc:int(0))) {
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(998211522))
                    stack_D4_0 = and:int(ldc:int(19028), ldc:int(-23158))
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_A9:int, ldc:int(-997481005))
            }
            
            return:boolean(stack_D4_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(-15868), ldc:int(-15867)))
    }
    
    private static void \u946b\u8389\u3d4b\u99f7\u8753\u3a62(it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uceb8\ub70c\uafe7\ucfaf\u946b p1, int p2) {
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
            invokevirtual:int(Int2IntOpenHashMap::put, p0:Int2IntOpenHashMap, p2:int, invokevirtual:int(Enum<E>::ordinal, p1:\uceb8\ub70c\uafe7\ucfaf\u946b[expected:Enum<\uceb8\ub70c\uafe7\ucfaf\u946b>]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ucb79\u4975\u74b1\u52d3\uae87\u3bd6(int p0) {
        stack_103_0 : int [generated]
        
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
            
            if (cmpne:boolean(p0:int, ldc:int(44))) {
                if (cmpne:boolean(p0:int, ldc:int(45))) {
                    if (cmpne:boolean(p0:int, ldc:int(0))) {
                        if (cmpne:boolean(p0:int, ldc:int(46))) {
                            if (cmpne:boolean(p0:int, ldc:int(10))) {
                                if (cmpne:boolean(p0:int, ldc:int(47))) {
                                    if (cmpne:boolean(p0:int, ldc:int(48))) {
                                        if (cmpne:boolean(p0:int, ldc:int(24))) {
                                            if (cmpne:boolean(p0:int, ldc:int(49))) {
                                                if (cmpne:boolean(p0:int, ldc:int(50))) {
                                                    stack_103_0 = and:int[expected:boolean](ldc:int(2736), ldc:int(-2738))
                                                    return:boolean(stack_103_0:boolean)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            stack_103_0 = xor:int[expected:boolean](ldc:int(5760), ldc:int(5761))
            return:boolean(stack_103_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ub19c\u34df\u718f\u4975\u4f4a\u960f(int p0) {
        stack_C2_0 : int [generated]
        
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
            
            if (cmpne:boolean(p0:int, ldc:int(44))) {
                if (cmpne:boolean(p0:int, ldc:int(45))) {
                    if (cmpne:boolean(p0:int, ldc:int(0))) {
                        if (cmpne:boolean(p0:int, ldc:int(46))) {
                            if (cmpne:boolean(p0:int, ldc:int(10))) {
                                stack_C2_0 = and:int[expected:boolean](ldc:int(-21548), ldc:int(17451))
                                return:boolean(stack_C2_0:boolean)
                            }
                        }
                    }
                }
            }
            
            stack_C2_0 = xor:int[expected:boolean](ldc:int(3089), ldc:int(3088))
            return:boolean(stack_C2_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\u983f\ua61f\u72f1\u16f6\ud158 lambda$\ub6ab\u64f2\u3a62\uc229\u7e3f\uae5d$1(long p0, long p1) {
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
            return:\u983f\ua61f\u72f1\u16f6\ud158(initobject:\u983f\ua61f\u72f1\u16f6\ud158(\u983f\ua61f\u72f1\u16f6\ud158::<init>, ldc:int(25), p0:long, p1:long))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3776\u839e\u494c\u92ee\ud523\uc29a$0(it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap p0) {
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
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ud7e8\u6198\u965f\ub1b9\u4daf\uceb8), ldc:int(16))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ud7e8\u6198\u965f\ub1b9\u4daf\uceb8), ldc:int(26))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ud171\u97e6\uc31c\u718f\u4f4a\u69d9), xor:int(ldc:int(16576), ldc:int(16578)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ud171\u97e6\uc31c\u718f\u4f4a\u69d9), ldc:int(17))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ud171\u97e6\uc31c\u718f\u4f4a\u69d9), and:int(ldc:int(3202), ldc:int(131)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u1833\u7c6b\u0a06\u839e\u7c6b\u8d98), xor:int(ldc:int(4215), ldc:int(4340)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u1833\u7c6b\u0a06\u839e\u7c6b\u8d98), xor:int(ldc:int(-32677), ldc:int(-32519)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u1833\u7c6b\u0a06\u839e\u7c6b\u8d98), ldc:int(20))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u1833\u7c6b\u0a06\u839e\u7c6b\u8d98), and:int(ldc:int(263), ldc:int(563)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u1833\u7c6b\u0a06\u839e\u7c6b\u8d98), ldc:int(34))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), ldc:int(27))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), ldc:int(28))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), ldc:int(29))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), xor:int(ldc:int(620), ldc:int(753)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), xor:int(ldc:int(-23492), ldc:int(-23368)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), xor:int(ldc:int(129), ldc:int(133)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), and:int(ldc:int(16571), ldc:int(5343)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), xor:int(ldc:int(18645), ldc:int(18505)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub8be\u97b7\u0a06\ud51e\ua61f\u6c56), ldc:int(18))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u47c2\u8bb0\u7043\u36d3\ud36e\uc3e3), and:int(ldc:int(8620), ldc:int(18124)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u47c2\u8bb0\u7043\u36d3\ud36e\uc3e3), ldc:int(13))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u47c2\u8bb0\u7043\u36d3\ud36e\uc3e3), ldc:int(12))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), and:int(ldc:int(6329), ldc:int(16808)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), xor:int(ldc:int(19481), ldc:int(19632)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), ldc:int(21))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), ldc:int(23))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), ldc:int(22))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), and:int(ldc:int(1173), ldc:int(16533)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u5db4\u12cb\ubb2b\ub102\u4975\ucb79), xor:int(ldc:int(1355), ldc:int(1500)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u600f\u8413\u5d20\ubefe\ua6bd\uc910), ldc:int(37))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u600f\u8413\u5d20\ubefe\ua6bd\uc910), and:int(ldc:int(685), ldc:int(11685)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u600f\u8413\u5d20\ubefe\ua6bd\uc910), xor:int(ldc:int(10546), ldc:int(10645)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u600f\u8413\u5d20\ubefe\ua6bd\uc910), and:int(ldc:int(21670), ldc:int(2222)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u839e\u59ec\u6d69\u8753\ub102\ub171), ldc:int(39))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u839e\u59ec\u6d69\u8753\ub102\ub171), ldc:int(38))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u927d\uafe7\u6c52\ub83f\u59ec\u59ec), ldc:int(14))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u927d\uafe7\u6c52\ub83f\u59ec\u59ec), ldc:int(15))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u416d\u12cb\ub32d\u071d\u3e2a\uc31c), ldc:int(25))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(46))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(49))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(50))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(48))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(24))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(47))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(10))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(45))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), and:int(ldc:int(18850), ldc:int(-19883)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uff55\u071d\u12b2\ud171\u385b\ud4fe), ldc:int(44))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub7dc\u3504\u3d4b\u8350\u34df\u4179), xor:int(ldc:int(10756), ldc:int(10757)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub7dc\u3504\u3d4b\u8350\u34df\u4179), xor:int(ldc:int(621), ldc:int(748)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub6ab\u6d69\uc9f6\u71f1\u12b2\u0b8e), ldc:int(11))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\ub6ab\u6d69\uc9f6\u71f1\u12b2\u0b8e), ldc:int(7))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u7e3f\ufcaf\u2dcc\u6435\u7043\u927d), ldc:int(35))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u7e3f\ufcaf\u2dcc\u6435\u7043\u927d), ldc:int(36))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u7e3f\ufcaf\u2dcc\u6435\u7043\u927d), and:int(ldc:int(943), ldc:int(1187)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u7e3f\ufcaf\u2dcc\u6435\u7043\u927d), and:int(ldc:int(9190), ldc:int(5292)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u8d98\u4f4a\ud158\u5245\u1187\u6c56), ldc:int(6))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\u8d98\u4f4a\ud158\u5245\u1187\u6c56), and:int(ldc:int(18102), ldc:int(135)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), xor:int(ldc:int(4307), ldc:int(4211)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), xor:int(ldc:int(4135), ldc:int(4230)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), ldc:int(32))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), ldc:int(33))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), ldc:int(30))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), ldc:int(31))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), xor:int(ldc:int(3706), ldc:int(3812)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), xor:int(ldc:int(-32511), ldc:int(-32508)))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), ldc:int(19))
            invokestatic:void(\u16f6\u12b2\u6b5f\u97b7\u120d::\u946b\u8389\u3d4b\u99f7\u8753\u3a62, p0:Int2IntOpenHashMap, getstatic:\uceb8\ub70c\uafe7\ucfaf\u946b(\uceb8\ub70c\uafe7\ucfaf\u946b::\uf995\ud36e\u6ec6\ua3b4\u3bd6\uc246), and:int(ldc:int(4261), ldc:int(2693)))
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
    
    public void \u3bd6\u12cb\u8258\u59ec\u3d64\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_699 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A4 : int
        
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
        var_3_699 = and:int(ldc:int(-207827332), ldc:int(-149625633))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u16f6\u12b2\u6b5f\u97b7\u120d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
            var_3_699 = and:int(var_3_699:int, ldc:int(-207881378))
            var_5_81 = and:int(ldc:int(-26700), ldc:int(26690))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11589), ldc:int(-11590)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_699:int, ldc:int(-136580258))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(8481), ldc:int(2571)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(20483), ldc:int(11805)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_699 = and:int(var_3_DA:int, ldc:int(-73926306))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1345), ldc:int(25217)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-581726864))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1333586305))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(835929528))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1801827534))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-146814084))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1563236868))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(2066261122))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1638584135))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1187525333))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(497093099))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(928670099))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-81855201))
                        var_11_EB = and:int(ldc:int(-28549), ldc:int(28036))
                        goto(Label_1558)
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-526767969))
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(777761451))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-680715672))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1772914138))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-136390148))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0715:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-185509463))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(2039083640))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1259516833))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1199211078))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(661821985))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-67446243))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0854:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1872187357))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(91952374))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(286174035))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-143196195))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(1575), ldc:int(17))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-245017438))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1192303734))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1571541640))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1072501385))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-831083950))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-2033334153))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1558186678))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-145427425))
                        var_11_EB = and:int(ldc:int(-3063), ldc:int(2514))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-874922421))
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1691530142))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(516815085))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1676319371))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-69547873))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1279:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-678179319))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-2002790433))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1966238790))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-201797153))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1558)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1404:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1474344446))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-548589999))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1266302998))
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(360755062))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-408680661))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1321809748))
                        loopcontinue()
                    }
                    
                    var_3_699 = and:int(var_3_699:int, ldc:int(-4400868))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1558:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A4 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1569:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1225615547))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-164696453))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1632121022))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-740848128))
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-207758596))
                        var_17_6A4 = add:int(var_16_119:int, xor:int(ldc:int(8193), ldc:int(8192)))
                        looporswitchbreak()
                    }
                    
                    var_3_699 = and:int(var_3_699:int, ldc:int(-342050450))
                }
                
                var_3_699 = and:int(var_3_699:int, ldc:int(-144775810))
                
                if (cmple:boolean(var_5_81 = var_17_6A4:int, sub:int(var_6_88:int, and:int(ldc:int(1029), ldc:int(24705))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_699 = and:int(var_3_699:int, ldc:int(-636283470))
            goto(Label_0108)
        }
    }
}
