public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a {
    public void \uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(long p0) {
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
            invokespecial:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::<init>, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long, xor:int[expected:boolean](ldc:int(68), ldc:int(69)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(long p0, boolean p1) {
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\uc7fe\u93a2\u67d0\u97b7\u47c2\ud523))
        putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(8L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long)
            
            if (cmple:boolean(p0:long, i2l:long(invokestatic:int(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u3504\u8709\u36d3\u5245\uff55\u392e)))) {
                putfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, newarray:long[](long.class, l2i:int(p0:long)))
            }
            else {
                putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, invokevirtual:long(Unsafe::allocateMemory, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))))
                
                if (p1:boolean) {
                    invokevirtual:void(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\uc2bd\u6bb9\u385b\u8df4\u6b5f\uc910, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:long)
                }
                
                invokestatic:Cleaner(Cleaner::create, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:Object], initobject:\uf9c5\u392e\u8d90\u4975\uc3e3\u9033[expected:Runnable](\uf9c5\u392e\u8d90\u4975\uc3e3\u9033::<init>, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
                invokestatic:void(\u416d\ub19c\ube23\uc246\u4c04\ub70c::\u7330\u5654\uc29a\ub102\ub70c\u6cfe, mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(20077), ldc:int(-24176)))))))
    }
    
    public void \uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(long p0, long p1) {
        expr_94 : long[] [generated]
        
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u759a\ua61f\ufe34\u88c5\ub83f\u2dcc))
        putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(8L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long)
            putfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, xor:int[expected:boolean](ldc:int(-32376), ldc:int(-32375)))
            expr_94 = newarray:long[](long.class, xor:int(ldc:int(-26592), ldc:int(-26591)))
            storeelement:long(expr_94:long[], and:int(ldc:int(19184), ldc:int(-19443)), p1:long)
            putfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, expr_94:long[])
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(-3596), ldc:int(3595)))))))
    }
    
    public void \uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(long[] p0) {
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\uc7fe\u93a2\u67d0\u97b7\u47c2\ud523))
            putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(8L))
            putfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, i2l:long(arraylength:int(p0:long[])))
            putfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a clone() {
        var_3_7E : \uae5d\u6b5f\u7330\ua068\uae5d\u3e2a
        
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
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            var_3_7E = initobject:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::<init>, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int[expected:boolean](ldc:int(31272), ldc:int(-32313)))
            invokestatic:void(\ube23\u67d0\u3504\u0a06\u718f\uc910::\ub83f\u67e9\u8709\u76bc\ub6ab\u836c, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(0L), var_3_7E:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(0L), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))
            return:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(var_3_7E:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)
        }
        
        return:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(initobject:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::<init>, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), invokevirtual:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u1187\u59ec\u72f1\u64ab\u8413\u67d0, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, ldc:long(0L))))
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        stack_AA_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(530768025), ldc:int(-1949658132))
        
        if (logicalnot:boolean(invokespecial:boolean(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::equals, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:Object))) {
            return:boolean(and:int[expected:boolean](ldc:int(-26814), ldc:int(26813)))
        }
        
        if (cmpne:boolean(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, checkcast:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a.class, p0:Object[expected:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a])))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(395305469))
            stack_AA_0 = and:int(ldc:int(25641), ldc:int(-26154))
        }
        else {
            stack_AA_0 = and:int(ldc:int(8289), ldc:int(1025))
        }
        
        return:boolean(stack_AA_0:int)
    }
    
    public int hashCode() {
        var_1_5F : int
        stack_8D_0 : int [generated]
        stack_8D_1 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1727871795), ldc:int(619691901))
            stack_8D_0 = mul:int(ldc:int(29), invokespecial:int(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::hashCode, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]))
            
            if (cmpeq:boolean(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), aconstnull:long[]())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1534739688))
                stack_8D_1 = and:int(ldc:int(-14506), ldc:int(6305))
            }
            else {
                stack_8D_1 = invokevirtual:int(Object::hashCode, getfield:long[][expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))
            }
            
            return:int(add:int(stack_8D_0:int, stack_8D_1:int))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Long \u0800\u8413\u3bc9\u3776\u392e\u4492(long p0) {
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
            return:Long(invokestatic:Long(Long::valueOf, invokevirtual:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u1187\u59ec\u72f1\u64ab\u8413\u67d0, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long)))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Long \ua068\u12cb\ubf56\u34df\u3776\u385b(long p0) {
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
            return:Long(invokestatic:Long(Long::valueOf, invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)))))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \ub7dc\u9255\uf94d\u8df4\u3e75\u7af6(long p0) {
        var_3_10E : int
        stack_1E5_0 : int [generated]
        stack_18D_0 : int [generated]
        stack_1F6_0 : int [generated]
        
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
            var_3_10E = and:int(ldc:int(1823903466), ldc:int(-277829132))
            
            if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (cmpeq:boolean(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long))), ldc:long(0L))) {
                    goto(Label_0307)
                }
                
                stack_1E5_0 = stack_18D_0 = and(ldc(417), ldc(4103))
                goto(Label_0377)
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2097152)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(633358781))
                goto(Label_0419)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(1)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(-916223321))
                goto(Label_0307)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(1083584413))
                goto(Label_0230)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(2048)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(1052311110))
                
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    if (cmpeq:boolean(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-15218), ldc:int(13153))), ldc:long(0L))) {
                        goto(Label_0419)
                    }
                    
                    stack_1E5_0 = stack_18D_0 = and(ldc(4545), ldc(3075))
                    goto(Label_0473)
                }
            }
            
            Label_0169:
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(-295276996))
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0307)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_10E = and:int(var_3_10E:int, ldc:int(28206746))
                    goto(Label_0105)
                }
                
                var_3_10E = and:int(var_3_10E:int, ldc:int(-1088106936))
                
                if (cmpne:boolean(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long)), ldc:long(0L))) {
                    stack_1F6_0 = and:int[expected:boolean](ldc:int(26079), ldc:int(513))
                    return:boolean(stack_1F6_0:boolean)
                }
            }
            
            Label_0230:
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_10E = and:int(var_3_10E:int, ldc:int(-1084428380))
                    goto(Label_0105)
                }
                
                var_3_10E = and:int(var_3_10E:int, ldc:int(1064233122))
                stack_1F6_0 = and:int[expected:boolean](ldc:int(-22722), ldc:int(22721))
                return:boolean(stack_1F6_0:boolean[expected:int])
            }
            
            Label_0307:
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(1)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(473285715))
                goto(Label_0419)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(524288)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(-78507101))
                goto(Label_0230)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_10E = and:int(var_3_10E:int, ldc:int(-1355374893))
            stack_1E5_0 = stack_18D_0 = and(ldc(7616), ldc(-15817))
            Label_0377:
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(134217728)), ldc:int(0))) {
                var_3_10E = and:int(var_3_10E:int, ldc:int(532016153))
                goto(Label_0473)
            }
            
            return:boolean(stack_18D_0:boolean)
            Label_0419:
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0307)
            }
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpeq:boolean(and:int(var_3_10E:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_10E = and:int(var_3_10E:int, ldc:int(-5054981))
            stack_1E5_0 = stack_18D_0 = and(ldc(916), ldc(-917))
            Label_0473:
            
            if (cmpne:boolean(and:int(var_3_10E:int, ldc:int(134217728)), ldc:int(0))) {
                return:boolean(stack_1E5_0:int)
            }
            
            goto(Label_0377)
        }
        
        goto(Label_0006)
    }
    
    public final byte \u600f\u8709\u760c\u64ab\u97e6\u5245(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:byte(i2b:byte(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long))))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:byte(i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long)))))
        }
        
        return:byte(i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(29288), ldc:int(-29693))))))
    }
    
    public final short \u56bd\ub113\u5654\u965f\u7006\u5140(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:short(i2s:short(l2i:int(and:long(ldc:long(255L), invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)))))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:short(i2s:short(l2i:int(and:long(ldc:long(255L), loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long))))))
        }
        
        return:short(i2s:short(l2i:int(and:long(ldc:long(255L), loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-6826), ldc:int(6313)))))))
    }
    
    public final short \ub32d\ud12e\uf9c5\ub83f\u16f6\u527a(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:short(i2s:short(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long))))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:short(i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long)))))
        }
        
        return:short(i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(28970), ldc:int(-28975))))))
    }
    
    public final int \u99f7\u120d\u34df\u446c\ud4fe\u6cfe(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:int(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:int(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long))))
        }
        
        return:int(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-12727), ldc:int(8630)))))
    }
    
    public final long \u1187\u59ec\u72f1\u64ab\u8413\u67d0(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:long(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:long(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long)))
        }
        
        return:long(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(16562), ldc:int(-20915))))
    }
    
    public final float \u5bc4\ucb79\ubf56\u74b1\u6ec6\u16f6(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:float(l2f:float(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:float(l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long))))
        }
        
        return:float(l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-11991), ldc:int(11988)))))
    }
    
    public final double \ube23\u97b7\u4cd9\u8aa5\u7bad\ud158(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            return:double(l2d:double(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
            return:double(l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long))))
        }
        
        return:double(l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-8853), ldc:int(8852)))))
    }
    
    public final long[] \u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52() {
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
            return:long[](getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded() {
        var_1_61 : int
        var_1_260 : int
        var_3_7A : boolean[]
        stack_1CB_0 : int [generated]
        var_4_CE : int
        stack_27C_0 : boolean[] [generated]
        stack_27C_1 : int [generated]
        stack_27C_2 : int [generated]
        var_1_1E3 : int
        var_7_1D4 : int
        var_5_151 : long
        stack_17E_0 : boolean[] [generated]
        stack_17E_1 : int [generated]
        stack_17E_2 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(432960649), ldc:int(-571575844))
        
        if (cmpgt:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            return:boolean[](aconstnull:boolean[]())
        }
        
        var_1_260 = and:int(var_1_61:int, ldc:int(-1679855251))
        var_3_7A = newarray:boolean[](boolean.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
        
        if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_260:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_260 = and:int(var_1_260:int, ldc:int(-1908613619))
                    goto(Label_0410)
                }
                
                if (cmpeq:boolean(and:int(var_1_260:int, ldc:int(4)), ldc:int(0))) {
                    var_1_260 = and:int(var_1_260:int, ldc:int(-1110510531))
                    
                    if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                        if (cmpeq:boolean(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-523), ldc:int(522))), ldc:long(0L))) {
                            goto(Label_0410)
                        }
                        
                        stack_1CB_0 = and:int(ldc:int(17291), ldc:int(85))
                        looporswitchbreak()
                    }
                }
                
                Label_0169:
                
                if (cmpeq:boolean(and:int(var_1_260:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_260 = and:int(var_1_260:int, ldc:int(1425483490))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_260:int, ldc:int(8)), ldc:int(0))) {
                        var_1_260 = and:int(var_1_260:int, ldc:int(466574572))
                        var_4_CE = and:int(ldc:int(-24763), ldc:int(24762))
                        
                        while (cmplt:boolean(i2l:long(var_4_CE:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            stack_27C_0 = var_3_7A:boolean[]
                            stack_27C_1 = var_4_CE:int
                            
                            if (cmpeq:boolean(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_CE:int), ldc:long(0L))) {
                                var_1_260 = and:int(var_1_260:int, ldc:int(-1141933425))
                                stack_27C_2 = and:int[expected:boolean](ldc:int(-17983), ldc:int(17454))
                            }
                            else {
                                stack_27C_2 = and:int[expected:boolean](ldc:int(16471), ldc:int(8193))
                            }
                            
                            var_1_260 = and:int(var_1_260:int, ldc:int(1607456312))
                            storeelement:boolean(stack_27C_0:boolean[], stack_27C_1:int, stack_27C_2:boolean)
                            inc:int(var_4_CE, ldc:int(1))
                        }
                        
                        goto(Label_0560)
                    }
                    
                    loopcontinue()
                }
                
                Label_0410:
                
                if (cmpne:boolean(and:int(var_1_260:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpne:boolean(and:int(var_1_260:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_260 = and:int(var_1_260:int, ldc:int(-1174473399))
                    stack_1CB_0 = and:int(ldc:int(10543), ldc:int(-10544))
                    looporswitchbreak()
                }
            }
            
            var_1_1E3 = and:int(var_1_260:int, ldc:int(-605097730))
            var_4_CE = stack_1CB_0:int
            var_7_1D4 = and:int(ldc:int(-15517), ldc:int(15492))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_1E3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1E3 = and:int(var_1_1E3:int, ldc:int(-1056838628))
                }
                else {
                    var_1_1E3 = and:int(var_1_1E3:int, ldc:int(466583164))
                    
                    if (cmplt:boolean(i2l:long(var_7_1D4:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                        storeelement:boolean(var_3_7A:boolean[], var_7_1D4:int, var_4_CE:boolean)
                        inc:int(var_7_1D4, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_1E3:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_1E3 = and:int(var_1_1E3:int, ldc:int(-1290115820))
            }
            
            var_1_260 = and:int(var_1_1E3:int, ldc:int(534672989))
            goto(Label_0560)
        }
        
        var_4_CE = and:int(ldc:int(3096), ldc:int(-3097))
        Label_0230:
        
        while (cmpeq:boolean(and:int(var_1_260:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_260:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0271)
            }
            
            var_1_260 = and:int(var_1_260:int, ldc:int(973034377))
            
            if (cmpge:boolean(i2l:long(var_4_CE:boolean[expected:int]), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0271)
            }
            
            var_5_151 = invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_CE:boolean[expected:int]))))
            stack_17E_0 = var_3_7A:boolean[]
            stack_17E_1 = var_4_CE:int
            
            if (cmpeq:boolean(var_5_151:long, ldc:long(0L))) {
                var_1_260 = and:int(var_1_260:int, ldc:int(-1644233222))
                stack_17E_2 = and:int[expected:boolean](ldc:int(-31121), ldc:int(22928))
            }
            else {
                stack_17E_2 = xor:int[expected:boolean](ldc:int(212), ldc:int(213))
            }
            
            var_1_260 = and:int(var_1_260:int, ldc:int(-1680869605))
            storeelement:boolean(stack_17E_0:boolean[], stack_17E_1:int, stack_17E_2:boolean)
            inc:int(var_4_CE, ldc:int(1))
        }
        
        var_1_260 = and:int(var_1_260:int, ldc:int(-1381773392))
        goto(Label_0560)
        Label_0271:
        
        if (cmpne:boolean(and:int(var_1_260:int, ldc:int(512)), ldc:int(0))) {
            var_1_260 = and:int(var_1_260:int, ldc:int(-2083734904))
        }
        else {
            if (cmpne:boolean(and:int(var_1_260:int, ldc:int(512)), ldc:int(0))) {
                var_1_260 = and:int(var_1_260:int, ldc:int(-1912644761))
                goto(Label_0230)
            }
            
            var_1_260 = and:int(var_1_260:int, ldc:int(435125613))
        }
        
        Label_0560:
        
        if (cmpne:boolean(and:int(var_1_260:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_1_260:int, ldc:int(512)), ldc:int(0))) {
            return:boolean[](var_3_7A:boolean[])
        }
        
        goto(Label_0230)
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded(boolean[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_252 : int
        var_10_218 : long
        var_12_259 : boolean[]
        var_8_55B : int
        var_13_2AE : int
        var_14_2E1 : long
        stack_4B6_0 : boolean[] [generated]
        stack_4B6_1 : int [generated]
        stack_4B6_2 : int [generated]
        var_16_38E : long
        stack_57A_0 : boolean[] [generated]
        stack_3CB_0 : boolean[] [generated]
        stack_57A_1 : int [generated]
        stack_3CB_1 : int [generated]
        stack_3CB_2 : int [generated]
        var_16_531 : long
        stack_57A_2 : int [generated]
        
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
        var_8_63 = and:int(ldc:int(-81092687), ldc:int(-12913771))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1958397462))
            goto(Label_0457)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1633040437))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(17), ldc:int(25377)))))
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0457)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1721051082))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-641839067))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1610835221))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0398)
                    }
                }
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0457)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-757307561))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(426284877))
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(1076), ldc:int(1078)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0398:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-648391172))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0279)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-645924971))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(678), ldc:int(677)))))
            }
        }
        
        Label_0457:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2047056025))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1873767702))
            goto(Label_0107)
        }
        
        var_8_252 = and:int(var_8_63:int, ldc:int(-679486731))
        var_10_218 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_218:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_252:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_252 = and:int(var_8_252:int, ldc:int(-1782669423))
                    
                    if (cmpne:boolean(p0:boolean[], aconstnull:boolean[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:boolean[])), var_10_218:long)) {
                            var_12_259 = p0:boolean[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_252:int, ldc:int(16384)), ldc:int(0))) {
                    var_8_252 = and:int(var_8_252:int, ldc:int(-147213405))
                    var_12_259 = newarray:boolean[](boolean.class, l2i:int(var_10_218:long))
                    looporswitchbreak()
                }
                
                var_8_252 = and:int(var_8_252:int, ldc:int(-1470410497))
            }
            
            var_8_55B = and:int(var_8_252:int, ldc:int(-672482589))
            var_13_2AE = and:int(ldc:int(20645), ldc:int(-21934))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(524288)), ldc:int(0))) {
                        var_8_55B = and:int(var_8_55B:int, ldc:int(-1117252635))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        var_14_2E1 = p1:long
                        goto(Label_0989)
                    }
                } while (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2147483647)), ldc:int(0)))
                
                var_8_55B = and:int(var_8_55B:int, ldc:int(-1615947889))
                var_14_2E1 = p1:long
                goto(Label_1221)
            }
            
            var_14_2E1 = p1:long
            goto(Label_0749)
            Label_0989:
            
            while (cmpne:boolean(and:int(var_8_55B:int, ldc:int(512)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_55B = and:int(var_8_55B:int, ldc:int(-2031651160))
                    goto(Label_1073)
                }
                
                if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_55B = and:int(var_8_55B:int, ldc:int(660984013))
                    goto(Label_0821)
                }
                
                if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0749)
                }
                
                var_8_55B = and:int(var_8_55B:int, ldc:int(-1075077163))
                
                if (cmpge:boolean(var_14_2E1:long, p2:long)) {
                    goto(Label_1073)
                }
                
                stack_4B6_0 = var_12_259:boolean[]
                stack_4B6_1 = postincrement:int(1, var_13_2AE:int)
                
                if (cmpeq:boolean(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-1584), ldc:int(1579))), ldc:long(0L))) {
                    var_8_55B = and:int(var_8_55B:int, ldc:int(-571682129))
                    stack_4B6_2 = and:int[expected:boolean](ldc:int(20328), ldc:int(-28539))
                }
                else {
                    stack_4B6_2 = and:int[expected:boolean](ldc:int(21), ldc:int(2377))
                }
                
                var_8_55B = and:int(var_8_55B:int, ldc:int(-1859366211))
                storeelement:boolean(stack_4B6_0:boolean[], stack_4B6_1:int, stack_4B6_2:boolean)
                var_14_2E1 = add:long(var_14_2E1:long, p3:long)
            }
            
            var_8_55B = and:int(var_8_55B:int, ldc:int(-1701185002))
            goto(Label_1229)
            Label_0749:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-87044921))
                goto(Label_1229)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1073)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0989)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(94426680))
            }
            else {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-1851172925))
                
                if (cmplt:boolean(var_14_2E1:long, p2:long)) {
                    var_16_38E = invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_2E1:long)))
                    stack_57A_0 = stack_3CB_0 = var_12_259
                    stack_57A_1 = stack_3CB_1 = var_13_2AE
                    inc:int(var_13_2AE, ldc:int(1))
                    
                    if (cmpeq:boolean(var_16_38E:long, ldc:long(0L))) {
                        goto(Label_0926)
                    }
                    
                    stack_3CB_2 = xor:int(ldc:int(-22512), ldc:int(-22511))
                    goto(Label_0963)
                }
            }
            
            Label_0821:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(524288)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-826682641))
                goto(Label_1229)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1073)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(4096)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(986761238))
                goto(Label_0989)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(1)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-583108721))
                goto(Label_1229)
            }
            
            goto(Label_0749)
            Label_0926:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_1345)
            }
            
            var_8_55B = and:int(var_8_55B:int, ldc:int(-613443841))
            stack_3CB_2 = and:int(ldc:int(25750), ldc:int(-25823))
            Label_0963:
            var_8_55B = and:int(var_8_55B:int, ldc:int(-570730779))
            storeelement:boolean(stack_3CB_0:boolean[], stack_3CB_1:int, stack_3CB_2:boolean)
            var_14_2E1 = add:long(var_14_2E1:long, p3:long)
            goto(Label_0749)
            Label_1073:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_1229)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(4096)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-719591862))
                goto(Label_0989)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0821)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(1249300110))
                goto(Label_0749)
            }
            
            var_8_55B = and:int(var_8_55B:int, ldc:int(-771768447))
            goto(Label_1229)
            Label_1221:
            
            if (cmplt:boolean(var_14_2E1:long, p2:long)) {
                var_16_531 = loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_2E1:long))
                stack_57A_0 = stack_3CB_0 = var_12_259
                stack_57A_1 = stack_3CB_1 = var_13_2AE
                inc:int(var_13_2AE, ldc:int(1))
                
                if (cmpeq:boolean(var_16_531:long, ldc:long(0L))) {
                    goto(Label_1345)
                }
                
                stack_57A_2 = xor:int[expected:boolean](ldc:int(75), ldc:int(74))
                goto(Label_1394)
            }
            
            Label_1229:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(1216041399))
                goto(Label_1073)
            }
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(524288)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-2139548473))
                goto(Label_0989)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(262144)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(-520953489))
                goto(Label_0821)
            }
            
            if (cmpne:boolean(and:int(var_8_55B:int, ldc:int(67108864)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(2015688495))
                goto(Label_0749)
            }
            
            return:boolean[](var_12_259:boolean[])
            Label_1345:
            
            if (cmpeq:boolean(and:int(var_8_55B:int, ldc:int(512)), ldc:int(0))) {
                var_8_55B = and:int(var_8_55B:int, ldc:int(474460053))
                goto(Label_0926)
            }
            
            var_8_55B = and:int(var_8_55B:int, ldc:int(-1788135803))
            stack_57A_2 = and:int[expected:boolean](ldc:int(22342), ldc:int(-30576))
            Label_1394:
            var_8_55B = and:int(var_8_55B:int, ldc:int(-638787841))
            storeelement:boolean(stack_57A_0:boolean[], stack_57A_1:int, stack_57A_2:boolean)
            var_14_2E1 = add:long(var_14_2E1:long, p3:long)
            goto(Label_1221)
        }
        
        return:boolean[](aconstnull:boolean[]())
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e() {
        var_1_61 : int
        var_1_14D : int
        var_3_7A : byte[]
        var_4_136 : byte
        var_5_13F : int
        var_4_B7 : int
        var_4_CD : int
        
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
        var_1_61 = and:int(ldc:int(-788380873), ldc:int(1937721077))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_14D = and:int(var_1_61:int, ldc:int(1442008055))
            var_3_7A = newarray:byte[](byte.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(64)), ldc:int(0))) {
                        var_1_14D = and:int(var_1_14D:int, ldc:int(1832906495))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_4_136 = i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(17313), ldc:int(-17314)))))
                            var_5_13F = and:int(ldc:int(10628), ldc:int(-10629))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_14D = and:int(var_1_14D:int, ldc:int(-1381406308))
                                }
                                else {
                                    var_1_14D = and:int(var_1_14D:int, ldc:int(-1346971009))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_13F:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                        storeelement:byte(var_3_7A:byte[], var_5_13F:int, var_4_136:byte)
                                        inc:int(var_5_13F, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(65536)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(512)), ldc:int(0))) {
                        var_4_B7 = and:int(ldc:int(10311), ldc:int(-11592))
                        
                        while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:byte(var_3_7A:byte[], var_4_B7:int, i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_B7:int))))
                            inc:int(var_4_B7, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_14D = and:int(var_1_14D:int, ldc:int(-848405906))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(-10091), ldc:int(10050))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_14D = and:int(var_1_14D:int, ldc:int(-1018421590))
                    }
                    else {
                        var_1_14D = and:int(var_1_14D:int, ldc:int(-680824897))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:byte(var_3_7A:byte[], var_4_CD:int, i2b:byte(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_CD:int)))))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(32)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:byte[](var_3_7A:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e(byte[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_26D : int
        var_10_233 : long
        var_12_274 : byte[]
        var_8_334 : int
        var_13_2C9 : int
        var_14_313 : long
        var_14_309 : long
        
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
        var_8_63 = and:int(ldc:int(499292034), ldc:int(-34909218))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0207)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0486)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0403)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1381925242))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(6147), ldc:int(265)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-1926172544))
        Label_0207:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0486)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0403)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2088865122))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(1070800398))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0403)
                    }
                }
            }
        }
        
        Label_0269:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(2008720159))
            goto(Label_0486)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-732950674))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-976929256))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(33), ldc:int(35)))))
        }
        
        Label_0403:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1672181293))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(290072244))
                goto(Label_0269)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(142092869))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1614457949))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(6659), ldc:int(267)))))
            }
        }
        
        Label_0486:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0403)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-314239138))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(782633093))
            goto(Label_0207)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_26D = and:int(var_8_63:int, ldc:int(2109946590))
        var_10_233 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_233:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_26D:int, ldc:int(512)), ldc:int(0))) {
                    var_8_26D = and:int(var_8_26D:int, ldc:int(-35774805))
                    
                    if (cmpne:boolean(p0:byte[], aconstnull:byte[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:byte[])), var_10_233:long)) {
                            var_12_274 = p0:byte[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_26D:int, ldc:int(33554432)), ldc:int(0))) {
                    var_8_26D = and:int(var_8_26D:int, ldc:int(-573139206))
                    var_12_274 = newarray:byte[](byte.class, l2i:int(var_10_233:long))
                    looporswitchbreak()
                }
                
                var_8_26D = and:int(var_8_26D:int, ldc:int(-1124286654))
            }
            
            var_8_334 = and:int(var_8_26D:int, ldc:int(-33770781))
            var_13_2C9 = and:int(ldc:int(-27786), ldc:int(27784))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_334:int, ldc:int(512)), ldc:int(0))) {
                        var_8_334 = and:int(var_8_334:int, ldc:int(-34432282))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_14_313 = p1:long
                            goto(Label_0938)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_334:int, ldc:int(4)), ldc:int(0))) {
                        var_14_309 = p1:long
                        
                        while (cmplt:boolean(var_14_309:long, p2:long)) {
                            storeelement:byte(var_12_274:byte[], postincrement:int(1, var_13_2C9:int), i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_309:long)))))
                            var_14_309 = add:long(var_14_309:long, p3:long)
                        }
                        
                        return:byte[](var_12_274:byte[])
                    }
                    
                    var_8_334 = and:int(var_8_334:int, ldc:int(581230265))
                }
            }
            else {
                var_14_313 = p1:long
            }
            
            Label_0789:
            
            while (cmpeq:boolean(and:int(var_8_334:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_334:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0938)
                }
                
                if (cmpeq:boolean(and:int(var_8_334:int, ldc:int(4194304)), ldc:int(0))) {
                    var_8_334 = and:int(var_8_334:int, ldc:int(1850684388))
                    goto(Label_0841)
                }
                
                var_8_334 = and:int(var_8_334:int, ldc:int(534410875))
                
                if (cmpge:boolean(var_14_313:long, p2:long)) {
                    goto(Label_0841)
                }
                
                storeelement:byte(var_12_274:byte[], postincrement:int(1, var_13_2C9:int), i2b:byte(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_313:long))))))
                var_14_313 = add:long(var_14_313:long, p3:long)
            }
            
            goto(Label_1002)
            Label_0938:
            
            while (cmpeq:boolean(and:int(var_8_334:int, ldc:int(4)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_334:int, ldc:int(4)), ldc:int(0))) {
                    var_8_334 = and:int(var_8_334:int, ldc:int(1236597612))
                    goto(Label_0841)
                }
                
                if (cmpeq:boolean(and:int(var_8_334:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0789)
                }
                
                var_8_334 = and:int(var_8_334:int, ldc:int(-1645200425))
                
                if (cmpge:boolean(var_14_313:long, p2:long)) {
                    goto(Label_1002)
                }
                
                storeelement:byte(var_12_274:byte[], postincrement:int(1, var_13_2C9:int), i2b:byte(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-8264), ldc:int(8263))))))
                var_14_313 = add:long(var_14_313:long, p3:long)
            }
            
            var_8_334 = and:int(var_8_334:int, ldc:int(-2062656648))
            goto(Label_1002)
            Label_0841:
            
            if (cmpeq:boolean(and:int(var_8_334:int, ldc:int(4)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_334:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0938)
                }
                
                if (cmpne:boolean(and:int(var_8_334:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_8_334 = and:int(var_8_334:int, ldc:int(851524390))
                    goto(Label_0789)
                }
                
                return:byte[](var_12_274:byte[])
            }
            
            Label_1002:
            
            if (cmpne:boolean(and:int(var_8_334:int, ldc:int(64)), ldc:int(0))) {
                var_8_334 = and:int(var_8_334:int, ldc:int(-1974956704))
                goto(Label_0938)
            }
            
            if (cmpeq:boolean(and:int(var_8_334:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0841)
            }
            
            if (cmpne:boolean(and:int(var_8_334:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0789)
            }
            
            return:byte[](var_12_274:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe() {
        var_1_61 : int
        var_1_145 : int
        var_3_7A : short[]
        var_4_12D : short
        var_5_136 : int
        var_4_B6 : int
        var_4_CC : int
        
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
        var_1_61 = and:int(ldc:int(-1075732200), ldc:int(-1074027366))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_145 = and:int(var_1_61:int, ldc:int(-8145316))
            var_3_7A = newarray:short[](short.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_145:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_145 = and:int(var_1_145:int, ldc:int(-4248161))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_4_12D = i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-14725), ldc:int(10628)))))
                            var_5_136 = and:int(ldc:int(17931), ldc:int(-17932))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_145:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_1_145 = and:int(var_1_145:int, ldc:int(-7494087))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_136:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                        storeelement:short(var_3_7A:short[], var_5_136:int, var_4_12D:short)
                                        inc:int(var_5_136, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_1_145:int, ldc:int(2147483647)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_145 = and:int(var_1_145:int, ldc:int(-1346682761))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_145:int, ldc:int(8)), ldc:int(0))) {
                        var_4_B6 = and:int(ldc:int(21765), ldc:int(-29968))
                        
                        while (cmplt:boolean(i2l:long(var_4_B6:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:short(var_3_7A:short[], var_4_B6:int, i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_B6:int))))
                            inc:int(var_4_B6, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_145 = and:int(var_1_145:int, ldc:int(1959812219))
                }
            }
            else {
                var_4_CC = and:int(ldc:int(-18842), ldc:int(18833))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_145 = and:int(var_1_145:int, ldc:int(-1078202596))
                        
                        if (cmplt:boolean(i2l:long(var_4_CC:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:short(var_3_7A:short[], var_4_CC:int, i2s:short(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_CC:int)))))))
                            inc:int(var_4_CC, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(512)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:short[](var_3_7A:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe(short[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_20A : int
        var_10_219 : long
        var_8_25E : int
        var_12_265 : short[]
        var_8_329 : int
        var_13_2BA : int
        var_14_30F : long
        var_14_305 : long
        
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
        var_8_63 = and:int(ldc:int(-1620146399), ldc:int(-9712217))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0207)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(940249329))
            goto(Label_0470)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(10305), ldc:int(10304)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(1055368212))
        Label_0207:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0470)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1121058793))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1879347918))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0398)
                    }
                }
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-147836084))
            goto(Label_0470)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-552960206))
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(18457233))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(19330), ldc:int(42)))))
        }
        
        Label_0398:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2117829348))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0267)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1599339532))
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1619079756))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(4116), ldc:int(4119)))))
            }
        }
        
        Label_0470:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0207)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-23541746))
            goto(Label_0107)
        }
        
        var_8_20A = and:int(var_8_63:int, ldc:int(-268698316))
        var_10_219 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_219:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_20A:int, ldc:int(1024)), ldc:int(0))) {
                    var_8_25E = and:int(var_8_20A:int, ldc:int(-91670758))
                }
                else {
                    var_8_25E = and:int(var_8_20A:int, ldc:int(-806435457))
                    
                    if (cmpne:boolean(p0:short[], aconstnull:short[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:short[])), var_10_219:long)) {
                            var_12_265 = p0:short[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_25E:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_25E = and:int(var_8_25E:int, ldc:int(-387155))
                    var_12_265 = newarray:short[](short.class, l2i:int(var_10_219:long))
                    looporswitchbreak()
                }
                
                var_8_20A = and:int(var_8_25E:int, ldc:int(898609516))
            }
            
            var_8_329 = and:int(var_8_25E:int, ldc:int(-1074883270))
            var_13_2BA = and:int(ldc:int(8299), ldc:int(-11756))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(33554432)), ldc:int(0))) {
                        var_8_329 = and:int(var_8_329:int, ldc:int(807337744))
                    }
                    else {
                        var_8_329 = and:int(var_8_329:int, ldc:int(-1610918472))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_14_30F = p1:long
                            goto(Label_0936)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(8388608)), ldc:int(0))) {
                        var_14_305 = p1:long
                        
                        while (cmplt:boolean(var_14_305:long, p2:long)) {
                            storeelement:short(var_12_265:short[], postincrement:int(1, var_13_2BA:int), i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_305:long)))))
                            var_14_305 = add:long(var_14_305:long, p3:long)
                        }
                        
                        return:short[](var_12_265:short[])
                    }
                    
                    var_8_329 = and:int(var_8_329:int, ldc:int(-835771438))
                }
            }
            else {
                var_14_30F = p1:long
            }
            
            Label_0785:
            
            while (cmpne:boolean(and:int(var_8_329:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_329:int, ldc:int(4)), ldc:int(0))) {
                    var_8_329 = and:int(var_8_329:int, ldc:int(-430263019))
                    goto(Label_0936)
                }
                
                if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0839)
                }
                
                var_8_329 = and:int(var_8_329:int, ldc:int(-806718166))
                
                if (cmpge:boolean(var_14_30F:long, p2:long)) {
                    goto(Label_0839)
                }
                
                storeelement:short(var_12_265:short[], postincrement:int(1, var_13_2BA:int), i2s:short(l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_30F:long))))))
                var_14_30F = add:long(var_14_30F:long, p3:long)
            }
            
            goto(Label_1001)
            Label_0936:
            
            while (cmpeq:boolean(and:int(var_8_329:int, ldc:int(4)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0839)
                }
                
                if (cmpne:boolean(and:int(var_8_329:int, ldc:int(128)), ldc:int(0))) {
                    var_8_329 = and:int(var_8_329:int, ldc:int(-912293774))
                    goto(Label_0785)
                }
                
                var_8_329 = and:int(var_8_329:int, ldc:int(-1074109151))
                
                if (cmpge:boolean(var_14_30F:long, p2:long)) {
                    goto(Label_1001)
                }
                
                storeelement:short(var_12_265:short[], postincrement:int(1, var_13_2BA:int), i2s:short(l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(16539), ldc:int(-20636))))))
                var_14_30F = add:long(var_14_30F:long, p3:long)
            }
            
            var_8_329 = and:int(var_8_329:int, ldc:int(1136063969))
            goto(Label_1001)
            Label_0839:
            
            if (cmpne:boolean(and:int(var_8_329:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_329:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0936)
                }
                
                if (cmpne:boolean(and:int(var_8_329:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_329 = and:int(var_8_329:int, ldc:int(1482246747))
                    goto(Label_0785)
                }
                
                return:short[](var_12_265:short[])
            }
            
            Label_1001:
            
            if (cmpne:boolean(and:int(var_8_329:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0936)
            }
            
            if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(131072)), ldc:int(0))) {
                var_8_329 = and:int(var_8_329:int, ldc:int(948624809))
                goto(Label_0839)
            }
            
            if (cmpeq:boolean(and:int(var_8_329:int, ldc:int(4194304)), ldc:int(0))) {
                var_8_329 = and:int(var_8_329:int, ldc:int(-897755381))
                goto(Label_0785)
            }
            
            return:short[](var_12_265:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1() {
        var_1_61 : int
        var_1_E4 : int
        var_3_7A : int[]
        var_1_154 : int
        var_4_13C : int
        var_5_145 : int
        var_4_BF : int
        var_4_D5 : int
        
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
        var_1_61 = and:int(ldc:int(1379989437), ldc:int(1735681852))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_E4 = and:int(var_1_61:int, ldc:int(-241012934))
            var_3_7A = newarray:int[](int.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_154 = and:int(var_1_E4:int, ldc:int(1299598613))
                    }
                    else {
                        var_1_154 = and:int(var_1_E4:int, ldc:int(-447942660))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_4_13C = l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-9207), ldc:int(9142))))
                            var_5_145 = and:int(ldc:int(11795), ldc:int(-12116))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_154:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_154 = and:int(var_1_154:int, ldc:int(494039239))
                                }
                                else {
                                    var_1_154 = and:int(var_1_154:int, ldc:int(2093313018))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_145:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                        storeelement:int(var_3_7A:int[], var_5_145:int, var_4_13C:int)
                                        inc:int(var_5_145, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_1_154:int, ldc:int(16384)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_154 = and:int(var_1_154:int, ldc:int(2101598247))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_154:int, ldc:int(64)), ldc:int(0))) {
                        var_4_BF = and:int(ldc:int(23877), ldc:int(-23894))
                        
                        while (cmplt:boolean(i2l:long(var_4_BF:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:int(var_3_7A:int[], var_4_BF:int, l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_BF:int)))
                            inc:int(var_4_BF, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_154:int, ldc:int(170644333))
                }
            }
            else {
                var_4_D5 = and:int(ldc:int(-18985), ldc:int(18984))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(8)), ldc:int(0))) {
                        var_1_E4 = and:int(var_1_E4:int, ldc:int(1310913149))
                        
                        if (cmplt:boolean(i2l:long(var_4_D5:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:int(var_3_7A:int[], var_4_D5:int, l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_D5:int))))))
                            inc:int(var_4_D5, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E4:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_E4:int, ldc:int(2091475241))
                }
            }
            
            return:int[](var_3_7A:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1(int[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_24E : int
        var_10_21F : long
        var_12_255 : int[]
        var_8_30E : int
        var_13_2AA : int
        var_14_2F4 : long
        var_14_2EA : long
        
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
        var_8_63 = and:int(ldc:int(-512200803), ldc:int(-946196705))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0208)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0487)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1456991937))
            goto(Label_0414)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(893734961))
            goto(Label_0292)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(2049), ldc:int(1035)))))
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(831168191))
            goto(Label_0487)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(2069467184))
            goto(Label_0414)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(741605405))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-608199916))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0414)
                    }
                }
            }
        }
        
        Label_0292:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0487)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-810744255))
                goto(Label_0208)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(982778128))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(6679), ldc:int(10)))))
        }
        
        Label_0414:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1616170530))
                goto(Label_0292)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0208)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1122212581))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-771875530))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(4161), ldc:int(4162)))))
            }
        }
        
        Label_0487:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0414)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0292)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_24E = and:int(var_8_63:int, ldc:int(-77795458))
        var_10_21F = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_21F:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_24E:int, ldc:int(64)), ldc:int(0))) {
                    var_8_24E = and:int(var_8_24E:int, ldc:int(-275079906))
                    
                    if (cmpne:boolean(p0:int[], aconstnull:int[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:int[])), var_10_21F:long)) {
                            var_12_255 = p0:int[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_24E:int, ldc:int(4)), ldc:int(0))) {
                    var_8_24E = and:int(var_8_24E:int, ldc:int(-742909124))
                    var_12_255 = newarray:int[](int.class, l2i:int(var_10_21F:long))
                    looporswitchbreak()
                }
            }
            
            var_8_30E = and:int(var_8_24E:int, ldc:int(-445109348))
            var_13_2AA = and:int(ldc:int(-1305), ldc:int(1304))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(4)), ldc:int(0))) {
                        var_8_30E = and:int(var_8_30E:int, ldc:int(447747905))
                    }
                    else {
                        var_8_30E = and:int(var_8_30E:int, ldc:int(-33903747))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        var_14_2F4 = p1:long
                        goto(Label_0898)
                    }
                } while (cmpne:boolean(and:int(var_8_30E:int, ldc:int(262144)), ldc:int(0)))
                
                var_14_2EA = p1:long
                
                while (cmplt:boolean(var_14_2EA:long, p2:long)) {
                    storeelement:int(var_12_255:int[], postincrement:int(1, var_13_2AA:int), l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_2EA:long))))
                    var_14_2EA = add:long(var_14_2EA:long, p3:long)
                }
                
                return:int[](var_12_255:int[])
            }
            
            var_14_2F4 = p1:long
            Label_0758:
            
            while (cmpne:boolean(and:int(var_8_30E:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(16)), ldc:int(0))) {
                    var_8_30E = and:int(var_8_30E:int, ldc:int(518771456))
                    goto(Label_0898)
                }
                
                if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0812)
                }
                
                var_8_30E = and:int(var_8_30E:int, ldc:int(-67199107))
                
                if (cmpge:boolean(var_14_2F4:long, p2:long)) {
                    goto(Label_0812)
                }
                
                storeelement:int(var_12_255:int[], postincrement:int(1, var_13_2AA:int), l2i:int(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_2F4:long)))))
                var_14_2F4 = add:long(var_14_2F4:long, p3:long)
            }
            
            goto(Label_0974)
            Label_0898:
            
            while (cmpne:boolean(and:int(var_8_30E:int, ldc:int(1073741824)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(4)), ldc:int(0))) {
                    var_8_30E = and:int(var_8_30E:int, ldc:int(1666160875))
                    goto(Label_0812)
                }
                
                if (cmpne:boolean(and:int(var_8_30E:int, ldc:int(2)), ldc:int(0))) {
                    var_8_30E = and:int(var_8_30E:int, ldc:int(-1434509617))
                    goto(Label_0758)
                }
                
                var_8_30E = and:int(var_8_30E:int, ldc:int(-883264746))
                
                if (cmpge:boolean(var_14_2F4:long, p2:long)) {
                    goto(Label_0974)
                }
                
                storeelement:int(var_12_255:int[], postincrement:int(1, var_13_2AA:int), l2i:int(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(12342), ldc:int(-12855)))))
                var_14_2F4 = add:long(var_14_2F4:long, p3:long)
            }
            
            var_8_30E = and:int(var_8_30E:int, ldc:int(-673394636))
            goto(Label_0974)
            Label_0812:
            
            if (cmpne:boolean(and:int(var_8_30E:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_30E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0898)
                }
                
                if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(268435456)), ldc:int(0))) {
                    return:int[](var_12_255:int[])
                }
                
                goto(Label_0758)
            }
            
            Label_0974:
            
            if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(4)), ldc:int(0))) {
                var_8_30E = and:int(var_8_30E:int, ldc:int(-272883616))
                goto(Label_0898)
            }
            
            if (cmpne:boolean(and:int(var_8_30E:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0812)
            }
            
            if (cmpeq:boolean(and:int(var_8_30E:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0758)
            }
            
            return:int[](var_12_255:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f() {
        var_1_61 : int
        var_1_14B : int
        var_3_7A : long[]
        var_5_13B : long
        var_7_144 : int
        var_4_DE : int
        
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
        var_1_61 = and:int(ldc:int(-1081134630), ldc:int(2072982015))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_14B = and:int(var_1_61:int, ldc:int(-70256154))
            var_3_7A = newarray:long[](long.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_14B = and:int(var_1_14B:int, ldc:int(1002419664))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_5_13B = loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-3431), ldc:int(2406)))
                            var_7_144 = and:int(ldc:int(-27695), ldc:int(27662))
                            
                            loop {
                                var_1_14B = and:int(var_1_14B:int, ldc:int(-1076905045))
                                
                                if (cmpge:boolean(i2l:long(var_7_144:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                    looporswitchbreak()
                                }
                                
                                storeelement:long(var_3_7A:long[], var_7_144:int, var_5_13B:long)
                                inc:int(var_7_144, ldc:int(1))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(262144)), ldc:int(0))) {
                        invokestatic:void(System::arraycopy, getfield:long[][expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-23041), ldc:int(23040)), var_3_7A:long[][expected:Object], and:int(ldc:int(-23524), ldc:int(17315)), l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
                        looporswitchbreak()
                    }
                    
                    var_1_14B = and:int(var_1_14B:int, ldc:int(-430595758))
                }
            }
            else {
                var_4_DE = and:int(ldc:int(3362), ldc:int(-3363))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_14B = and:int(var_1_14B:int, ldc:int(2080341383))
                        
                        if (cmplt:boolean(i2l:long(var_4_DE:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:long(var_3_7A:long[], var_4_DE:int, invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_DE:int)))))
                            inc:int(var_4_DE, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(4096)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:long[](var_3_7A:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f(long[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_268 : int
        var_10_239 : long
        var_12_26F : long[]
        var_8_327 : int
        var_13_2C4 : int
        var_14_30E : long
        var_14_304 : long
        
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
        var_8_63 = and:int(ldc:int(1062213143), ldc:int(-539441513))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0195)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0481)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-621355881))
            goto(Label_0266)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(261), ldc:int(553)))))
        }
        
        Label_0195:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1311237068))
            goto(Label_0481)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-822259693))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-162829))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0398)
                    }
                }
            }
        }
        
        Label_0266:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-497518603))
            goto(Label_0481)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-582241589))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(567036970))
                goto(Label_0195)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(-24536), ldc:int(-24534)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0398:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-278597153))
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(372909174))
                goto(Label_0195)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1650257421))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-277306829))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(20935), ldc:int(11)))))
            }
        }
        
        Label_0481:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1755575583))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(264498377))
            goto(Label_0266)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0195)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(20573893))
            goto(Label_0107)
        }
        
        var_8_268 = and:int(var_8_63:int, ldc:int(-539427233))
        var_10_239 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_239:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_268:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_268 = and:int(var_8_268:int, ldc:int(391762451))
                    
                    if (cmpne:boolean(p0:long[], aconstnull:long[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:long[])), var_10_239:long)) {
                            var_12_26F = p0:long[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_268:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_268 = and:int(var_8_268:int, ldc:int(1339402935))
                    var_12_26F = newarray:long[](long.class, l2i:int(var_10_239:long))
                    looporswitchbreak()
                }
            }
            
            var_8_327 = and:int(var_8_268:int, ldc:int(1602129787))
            var_13_2C4 = and:int(ldc:int(-20134), ldc:int(3717))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(262144)), ldc:int(0))) {
                        var_8_327 = and:int(var_8_327:int, ldc:int(1207852799))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_14_30E = p1:long
                            goto(Label_0944)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_327:int, ldc:int(2)), ldc:int(0))) {
                        var_14_304 = p1:long
                        
                        while (cmplt:boolean(var_14_304:long, p2:long)) {
                            storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_304:long)))
                            var_14_304 = add:long(var_14_304:long, p3:long)
                        }
                        
                        return:long[](var_12_26F:long[])
                    }
                    
                    var_8_327 = and:int(var_8_327:int, ldc:int(170261068))
                }
            }
            else {
                var_14_30E = p1:long
            }
            
            Label_0784:
            
            while (cmpne:boolean(and:int(var_8_327:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_327 = and:int(var_8_327:int, ldc:int(-435089313))
                    goto(Label_0944)
                }
                
                if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0837)
                }
                
                var_8_327 = and:int(var_8_327:int, ldc:int(-942634113))
                
                if (cmpge:boolean(var_14_30E:long, p2:long)) {
                    goto(Label_0837)
                }
                
                storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_30E:long))))
                var_14_30E = add:long(var_14_30E:long, p3:long)
            }
            
            goto(Label_0998)
            Label_0944:
            
            while (cmpeq:boolean(and:int(var_8_327:int, ldc:int(8)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_327:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0837)
                }
                
                if (cmpne:boolean(and:int(var_8_327:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0784)
                }
                
                var_8_327 = and:int(var_8_327:int, ldc:int(794772119))
                
                if (cmpge:boolean(var_14_30E:long, p2:long)) {
                    goto(Label_0998)
                }
                
                storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-10850), ldc:int(10849))))
                var_14_30E = add:long(var_14_30E:long, p3:long)
            }
            
            var_8_327 = and:int(var_8_327:int, ldc:int(-717728506))
            goto(Label_0998)
            Label_0837:
            
            if (cmpne:boolean(and:int(var_8_327:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_327 = and:int(var_8_327:int, ldc:int(2094489709))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0944)
                }
                
                if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(512)), ldc:int(0))) {
                    var_8_327 = and:int(var_8_327:int, ldc:int(1577545442))
                    goto(Label_0784)
                }
                
                return:long[](var_12_26F:long[])
            }
            
            Label_0998:
            
            if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0944)
            }
            
            if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0837)
            }
            
            if (cmpeq:boolean(and:int(var_8_327:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0784)
            }
            
            return:long[](var_12_26F:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a() {
        var_1_61 : int
        var_1_14B : int
        var_3_7A : float[]
        var_4_133 : float
        var_5_13C : int
        var_4_AD : int
        var_4_C3 : int
        
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
        var_1_61 = and:int(ldc:int(-175202460), ldc:int(1302216672))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_14B = and:int(var_1_61:int, ldc:int(1699622901))
            var_3_7A = newarray:float[](float.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_14B = and:int(var_1_14B:int, ldc:int(-549701001))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        var_4_133 = l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(11521), ldc:int(-11544))))
                        var_5_13C = and:int(ldc:int(-5629), ldc:int(5460))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_14B:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_14B = and:int(var_1_14B:int, ldc:int(976782483))
                            }
                            else {
                                var_1_14B = and:int(var_1_14B:int, ldc:int(-314598556))
                                
                                if (cmplt:boolean(i2l:long(var_5_13C:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                    storeelement:float(var_3_7A:float[], var_5_13C:int, var_4_133:float)
                                    inc:int(var_5_13C, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_14B:int, ldc:int(1048576)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:float[](var_3_7A:float[])
                    }
                } while (cmpeq:boolean(and:int(var_1_14B:int, ldc:int(512)), ldc:int(0)))
                
                var_4_AD = and:int(ldc:int(-28248), ldc:int(28230))
                
                while (cmplt:boolean(i2l:long(var_4_AD:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    storeelement:float(var_3_7A:float[], var_4_AD:int, l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_AD:int)))
                    inc:int(var_4_AD, ldc:int(1))
                }
            }
            else {
                var_4_C3 = and:int(ldc:int(16738), ldc:int(-16739))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_14B = and:int(var_1_14B:int, ldc:int(-613160602))
                    }
                    else {
                        var_1_14B = and:int(var_1_14B:int, ldc:int(-138530981))
                        
                        if (cmplt:boolean(i2l:long(var_4_C3:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:float(var_3_7A:float[], var_4_C3:int, l2f:float(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_C3:int))))))
                            inc:int(var_4_C3, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_14B:int, ldc:int(1073741824)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_14B = and:int(var_1_14B:int, ldc:int(-720098016))
                }
            }
            
            return:float[](var_3_7A:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a(float[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_24A : int
        var_10_21C : long
        var_12_251 : float[]
        var_8_3B3 : int
        var_13_2A6 : int
        var_14_2F0 : long
        var_14_2E6 : long
        
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
        var_8_63 = and:int(ldc:int(588872526), ldc:int(1920562011))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0207)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0472)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1723044635))
            goto(Label_0400)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(16449), ldc:int(2051)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-251745957))
        Label_0207:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0472)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0400)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-167289577))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(337084383))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0400)
                    }
                }
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(971480564))
            goto(Label_0472)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1683595251))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-940900669))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(8197), ldc:int(8199)))))
        }
        
        Label_0400:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1731969148))
                goto(Label_0267)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0207)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-464836117))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1410074706))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(16559), ldc:int(2371)))))
            }
        }
        
        Label_0472:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(411700081))
            goto(Label_0400)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0207)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_24A = and:int(var_8_63:int, ldc:int(-1879706726))
        var_10_21C = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_21C:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_24A:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_24A = and:int(var_8_24A:int, ldc:int(591099854))
                    
                    if (cmpne:boolean(p0:float[], aconstnull:float[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:float[])), var_10_21C:long)) {
                            var_12_251 = p0:float[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_24A:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_24A = and:int(var_8_24A:int, ldc:int(-1879867729))
                    var_12_251 = newarray:float[](float.class, l2i:int(var_10_21C:long))
                    looporswitchbreak()
                }
            }
            
            var_8_3B3 = and:int(var_8_24A:int, ldc:int(-665095617))
            var_13_2A6 = and:int(ldc:int(19513), ldc:int(-19578))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_8_3B3 = and:int(var_8_3B3:int, ldc:int(1622668332))
                    }
                    else {
                        var_8_3B3 = and:int(var_8_3B3:int, ldc:int(2069754879))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        var_14_2F0 = p1:long
                        goto(Label_0893)
                    }
                } while (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(8)), ldc:int(0)))
                
                var_14_2E6 = p1:long
                
                while (cmplt:boolean(var_14_2E6:long, p2:long)) {
                    storeelement:float(var_12_251:float[], postincrement:int(1, var_13_2A6:int), l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_2E6:long))))
                    var_14_2E6 = add:long(var_14_2E6:long, p3:long)
                }
                
                return:float[](var_12_251:float[])
            }
            
            var_14_2F0 = p1:long
            Label_0754:
            
            while (cmpne:boolean(and:int(var_8_3B3:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0893)
                }
                
                if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0796)
                }
                
                var_8_3B3 = and:int(var_8_3B3:int, ldc:int(-975472085))
                
                if (cmpge:boolean(var_14_2F0:long, p2:long)) {
                    goto(Label_0796)
                }
                
                storeelement:float(var_12_251:float[], postincrement:int(1, var_13_2A6:int), l2f:float(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_2F0:long)))))
                var_14_2F0 = add:long(var_14_2F0:long, p3:long)
            }
            
            goto(Label_0957)
            Label_0893:
            
            while (cmpne:boolean(and:int(var_8_3B3:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_3B3:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_3B3 = and:int(var_8_3B3:int, ldc:int(1869648296))
                    goto(Label_0796)
                }
                
                if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(512)), ldc:int(0))) {
                    var_8_3B3 = and:int(var_8_3B3:int, ldc:int(-621837732))
                    goto(Label_0754)
                }
                
                var_8_3B3 = and:int(var_8_3B3:int, ldc:int(-1820754034))
                
                if (cmpge:boolean(var_14_2F0:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:float(var_12_251:float[], postincrement:int(1, var_13_2A6:int), l2f:float(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(11457), ldc:int(-28358)))))
                var_14_2F0 = add:long(var_14_2F0:long, p3:long)
            }
            
            goto(Label_0957)
            Label_0796:
            
            if (cmpne:boolean(and:int(var_8_3B3:int, ldc:int(2)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0893)
                }
                
                if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_3B3 = and:int(var_8_3B3:int, ldc:int(1422705567))
                    goto(Label_0754)
                }
                
                return:float[](var_12_251:float[])
            }
            
            Label_0957:
            
            if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(16384)), ldc:int(0))) {
                var_8_3B3 = and:int(var_8_3B3:int, ldc:int(612463769))
                goto(Label_0893)
            }
            
            if (cmpne:boolean(and:int(var_8_3B3:int, ldc:int(262144)), ldc:int(0))) {
                var_8_3B3 = and:int(var_8_3B3:int, ldc:int(-265942042))
                goto(Label_0796)
            }
            
            if (cmpeq:boolean(and:int(var_8_3B3:int, ldc:int(8192)), ldc:int(0))) {
                var_8_3B3 = and:int(var_8_3B3:int, ldc:int(-415055453))
                goto(Label_0754)
            }
            
            return:float[](var_12_251:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7() {
        var_1_61 : int
        var_1_14D : int
        var_3_7A : double[]
        var_5_135 : double
        var_7_13E : int
        var_4_B7 : int
        var_4_CD : int
        
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
        var_1_61 = and:int(ldc:int(-187953404), ldc:int(2039889807))
        
        if (cmple:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(1073741824L))) {
            var_1_14D = and:int(var_1_61:int, ldc:int(1905093559))
            var_3_7A = newarray:double[](double.class, l2i:int(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_14D = and:int(var_1_14D:int, ldc:int(-407547115))
                        
                        if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                            var_5_135 = l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(13829), ldc:int(-13830))))
                            var_7_13E = and:int(ldc:int(-19317), ldc:int(18996))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(131072)), ldc:int(0))) {
                                    var_1_14D = and:int(var_1_14D:int, ldc:int(-1986378731))
                                }
                                else {
                                    var_1_14D = and:int(var_1_14D:int, ldc:int(1944474247))
                                    
                                    if (cmplt:boolean(i2l:long(var_7_13E:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                                        storeelement:double(var_3_7A:double[], var_7_13E:int, var_5_135:double)
                                        inc:int(var_7_13E, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(1)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_4_B7 = and:int(ldc:int(21153), ldc:int(-21158))
                        
                        while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:double(var_3_7A:double[], var_4_B7:int, l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_4_B7:int)))
                            inc:int(var_4_B7, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_14D = and:int(var_1_14D:int, ldc:int(777470205))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(3133), ldc:int(-19774))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_14D:int, ldc:int(4)), ldc:int(0))) {
                        var_1_14D = and:int(var_1_14D:int, ldc:int(-37978242))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            storeelement:double(var_3_7A:double[], var_4_CD:int, l2d:double(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), i2l:long(var_4_CD:int))))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_14D:int, ldc:int(64)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_14D = and:int(var_1_14D:int, ldc:int(1640618111))
                }
            }
            
            return:double[](var_3_7A:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7(double[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_20C : int
        var_10_21B : long
        var_8_25F : int
        var_12_266 : double[]
        var_8_316 : int
        var_13_2BB : int
        var_14_305 : long
        var_14_2FB : long
        
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
        var_8_63 = and:int(ldc:int(1294903198), ldc:int(1877380287))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                goto(Label_0218)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0450)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1316194922))
            goto(Label_0389)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1154321494))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(25089), ldc:int(25088)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(1409526829))
        Label_0218:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0450)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0389)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-872504161))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0389)
                    }
                }
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1316877163))
            goto(Label_0450)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-71647892))
                goto(Label_0218)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(517), ldc:int(519)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0389:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0267)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-60207932))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-46683458))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(1042), ldc:int(1041)))))
            }
        }
        
        Label_0450:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1704612249))
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(847992250))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1219060023))
            goto(Label_0107)
        }
        
        var_8_20C = and:int(var_8_63:int, ldc:int(-113313218))
        var_10_21B = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_21B:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_20C:int, ldc:int(1)), ldc:int(0))) {
                    var_8_25F = and:int(var_8_20C:int, ldc:int(-1037408527))
                }
                else {
                    var_8_25F = and:int(var_8_20C:int, ldc:int(1600585598))
                    
                    if (cmpne:boolean(p0:double[], aconstnull:double[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:double[])), var_10_21B:long)) {
                            var_12_266 = p0:double[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_25F:int, ldc:int(16)), ldc:int(0))) {
                    var_8_25F = and:int(var_8_25F:int, ldc:int(1509875199))
                    var_12_266 = newarray:double[](double.class, l2i:int(var_10_21B:long))
                    looporswitchbreak()
                }
                
                var_8_20C = and:int(var_8_25F:int, ldc:int(-465151819))
            }
            
            var_8_316 = and:int(var_8_25F:int, ldc:int(-76022625))
            var_13_2BB = and:int(ldc:int(18650), ldc:int(-18907))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_8_316:int, ldc:int(65536)), ldc:int(0))) {
                        var_8_316 = and:int(var_8_316:int, ldc:int(1154002560))
                    }
                    else {
                        var_8_316 = and:int(var_8_316:int, ldc:int(2138481406))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        var_14_305 = p1:long
                        goto(Label_0944)
                    }
                } while (cmpeq:boolean(and:int(var_8_316:int, ldc:int(1073741824)), ldc:int(0)))
                
                var_14_2FB = p1:long
                
                while (cmplt:boolean(var_14_2FB:long, p2:long)) {
                    storeelement:double(var_12_266:double[], postincrement:int(1, var_13_2BB:int), l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(var_14_2FB:long))))
                    var_14_2FB = add:long(var_14_2FB:long, p3:long)
                }
                
                return:double[](var_12_266:double[])
            }
            
            var_14_305 = p1:long
            Label_0775:
            
            while (cmpne:boolean(and:int(var_8_316:int, ldc:int(2)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_316 = and:int(var_8_316:int, ldc:int(166908188))
                    goto(Label_0944)
                }
                
                if (cmpne:boolean(and:int(var_8_316:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_316 = and:int(var_8_316:int, ldc:int(1854323848))
                    goto(Label_0849)
                }
                
                var_8_316 = and:int(var_8_316:int, ldc:int(1869529374))
                
                if (cmpge:boolean(var_14_305:long, p2:long)) {
                    goto(Label_0849)
                }
                
                storeelement:double(var_12_266:double[], postincrement:int(1, var_13_2BB:int), l2d:double(invokevirtual:long(Unsafe::getLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), var_14_305:long)))))
                var_14_305 = add:long(var_14_305:long, p3:long)
            }
            
            var_8_316 = and:int(var_8_316:int, ldc:int(-1441280949))
            goto(Label_1008)
            Label_0944:
            
            while (cmpne:boolean(and:int(var_8_316:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0849)
                }
                
                if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(8)), ldc:int(0))) {
                    var_8_316 = and:int(var_8_316:int, ldc:int(45695353))
                    goto(Label_0775)
                }
                
                var_8_316 = and:int(var_8_316:int, ldc:int(-76089761))
                
                if (cmpge:boolean(var_14_305:long, p2:long)) {
                    goto(Label_1008)
                }
                
                storeelement:double(var_12_266:double[], postincrement:int(1, var_13_2BB:int), l2d:double(loadelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), and:int(ldc:int(-18561), ldc:int(18560)))))
                var_14_305 = add:long(var_14_305:long, p3:long)
            }
            
            var_8_316 = and:int(var_8_316:int, ldc:int(-1825222153))
            goto(Label_1008)
            Label_0849:
            
            if (cmpne:boolean(and:int(var_8_316:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0944)
                }
                
                if (cmpne:boolean(and:int(var_8_316:int, ldc:int(1)), ldc:int(0))) {
                    var_8_316 = and:int(var_8_316:int, ldc:int(139778967))
                    goto(Label_0775)
                }
                
                return:double[](var_12_266:double[])
            }
            
            Label_1008:
            
            if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0944)
            }
            
            if (cmpeq:boolean(and:int(var_8_316:int, ldc:int(32768)), ldc:int(0))) {
                var_8_316 = and:int(var_8_316:int, ldc:int(-1752572602))
                goto(Label_0849)
            }
            
            if (cmpne:boolean(and:int(var_8_316:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0775)
            }
            
            return:double[](var_12_266:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final void \u76bc\u6fb0\u52d3\ud51e\u5140\u5245(long p0, java.lang.Object p1) {
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
            invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), invokevirtual:long(Long::longValue, checkcast:Long(java.lang.Long.class, p1:Object[expected:Long])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u62da\u40a9\u3bc9\u527a\u8389\u62da(long p0, boolean p1) {
        var_4_D7 : int
        var_4_95 : int
        stack_117_0 : long[] [generated]
        stack_117_1 : int [generated]
        stack_117_2 : long [generated]
        stack_EA_0 : Unsafe [generated]
        expr_C5 : long [generated]
        stack_EA_3 : long [generated]
        
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
            var_4_D7 = and:int(ldc:int(813437237), ldc:int(-1722871909))
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_4_D7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_4_D7 = and:int(var_4_D7:int, ldc:int(835577219))
                        
                        if (logicalnot:boolean(getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))) {
                            loopcontinue()
                        }
                        
                        athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(64), ldc:int(68)))))
                    }
                } while (cmpne:boolean(and:int(var_4_D7:int, ldc:int(33554432)), ldc:int(0)))
                
                var_4_95 = and:int(var_4_D7:int, ldc:int(-1806260427))
                stack_117_0 = getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)
                stack_117_1 = l2i:int(p0:long)
                
                if (cmpne:boolean(p1:boolean[expected:int], xor:int(ldc:int(8200), ldc:int(8201)))) {
                    var_4_95 = and:int(var_4_95:int, ldc:int(2130598745))
                    stack_117_2 = ldc:long(0L)
                }
                else {
                    stack_117_2 = ldc:long(1L)
                }
                
                storeelement:long(stack_117_0:long[], stack_117_1:int, stack_117_2:long)
            }
            else {
                stack_EA_0 = getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258)
                expr_C5 = add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long))
                
                if (cmpne:boolean(p1:boolean[expected:int], xor:int(ldc:int(834), ldc:int(835)))) {
                    var_4_D7 = and:int(var_4_D7:int, ldc:int(1556535787))
                    stack_EA_3 = ldc:long(0L)
                }
                else {
                    stack_EA_3 = ldc:long(1L)
                }
                
                invokevirtual:void(Unsafe::putLong, stack_EA_0:Unsafe, expr_C5:long, stack_EA_3:long)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9(long p0, byte p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(16422), ldc:int(4884)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), i2l:long(p1:byte[expected:int]))
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), i2l:long(p1:byte[expected:int]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc29a\ub70c\u7043\ubf56\u718f\u7330(long p0, short p1) {
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
            invokevirtual:void(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long, p1:short)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c(long p0, short p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(6145), ldc:int(6149)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), i2l:long(p1:short[expected:int]))
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), i2l:long(p1:short[expected:int]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ucfaf\u5654\ud36e\u6198\ufe34\u8640(long p0, int p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(-32767), ldc:int(-32763)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), i2l:long(p1:int))
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), i2l:long(p1:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u8709\u3bd6\u071d\u760c\u8bb0\u51fa(long p0, long p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), xor:int(ldc:int(16897), ldc:int(16901)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), p1:long)
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), p1:long)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u59ec\u47c2\u7043\u51b2\u9255\u12cb(long p0, float p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(8294), ldc:int(19468)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), f2l:long(p1:float))
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), f2l:long(p1:float))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ub171\u183a\ubefe\u36d3\uf9c5\u8258(long p0, double p1) {
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
            
            if (cmpeq:boolean(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), ldc:long(0L))) {
                if (getfield:boolean(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3), and:int(ldc:int(1540), ldc:int(20709)))))
                }
                
                storeelement:long(getfield:long[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u7043\uceb8\u7049\u12cb\ua6bd\u4f52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), l2i:int(p0:long), d2l:long(p1:double))
            }
            else {
                invokevirtual:void(Unsafe::putLong, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), mul:long(getfield:long(\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a), p0:long)), d2l:long(p1:double))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object clone() {
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
            return:Object(invokevirtual:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::clone, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52() {
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
            return:Object(invokevirtual:long[][expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \ua068\u12cb\ubf56\u34df\u3776\u385b(long p0) {
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
            return:Object(invokevirtual:Long[expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\ua068\u12cb\ubf56\u34df\u3776\u385b, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u0800\u8413\u3bc9\u3776\u392e\u4492(long p0) {
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
            return:Object(invokevirtual:Long[expected:Object](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u0800\u8413\u3bc9\u3776\u392e\u4492, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a, p0:long))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20D : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_1B5_0 : byte[] [generated]
        stack_220_0 : byte[] [generated]
        stack_292_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        expr_1BB : byte [generated]
        var_0_216 : int
        expr_220 : byte [generated]
        stack_260_2 : byte [generated]
        stack_23D_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BC : byte[]
        expr_C0 : int [generated]
        var_3_280 : byte[]
        var_5_281 : int
        var_3_F1 : String
        stack_190_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
        var_0_20D = and:int(ldc:int(-1742606859), ldc:int(-759300105))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_1B5_0 = stack_220_0 = stack_292_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("rn0aqzCCYLlyuGF3Zi9mdWN1b4Bnb36uRGxrb36Na30jXHt/Ybt3H1twXWSpfTBucTZgp25vtHNpcy10bnRerH8rP0U9ILusbaCzW1W0fSs/N21csp63cSl5fiRpq1tVtH0rP0WAca+vxlFceW9wgH9yUFx5HytFPSC7rG2wwWF0xlFceR8rRyxgp6OgunF8fnNrKTUYOfmgkKSQvQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_197 = expr_6E:int
        var_3_19C = newarray:byte[](byte.class, expr_6E:int)
        var_5_19D = expr_6E:int
        Label_0415:
        
        while (cmpne:boolean(and:int(var_0_20D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-630419977))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_1BB = xor:byte(add:byte(loadelement:byte(stack_1B5_0:byte[], var_5_19D:int), ldc:byte(9)), ldc:byte(118))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, or:int(and:int(shl:int(expr_1BB:byte, xor:int(ldc:int(1112), ldc:int(1116))), ldc:int(-16)), and:int(shr:int(expr_1BB:byte[expected:int], xor:int(ldc:int(15), ldc:int(11))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_1B5_0 = stack_220_0 = stack_292_0 = var_3_19C:byte[]
            goto(Label_0115)
        }
        
        Label_0512:
        
        while (cmpne:boolean(and:int(var_0_20D:int, ldc:int(32)), ldc:int(0))) {
            var_0_216 = and:int(var_0_20D:int, ldc:int(-721690625))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_220 = stack_260_2 = loadelement(stack_220_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(5)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_260_2 = stack_23D_0 = add:byte(expr_220:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(5))))
                goto(Label_0589)
            }
            
            Label_0557:
            
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(64)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(-1124734467))
                stack_260_2 = stack_23D_0 = add:byte(expr_220:byte, ldc:byte(5))
            }
            
            Label_0589:
            
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0557)
            }
            
            var_0_20D = and:int(var_0_216:int, ldc:int(-1229402121))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_260_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_1B5_0 = stack_220_0 = stack_292_0 = var_3_19C:byte[]
            goto(Label_0155)
        }
        
        var_0_20D = and:int(var_0_20D:int, ldc:int(1729562822))
        goto(Label_0415)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(256)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(1520689318))
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(16)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1137534465))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_197 = expr_96:int
                var_3_19C = newarray:byte[](byte.class, expr_96:int)
                var_5_19D = expr_96:int
                goto(Label_0512)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(32)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(1998322029))
        }
        else {
            if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1674403849))
            var_2_BC = stack_BC_0:byte[]
            expr_C0 = add:int(arraylength:int(stack_BE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_3_280 = newarray:byte[](byte.class, expr_C0:int)
                var_5_281 = expr_C0:int
                
                loop {
                    var_0_20D = and:int(var_0_20D:int, ldc:int(-47871491))
                    var_5_281 = add:int(var_5_281:int, ldc:int(-1))
                    storeelement:byte(var_3_280:byte[], var_5_281:int, add:int(shl:int(loadelement:byte(stack_292_0:byte[], var_5_281:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BC:byte[], add:int(var_5_281:int, xor:int(ldc:int(19008), ldc:int(19009)))), ldc:int(4)), xor:int(ldc:int(6683), ldc:int(6676)))))
                    
                    if (cmpne:boolean(var_5_281:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_1B5_0 = stack_220_0 = stack_292_0 = var_3_280:byte[]
            }
        }
        
        Label_0197:
        
        if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1059354439))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(4)), ldc:int(0))) {
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_190_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(71), ldc:int(8741)))
            expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4117), ldc:int(16461)))
            storeelement:String(expr_103:String[], and:int(ldc:int(-28806), ldc:int(28805)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(-28881), ldc:int(28864)), xor:int(ldc:int(16667), ldc:int(16646))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(16641), ldc:int(16645)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-24307), ldc:int(-24304)), xor:int(ldc:int(2199), ldc:int(2263))))
            storeelement:String(expr_103:String[], and:int(ldc:int(738), ldc:int(4354)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32767), ldc:int(-32703)), and:int(ldc:int(1142), ldc:int(24698))))
            storeelement:String(expr_103:String[], and:int(ldc:int(2321), ldc:int(1103)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(9330), ldc:int(17143)), and:int(ldc:int(4244), ldc:int(407))))
            storeelement:String(expr_103:String[], and:int(ldc:int(3), ldc:int(8747)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(16540), ldc:int(8406)), xor:int(ldc:int(5261), ldc:int(5137))))
            putstatic:String[](\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a::\u836c\u8aa5\u527a\ubcb0\ud51e\u52d3, expr_103:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub32d\ub171\u3711\u76bc\u7c6b\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(295983079), ldc:int(1838544879))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u6b5f\u7330\ua068\uae5d\u3e2a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(2147310583))
            var_5_80 = and:int(ldc:int(-27143), ldc:int(27142))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10518), ldc:int(-11679)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_672:int, ldc:int(-984844545))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(2049), ldc:int(865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(8274), ldc:int(8275)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D0:int, ldc:int(121559799))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(1097), ldc:int(18465)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(120299702))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1812646722))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1314563879))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1498237697))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1573006806))
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1905736339))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1485447193))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-307167956))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1967239685))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1150994410))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1800584225))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(207436357))
                        goto(Label_0714)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-100006755))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-818055193))
                        var_11_E1 = and:int(ldc:int(-2529), ldc:int(2528))
                        goto(Label_1531)
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(244356743))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1325690505))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-694759670))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-213943321))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0714:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(724675212))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1660691234))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-787914983))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1934363063))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(250741403))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-904479307))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1297415143))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0863:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2024292229))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1482198613))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1577585492))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-807305230))
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1164998900))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(799873112))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1533894375))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(-32620), ldc:int(-32619))
                                goto(Label_1152)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1186390908))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1692202019))
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1433490602))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1035785983))
                        var_11_E1 = and:int(ldc:int(-6129), ldc:int(1520))
                    }
                    
                    Label_1152:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1048596062))
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-277068893))
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1730376086))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-132419782))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1731002095))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1275:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(996424135))
                            goto(Label_1152)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2141445192))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1257950772))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2126054673))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1531)
                    }
                    
                    Label_1401:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1921743492))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-789588923))
                        goto(Label_0714)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1932688369))
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1696483234))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1064599279))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2082909435))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-313076379))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1077403336))
                        goto(Label_0714)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1196407374))
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(733379327))
                        var_17_67D = add:int(var_16_10F:int, xor:int(ldc:int(4242), ldc:int(4243)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1728962303))
                
                if (cmple:boolean(var_5_80 = var_17_67D:int, sub:int(var_6_87:int, and:int(ldc:int(20497), ldc:int(9349))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
