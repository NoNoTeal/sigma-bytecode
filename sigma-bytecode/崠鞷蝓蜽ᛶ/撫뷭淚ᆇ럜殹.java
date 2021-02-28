public class \u5d20\u97b7\u8753\u873d\u16f6.\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9 {
    public void \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(long p0) {
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
            invokespecial:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::<init>, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long, xor:int[expected:boolean](ldc:int(8323), ldc:int(8322)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(long p0, boolean p1) {
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u4f4a\u92ff\u51b2\ubcb0\u516c\u759a))
        putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(1L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long)
            
            if (cmple:boolean(p0:long, i2l:long(invokestatic:int(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u3504\u8709\u36d3\u5245\uff55\u392e)))) {
                putfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, newarray:byte[](byte.class, l2i:int(p0:long)))
            }
            else {
                putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, invokevirtual:long(Unsafe::allocateMemory, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), mul:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))))
                
                if (p1:boolean) {
                    invokevirtual:void(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\uc2bd\u6bb9\u385b\u8df4\u6b5f\uc910, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:long)
                }
                
                invokestatic:Cleaner(Cleaner::create, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:Object], initobject:\uf9c5\u392e\u8d90\u4975\uc3e3\u9033[expected:Runnable](\uf9c5\u392e\u8d90\u4975\uc3e3\u9033::<init>, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
                invokestatic:void(\u416d\ub19c\ube23\uc246\u4c04\ub70c::\u7330\u5654\uc29a\ub102\ub70c\u6cfe, mul:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(-22553), ldc:int(22552)))))))
    }
    
    public void \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(long p0, short p1) {
        expr_EE : byte[] [generated]
        
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u4f4a\u92ff\u51b2\ubcb0\u516c\u759a))
        putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(1L))
        
        if (cmple:boolean(p0:long, ldc:long(0L))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(-15167), ldc:int(14870)))))))
        }
        
        putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long)
        putfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, xor:int[expected:boolean](ldc:int(-30680), ldc:int(-30679)))
        
        if (logicaland:boolean(cmpge:boolean(p1:short, ldc:short(0)), cmple:boolean(p1:short[expected:int], and:int(ldc:int(2303), ldc:int(17151))))) {
            expr_EE = newarray:byte[](byte.class, and:int(ldc:int(4097), ldc:int(3349)))
            storeelement:byte(expr_EE:byte[], and:int(ldc:int(10672), ldc:int(-11193)), i2b:byte(p1:short[expected:int]))
            putfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, expr_EE:byte[])
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(10880), ldc:int(10881)))))
    }
    
    public void \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(byte[] p0) {
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u4f4a\u92ff\u51b2\ubcb0\u516c\u759a))
            putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(1L))
            putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, i2l:long(arraylength:int(p0:byte[])))
            putfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:byte[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(short[] p0) {
        var_4_85 : int
        var_5_A3 : short
        
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u4f4a\u92ff\u51b2\ubcb0\u516c\u759a))
            putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(1L))
            putfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, i2l:long(arraylength:int(p0:short[])))
            putfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, newarray:byte[](byte.class, arraylength:int(p0:short[])))
            var_4_85 = and:int(ldc:int(9102), ldc:int(-9103))
            
            while (cmplt:boolean(i2l:long(var_4_85:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                var_5_A3 = loadelement:short(p0:short[], var_4_85:int)
                
                if (logicalor:boolean(cmplt:boolean(var_5_A3:short, ldc:short(0)), cmpgt:boolean(var_5_A3:short[expected:int], and:int(ldc:int(767), ldc:int(9727))))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(-31711), ldc:int(-31712)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_85:int, i2b:byte(var_5_A3:short[expected:int]))
                inc:int(var_4_85, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9 clone() {
        var_3_7E : \u64ab\ubded\uf94d\u1187\ub7dc\u6bb9
        
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
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            var_3_7E = initobject:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::<init>, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int[expected:boolean](ldc:int(2597), ldc:int(-2598)))
            invokestatic:void(\ube23\u67d0\u3504\u0a06\u718f\uc910::\ub83f\u67e9\u8709\u76bc\ub6ab\u836c, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(0L), var_3_7E:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(0L), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))
            return:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(var_3_7E:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
        }
        
        return:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(initobject:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::<init>, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2s:short(invokevirtual:byte[expected:int](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, ldc:long(0L)))))
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
        var_2_5F = and:int(ldc:int(103733002), ldc:int(-1904816454))
        
        if (logicalnot:boolean(invokespecial:boolean(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::equals, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:Object))) {
            return:boolean(and:int[expected:boolean](ldc:int(-11793), ldc:int(11792)))
        }
        
        if (cmpne:boolean(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, checkcast:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9(\u5d20\u97b7\u8753\u873d\u16f6.\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9.class, p0:Object[expected:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9])))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1489305633))
            stack_AA_0 = and:int(ldc:int(-4373), ldc:int(4372))
        }
        else {
            stack_AA_0 = xor:int(ldc:int(258), ldc:int(259))
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
            var_1_5F = and:int(ldc:int(809738666), ldc:int(-1101597254))
            stack_8D_0 = mul:int(ldc:int(29), invokespecial:int(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::hashCode, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]))
            
            if (cmpeq:boolean(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), aconstnull:byte[]())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-261966162))
                stack_8D_1 = and:int(ldc:int(-2005), ldc:int(1748))
            }
            else {
                stack_8D_1 = invokevirtual:int(Object::hashCode, getfield:byte[][expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))
            }
            
            return:int(add:int(stack_8D_0:int, stack_8D_1:int))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Short \u0800\u8413\u3bc9\u3776\u392e\u4492(long p0) {
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
            return:Short(invokestatic:Short(Short::valueOf, invokevirtual:short(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u56bd\ub113\u5654\u965f\u7006\u5140, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long)))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Byte \ua068\u12cb\ubf56\u34df\u3776\u385b(long p0) {
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
            return:Byte(invokestatic:Byte(Byte::valueOf, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long))))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \ub7dc\u9255\uf94d\u8df4\u3e75\u7af6(long p0) {
        var_3_FC : int
        stack_1EA_0 : int [generated]
        stack_174_0 : int [generated]
        stack_1FB_0 : int [generated]
        
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
            var_3_FC = and:int(ldc:int(1933677438), ldc:int(-1613832338))
            
            if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (cmpeq:boolean(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)), ldc:byte(0))) {
                    goto(Label_0282)
                }
                
                stack_1EA_0 = stack_174_0 = and(ldc(565), ldc(13315))
                goto(Label_0352)
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(1445071233))
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0282)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(32768)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-1857886472))
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(2)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-1220438666))
                
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-7925), ldc:int(2672))), ldc:byte(0))) {
                        goto(Label_0392)
                    }
                    
                    stack_1EA_0 = stack_174_0 = xor(ldc(3360), ldc(3361))
                    goto(Label_0470)
                }
            }
            
            Label_0161:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0392)
            }
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0282)
            }
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_FC = and:int(var_3_FC:int, ldc:int(1835628270))
                    goto(Label_0105)
                }
                
                var_3_FC = and:int(var_3_FC:int, ldc:int(1465764326))
                
                if (cmpne:boolean(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)), ldc:byte(0))) {
                    stack_1FB_0 = xor:int[expected:boolean](ldc:int(10243), ldc:int(10242))
                    return:boolean(stack_1FB_0:boolean)
                }
            }
            
            Label_0212:
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0392)
            }
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(262144)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-325061000))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0161)
                }
                
                if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_FC = and:int(var_3_FC:int, ldc:int(1600253798))
                    stack_1FB_0 = and:int[expected:boolean](ldc:int(-12948), ldc:int(4755))
                    return:boolean(stack_1FB_0:boolean[expected:int])
                }
                
                goto(Label_0105)
            }
            
            Label_0282:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-1932994978))
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(2048)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(592522161))
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_FC = and:int(var_3_FC:int, ldc:int(-680747529))
            stack_1EA_0 = stack_174_0 = and(ldc(-8370), ldc(8369))
            Label_0352:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(256)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(1945983957))
                goto(Label_0470)
            }
            
            return:boolean(stack_174_0:boolean)
            Label_0392:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(32768)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(232072219))
                goto(Label_0282)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(32768)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-1633637556))
                goto(Label_0212)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-1661071592))
                goto(Label_0105)
            }
            
            var_3_FC = and:int(var_3_FC:int, ldc:int(-539558530))
            stack_1EA_0 = stack_174_0 = and(ldc(-8269), ldc(8268))
            Label_0470:
            
            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_FC = and:int(var_3_FC:int, ldc:int(-349066504))
                goto(Label_0352)
            }
            
            return:boolean(stack_1EA_0:int)
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:byte(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:byte(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)))
        }
        
        return:byte(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-3461), ldc:int(3460))))
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:short(i2s:short(and:int(and:int(ldc:int(3071), ldc:int(255)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:short(i2s:short(and:int(and:int(ldc:int(4351), ldc:int(2303)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)))))
        }
        
        return:short(i2s:short(and:int(and:int(ldc:int(16639), ldc:int(2815)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-10906), ldc:int(2713))))))
    }
    
    public final short \ub32d\ud12e\uf9c5\ub83f\u16f6\u527a(long p0) {
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
            return:short(invokevirtual:short(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u56bd\ub113\u5654\u965f\u7006\u5140, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long))
        }
        
        goto(Label_0006)
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:int(and:int(xor:int(ldc:int(2762), ldc:int(2613)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:int(and:int(xor:int(ldc:int(14596), ldc:int(14843)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long))))
        }
        
        return:int(and:int(and:int(ldc:int(255), ldc:int(6399)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-10563), ldc:int(10562)))))
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:long(i2l:long(and:int(and:int(ldc:int(12543), ldc:int(20223)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:long(i2l:long(and:int(xor:int(ldc:int(18071), ldc:int(18024)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)))))
        }
        
        return:long(i2l:long(and:int(and:int(ldc:int(255), ldc:int(24831)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(21320), ldc:int(-22345))))))
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:float(i2f:float(and:int(and:int(ldc:int(5375), ldc:int(8703)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:float(i2f:float(and:int(and:int(ldc:int(16639), ldc:int(9471)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)))))
        }
        
        return:float(i2f:float(and:int(and:int(ldc:int(10495), ldc:int(1535)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-17572), ldc:int(17571))))))
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
        
        if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            return:double(i2d:double(and:int(xor:int(ldc:int(18521), ldc:int(18598)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
            return:double(i2d:double(and:int(and:int(ldc:int(29951), ldc:int(255)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long)))))
        }
        
        return:double(i2d:double(and:int(xor:int(ldc:int(23659), ldc:int(23700)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-29194), ldc:int(29193))))))
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded(boolean[] p0, long p1, long p2, long p3) {
        var_8_82 : int
        var_8_280 : int
        var_10_252 : long
        var_12_287 : boolean[]
        var_8_4F9 : int
        var_13_2DC : int
        var_14_348 : long
        var_16_391 : byte
        stack_518_0 : boolean[] [generated]
        stack_3CD_0 : boolean[] [generated]
        stack_518_1 : int [generated]
        stack_3CD_1 : int [generated]
        stack_3CD_2 : int [generated]
        stack_435_0 : int [generated]
        var_8_433 : int
        var_17_435 : boolean
        var_18_438 : long
        var_16_4DD : byte
        stack_518_2 : int [generated]
        
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
        var_8_82 = and:int(ldc:int(1976887613), ldc:int(1677188988))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0195)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0505)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(64)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(2123816833))
            goto(Label_0422)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0289)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(256)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(801), ldc:int(803)))))
        }
        
        Label_0195:
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(65536)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(-1312867716))
            goto(Label_0505)
        }
        
        if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(459774129))
            goto(Label_0422)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(131072)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(1526452895))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(8388608)), ldc:int(0))) {
                var_8_82 = and:int(var_8_82:int, ldc:int(223432221))
                goto(Label_0107)
            }
            
            var_8_82 = and:int(var_8_82:int, ldc:int(-941295303))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0422)
                    }
                }
            }
        }
        
        Label_0289:
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0505)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(128)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(1294194526))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_82 = and:int(var_8_82:int, ldc:int(-1959868366))
                goto(Label_0195)
            }
            
            if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_82 = and:int(var_8_82:int, ldc:int(380383827))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(8227), ldc:int(16971)))))
        }
        
        Label_0422:
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(64)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(1317478465))
        }
        else {
            if (cmpne:boolean(and:int(var_8_82:int, ldc:int(128)), ldc:int(0))) {
                var_8_82 = and:int(var_8_82:int, ldc:int(1949814548))
                goto(Label_0289)
            }
            
            if (cmpne:boolean(and:int(var_8_82:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0195)
            }
            
            if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_82 = and:int(var_8_82:int, ldc:int(-1820013015))
                goto(Label_0107)
            }
            
            var_8_82 = and:int(var_8_82:int, ldc:int(1606934000))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(10371), ldc:int(10375)))))
            }
        }
        
        Label_0505:
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(131072)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(903182872))
            goto(Label_0422)
        }
        
        if (cmpne:boolean(and:int(var_8_82:int, ldc:int(65536)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(1074474255))
            goto(Label_0289)
        }
        
        if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0195)
        }
        
        if (cmpeq:boolean(and:int(var_8_82:int, ldc:int(8388608)), ldc:int(0))) {
            var_8_82 = and:int(var_8_82:int, ldc:int(986931804))
            goto(Label_0107)
        }
        
        var_8_280 = and:int(var_8_82:int, ldc:int(1237831679))
        var_10_252 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_252:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_280:int, ldc:int(33554432)), ldc:int(0))) {
                    var_8_280 = and:int(var_8_280:int, ldc:int(1845424052))
                    
                    if (cmpne:boolean(p0:boolean[], aconstnull:boolean[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:boolean[])), var_10_252:long)) {
                            var_12_287 = p0:boolean[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_280:int, ldc:int(32)), ldc:int(0))) {
                    var_8_280 = and:int(var_8_280:int, ldc:int(-274666639))
                    var_12_287 = newarray:boolean[](boolean.class, l2i:int(var_10_252:long))
                    looporswitchbreak()
                }
            }
            
            var_8_4F9 = and:int(var_8_280:int, ldc:int(-140747333))
            var_13_2DC = and:int(ldc:int(-21279), ldc:int(21278))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                goto(Label_0743)
            }
            
            var_14_348 = p1:long
            
            do {
                Label_0852:
                
                if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(131072)), ldc:int(0))) {
                    var_8_4F9 = and:int(var_8_4F9:int, ldc:int(2111629751))
                    
                    if (cmpge:boolean(var_14_348:long, p2:long)) {
                        loopcontinue()
                    }
                    
                    var_16_391 = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_348:long))
                    stack_518_0 = stack_3CD_0 = var_12_287
                    stack_518_1 = stack_3CD_1 = var_13_2DC
                    inc:int(var_13_2DC, ldc:int(1))
                    
                    if (cmpeq:boolean(var_16_391:byte, ldc:byte(0))) {
                        goto(Label_0927)
                    }
                    
                    stack_3CD_2 = xor:int(ldc:int(537), ldc:int(536))
                    goto(Label_0965)
                }
            } while (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(65536)), ldc:int(0)))
            
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-340821006))
            goto(Label_1174)
            Label_0743:
            
            if (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(131072)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(792255949))
                goto(Label_1174)
            }
            
            if (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(65536)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-1312141285))
                goto(Label_1003)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(512)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-1040295492))
                
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(8932), ldc:int(-9191))), ldc:byte(0))) {
                        goto(Label_1003)
                    }
                    
                    stack_435_0 = and:int[expected:boolean](ldc:int(16385), ldc:int(7043))
                    goto(Label_1069)
                }
            }
            
            Label_0806:
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1174)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1003)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(33554432)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-544900624))
                var_14_348 = p1:long
                goto(Label_1166)
            }
            
            goto(Label_0743)
            Label_0927:
            
            if (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1259)
            }
            
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-209133646))
            stack_3CD_2 = and:int(ldc:int(-5199), ldc:int(1102))
            Label_0965:
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(1575120254))
            storeelement:boolean(stack_3CD_0:boolean[], stack_3CD_1:int, stack_3CD_2:boolean)
            var_14_348 = add:long(var_14_348:long, p3:long)
            goto(Label_0852)
            Label_1003:
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1174)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(9924354))
                goto(Label_0806)
            }
            
            if (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0743)
            }
            
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-106865228))
            stack_435_0 = and:int[expected:boolean](ldc:int(-19440), ldc:int(19019))
            Label_1069:
            var_8_433 = and:int(var_8_4F9:int, ldc:int(1878547325))
            var_17_435 = stack_435_0:boolean
            var_18_438 = p1:long
            
            loop {
                if (cmpeq:boolean(and:int(var_8_433:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_8_433 = and:int(var_8_433:int, ldc:int(584267363))
                }
                else {
                    var_8_433 = and:int(var_8_433:int, ldc:int(-469971140))
                    
                    if (cmplt:boolean(var_18_438:long, p2:long)) {
                        storeelement:boolean(var_12_287:boolean[], postincrement:int(1, var_13_2DC:int), var_17_435:boolean)
                        var_18_438 = add:long(var_18_438:long, p3:long)
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_433:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_8_4F9 = and:int(var_8_433:int, ldc:int(1436118003))
            goto(Label_1174)
            Label_1166:
            
            if (cmplt:boolean(var_14_348:long, p2:long)) {
                var_16_4DD = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_348:long))
                stack_518_0 = stack_3CD_0 = var_12_287
                stack_518_1 = stack_3CD_1 = var_13_2DC
                inc:int(var_13_2DC, ldc:int(1))
                
                if (cmpeq:boolean(var_16_4DD:byte, ldc:byte(0))) {
                    goto(Label_1259)
                }
                
                stack_518_2 = and:int[expected:boolean](ldc:int(10625), ldc:int(16401))
                goto(Label_1296)
            }
            
            Label_1174:
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1003)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(2059724053))
                goto(Label_0806)
            }
            
            if (cmpeq:boolean(and:int(var_8_4F9:int, ldc:int(8388608)), ldc:int(0))) {
                var_8_4F9 = and:int(var_8_4F9:int, ldc:int(2054686411))
                goto(Label_0743)
            }
            
            return:boolean[](var_12_287:boolean[])
            Label_1259:
            
            if (cmpne:boolean(and:int(var_8_4F9:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0927)
            }
            
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(-806037127))
            stack_518_2 = and:int[expected:boolean](ldc:int(-26883), ldc:int(26882))
            Label_1296:
            var_8_4F9 = and:int(var_8_4F9:int, ldc:int(1810034044))
            storeelement:boolean(stack_518_0:boolean[], stack_518_1:int, stack_518_2:boolean)
            var_14_348 = add:long(var_14_348:long, p3:long)
            goto(Label_1166)
        }
        
        return:boolean[](aconstnull:boolean[]())
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded() {
        var_1_61 : int
        var_1_254 : int
        var_3_7A : boolean[]
        stack_1BA_0 : int [generated]
        var_4_CF : int
        stack_270_0 : boolean[] [generated]
        stack_270_1 : int [generated]
        stack_270_2 : int [generated]
        var_1_1D2 : int
        var_5_1C3 : int
        var_5_13C : byte
        stack_167_0 : boolean[] [generated]
        stack_167_1 : int [generated]
        stack_167_2 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(721581048), ldc:int(-1449830556))
        
        if (cmpgt:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            return:boolean[](aconstnull:boolean[]())
        }
        
        var_1_254 = and:int(var_1_61:int, ldc:int(-1182303261))
        var_3_7A = newarray:boolean[](boolean.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
        
        if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(512)), ldc:int(0))) {
                    var_1_254 = and:int(var_1_254:int, ldc:int(-428480254))
                    goto(Label_0385)
                }
                
                if (cmpne:boolean(and:int(var_1_254:int, ldc:int(512)), ldc:int(0))) {
                    var_1_254 = and:int(var_1_254:int, ldc:int(1869799408))
                    
                    if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                        if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(15425), ldc:int(-15426))), ldc:byte(0))) {
                            goto(Label_0385)
                        }
                        
                        stack_1BA_0 = xor:int(ldc:int(12), ldc:int(13))
                        looporswitchbreak()
                    }
                }
                
                Label_0170:
                
                if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(512)), ldc:int(0))) {
                    var_1_254 = and:int(var_1_254:int, ldc:int(1538292026))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_254:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_254 = and:int(var_1_254:int, ldc:int(-1174678665))
                        var_4_CF = and:int(ldc:int(13888), ldc:int(-13890))
                        
                        while (cmplt:boolean(i2l:long(var_4_CF:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            stack_270_0 = var_3_7A:boolean[]
                            stack_270_1 = var_4_CF:int
                            
                            if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_CF:int), ldc:byte(0))) {
                                var_1_254 = and:int(var_1_254:int, ldc:int(-310151184))
                                stack_270_2 = and:int[expected:boolean](ldc:int(-18231), ldc:int(18230))
                            }
                            else {
                                stack_270_2 = xor:int[expected:boolean](ldc:int(4417), ldc:int(4416))
                            }
                            
                            var_1_254 = and:int(var_1_254:int, ldc:int(-6366350))
                            storeelement:boolean(stack_270_0:boolean[], stack_270_1:int, stack_270_2:boolean)
                            inc:int(var_4_CF, ldc:int(1))
                        }
                        
                        goto(Label_0543)
                    }
                    
                    loopcontinue()
                }
                
                Label_0385:
                
                if (cmpne:boolean(and:int(var_1_254:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_254 = and:int(var_1_254:int, ldc:int(2110749208))
                    goto(Label_0170)
                }
                
                if (cmpne:boolean(and:int(var_1_254:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_254 = and:int(var_1_254:int, ldc:int(-102761489))
                    stack_1BA_0 = and:int(ldc:int(10503), ldc:int(-10512))
                    looporswitchbreak()
                }
            }
            
            var_1_1D2 = and:int(var_1_254:int, ldc:int(-1114637461))
            var_4_CF = stack_1BA_0:int
            var_5_1C3 = and:int(ldc:int(-24545), ldc:int(7840))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_1D2:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1D2 = and:int(var_1_1D2:int, ldc:int(309396811))
                }
                else {
                    var_1_1D2 = and:int(var_1_1D2:int, ldc:int(-347973787))
                    
                    if (cmplt:boolean(i2l:long(var_5_1C3:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                        storeelement:boolean(var_3_7A:boolean[], var_5_1C3:int, var_4_CF:boolean)
                        inc:int(var_5_1C3, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_1D2:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_1D2 = and:int(var_1_1D2:int, ldc:int(90352042))
            }
            
            var_1_254 = and:int(var_1_1D2:int, ldc:int(-1190366367))
            goto(Label_0543)
        }
        
        var_4_CF = and:int(ldc:int(-10461), ldc:int(10332))
        Label_0231:
        
        while (cmpeq:boolean(and:int(var_1_254:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0264)
            }
            
            var_1_254 = and:int(var_1_254:int, ldc:int(2035417058))
            
            if (cmpge:boolean(i2l:long(var_4_CF:boolean[expected:int]), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0264)
            }
            
            var_5_13C = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_CF:boolean[expected:int])))
            stack_167_0 = var_3_7A:boolean[]
            stack_167_1 = var_4_CF:int
            
            if (cmpeq:boolean(var_5_13C:byte, ldc:byte(0))) {
                var_1_254 = and:int(var_1_254:int, ldc:int(804225006))
                stack_167_2 = and:int[expected:boolean](ldc:int(8883), ldc:int(-11956))
            }
            else {
                stack_167_2 = xor:int[expected:boolean](ldc:int(-32127), ldc:int(-32128))
            }
            
            var_1_254 = and:int(var_1_254:int, ldc:int(764443493))
            storeelement:boolean(stack_167_0:boolean[], stack_167_1:int, stack_167_2:boolean)
            inc:int(var_4_CF, ldc:int(1))
        }
        
        goto(Label_0543)
        Label_0264:
        
        if (cmpne:boolean(and:int(var_1_254:int, ldc:int(4)), ldc:int(0))) {
            var_1_254 = and:int(var_1_254:int, ldc:int(-1855741493))
        }
        else {
            if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0231)
            }
            
            var_1_254 = and:int(var_1_254:int, ldc:int(-1141187734))
        }
        
        Label_0543:
        
        if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0264)
        }
        
        if (cmpeq:boolean(and:int(var_1_254:int, ldc:int(64)), ldc:int(0))) {
            var_1_254 = and:int(var_1_254:int, ldc:int(-204202286))
            goto(Label_0231)
        }
        
        return:boolean[](var_3_7A:boolean[])
    }
    
    public final byte[] \u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52() {
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
            return:byte[](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e() {
        var_1_61 : int
        var_1_F5 : int
        var_3_7A : byte[]
        var_1_156 : int
        var_4_146 : byte
        var_5_14F : int
        var_4_E7 : int
        
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
        var_1_61 = and:int(ldc:int(-1161601851), ldc:int(1508313796))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_F5 = and:int(var_1_61:int, ldc:int(2076934103))
            var_3_7A = newarray:byte[](byte.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_F5:int, ldc:int(32)), ldc:int(0))) {
                        var_1_156 = and:int(var_1_F5:int, ldc:int(-910281528))
                    }
                    else {
                        var_1_156 = and:int(var_1_F5:int, ldc:int(2029194934))
                        
                        if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                            var_4_146 = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-23648), ldc:int(19529)))
                            var_5_14F = and:int(ldc:int(-61), ldc:int(60))
                            
                            loop {
                                var_1_156 = and:int(var_1_156:int, ldc:int(813410693))
                                
                                if (cmpge:boolean(i2l:long(var_5_14F:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                    looporswitchbreak()
                                }
                                
                                storeelement:byte(var_3_7A:byte[], var_5_14F:int, var_4_146:byte)
                                inc:int(var_5_14F, ldc:int(1))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_156:int, ldc:int(524288)), ldc:int(0))) {
                        invokestatic:void(System::arraycopy, getfield:byte[][expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-18431), ldc:int(17194)), var_3_7A:byte[][expected:Object], and:int(ldc:int(1843), ldc:int(-1844)), l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
                        looporswitchbreak()
                    }
                    
                    var_1_F5 = and:int(var_1_156:int, ldc:int(-439521943))
                }
            }
            else {
                var_4_E7 = and:int(ldc:int(6425), ldc:int(-6460))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_F5 = and:int(var_1_F5:int, ldc:int(1794728990))
                    }
                    else {
                        var_1_F5 = and:int(var_1_F5:int, ldc:int(-135825017))
                        
                        if (cmplt:boolean(i2l:long(var_4_E7:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:byte(var_3_7A:byte[], var_4_E7:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_E7:int))))
                            inc:int(var_4_E7, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F5:int, ldc:int(268435456)), ldc:int(0))) {
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
        var_8_22B : int
        var_10_23A : long
        var_8_27F : int
        var_12_286 : byte[]
        var_8_340 : int
        var_13_2DB : int
        var_14_330 : long
        var_14_326 : long
        
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
        var_8_63 = and:int(ldc:int(-1692667724), ldc:int(-1646664897))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0492)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-48895067))
            goto(Label_0409)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(54064166))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(16659), ldc:int(16657)))))
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-286371647))
            goto(Label_0492)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-80054296))
            goto(Label_0409)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1644276394))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(429778039))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0409)
                    }
                }
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1234639109))
            goto(Label_0492)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1919833048))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(4384), ldc:int(4387)))))
        }
        
        Label_0409:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(711517885))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(925794880))
                goto(Label_0288)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-193984786))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(459138077))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(133), ldc:int(17478)))))
            }
        }
        
        Label_0492:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0409)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1836090963))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1095153043))
            goto(Label_0107)
        }
        
        var_8_22B = and:int(var_8_63:int, ldc:int(-1082531246))
        var_10_23A = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_23A:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_22B:int, ldc:int(16384)), ldc:int(0))) {
                    var_8_27F = and:int(var_8_22B:int, ldc:int(327233906))
                }
                else {
                    var_8_27F = and:int(var_8_22B:int, ldc:int(1039725841))
                    
                    if (cmpne:boolean(p0:byte[], aconstnull:byte[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:byte[])), var_10_23A:long)) {
                            var_12_286 = p0:byte[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_27F:int, ldc:int(512)), ldc:int(0))) {
                    var_8_27F = and:int(var_8_27F:int, ldc:int(522186905))
                    var_12_286 = newarray:byte[](byte.class, l2i:int(var_10_23A:long))
                    looporswitchbreak()
                }
                
                var_8_22B = and:int(var_8_27F:int, ldc:int(1031268663))
            }
            
            var_8_340 = and:int(var_8_27F:int, ldc:int(-1614815149))
            var_13_2DB = and:int(ldc:int(13120), ldc:int(-13123))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(16)), ldc:int(0))) {
                        var_8_340 = and:int(var_8_340:int, ldc:int(1457981515))
                    }
                    else {
                        var_8_340 = and:int(var_8_340:int, ldc:int(-1084430341))
                        
                        if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                            var_14_330 = p1:long
                            goto(Label_0973)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_340:int, ldc:int(524288)), ldc:int(0))) {
                        var_14_326 = p1:long
                        
                        while (cmplt:boolean(var_14_326:long, p2:long)) {
                            storeelement:byte(var_12_286:byte[], postincrement:int(1, var_13_2DB:int), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_326:long)))
                            var_14_326 = add:long(var_14_326:long, p3:long)
                        }
                        
                        return:byte[](var_12_286:byte[])
                    }
                    
                    var_8_340 = and:int(var_8_340:int, ldc:int(691332355))
                }
            }
            else {
                var_14_330 = p1:long
            }
            
            Label_0818:
            
            while (cmpne:boolean(and:int(var_8_340:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0973)
                }
                
                if (cmpne:boolean(and:int(var_8_340:int, ldc:int(1024)), ldc:int(0))) {
                    var_8_340 = and:int(var_8_340:int, ldc:int(930663045))
                    goto(Label_0882)
                }
                
                var_8_340 = and:int(var_8_340:int, ldc:int(-75961251))
                
                if (cmpge:boolean(var_14_330:long, p2:long)) {
                    goto(Label_0882)
                }
                
                storeelement:byte(var_12_286:byte[], postincrement:int(1, var_13_2DB:int), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_330:long)))
                var_14_330 = add:long(var_14_330:long, p3:long)
            }
            
            var_8_340 = and:int(var_8_340:int, ldc:int(-1674665324))
            goto(Label_1015)
            Label_0973:
            
            while (cmpne:boolean(and:int(var_8_340:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0882)
                }
                
                if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0818)
                }
                
                var_8_340 = and:int(var_8_340:int, ldc:int(-1187124301))
                
                if (cmpge:boolean(var_14_330:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:byte(var_12_286:byte[], postincrement:int(1, var_13_2DB:int), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(18137), ldc:int(-26330))))
                var_14_330 = add:long(var_14_330:long, p3:long)
            }
            
            goto(Label_1015)
            Label_0882:
            
            if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(8)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0973)
                }
                
                if (cmpne:boolean(and:int(var_8_340:int, ldc:int(1024)), ldc:int(0))) {
                    var_8_340 = and:int(var_8_340:int, ldc:int(409204259))
                    goto(Label_0818)
                }
                
                return:byte[](var_12_286:byte[])
            }
            
            Label_1015:
            
            if (cmpeq:boolean(and:int(var_8_340:int, ldc:int(1048576)), ldc:int(0))) {
                var_8_340 = and:int(var_8_340:int, ldc:int(-450772145))
                goto(Label_0973)
            }
            
            if (cmpne:boolean(and:int(var_8_340:int, ldc:int(262144)), ldc:int(0))) {
                var_8_340 = and:int(var_8_340:int, ldc:int(-922683129))
                goto(Label_0882)
            }
            
            if (cmpne:boolean(and:int(var_8_340:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0818)
            }
            
            return:byte[](var_12_286:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe() {
        var_1_61 : int
        var_1_13D : int
        var_3_7A : short[]
        var_4_125 : short
        var_5_12E : int
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
        var_1_61 = and:int(ldc:int(-1476668168), ldc:int(-282864227))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_13D = and:int(var_1_61:int, ldc:int(-675548676))
            var_3_7A = newarray:short[](short.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_13D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_13D = and:int(var_1_13D:int, ldc:int(-4194370))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_4_125 = i2s:short(loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(6155), ldc:int(-6252))))
                        var_5_12E = and:int(ldc:int(-28093), ldc:int(19884))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_13D:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_13D = and:int(var_1_13D:int, ldc:int(543322601))
                            }
                            else {
                                var_1_13D = and:int(var_1_13D:int, ldc:int(-1888101447))
                                
                                if (cmplt:boolean(i2l:long(var_5_12E:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                    storeelement:short(var_3_7A:short[], var_5_12E:int, var_4_125:short)
                                    inc:int(var_5_12E, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_13D:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_13D = and:int(var_1_13D:int, ldc:int(442826151))
                        }
                        
                        return:short[](var_3_7A:short[])
                    }
                } while (cmpne:boolean(and:int(var_1_13D:int, ldc:int(2048)), ldc:int(0)))
                
                var_4_AD = and:int(ldc:int(-11357), ldc:int(11340))
                
                while (cmplt:boolean(i2l:long(var_4_AD:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    storeelement:short(var_3_7A:short[], var_4_AD:int, i2s:short(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_AD:int)))
                    inc:int(var_4_AD, ldc:int(1))
                }
            }
            else {
                var_4_C3 = and:int(ldc:int(13731), ldc:int(-14316))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_13D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_13D = and:int(var_1_13D:int, ldc:int(-1318940891))
                    }
                    else {
                        var_1_13D = and:int(var_1_13D:int, ldc:int(-412367400))
                        
                        if (cmplt:boolean(i2l:long(var_4_C3:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:short(var_3_7A:short[], var_4_C3:int, i2s:short(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_C3:int)))))
                            inc:int(var_4_C3, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_13D:int, ldc:int(268435456)), ldc:int(0))) {
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
        var_8_230 : int
        var_10_1F8 : long
        var_12_237 : short[]
        var_8_2DA : int
        var_13_28C : int
        var_14_2C9 : long
        var_14_2BF : long
        
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
        var_8_63 = and:int(ldc:int(2119781787), ldc:int(-564259382))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0208)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1272045631))
            goto(Label_0448)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(8225), ldc:int(8227)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(246519777))
        Label_0208:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0448)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-100751538))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0378)
                    }
                }
            }
        }
        
        Label_0258:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0448)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2144725264))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0208)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-348895946))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(24727), ldc:int(1859)))))
        }
        
        Label_0378:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-373132998))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0258)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0208)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(682016062))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-101814277))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(16406), ldc:int(269)))))
            }
        }
        
        Label_0448:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_230 = and:int(var_8_63:int, ldc:int(2136854523))
        var_10_1F8 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_1F8:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_230:int, ldc:int(256)), ldc:int(0))) {
                    var_8_230 = and:int(var_8_230:int, ldc:int(1857439041))
                }
                else {
                    var_8_230 = and:int(var_8_230:int, ldc:int(1498322943))
                    
                    if (cmpne:boolean(p0:short[], aconstnull:short[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:short[])), var_10_1F8:long)) {
                            var_12_237 = p0:short[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_230:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_230 = and:int(var_8_230:int, ldc:int(-8751301))
                    var_12_237 = newarray:short[](short.class, l2i:int(var_10_1F8:long))
                    looporswitchbreak()
                }
            }
            
            var_8_2DA = and:int(var_8_230:int, ldc:int(-84445221))
            var_13_28C = and:int(ldc:int(340), ldc:int(-341))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(64)), ldc:int(0))) {
                        var_8_2DA = and:int(var_8_2DA:int, ldc:int(2119605546))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_14_2C9 = p1:long
                        goto(Label_0887)
                    }
                } while (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(16777216)), ldc:int(0)))
                
                var_14_2BF = p1:long
                
                while (cmplt:boolean(var_14_2BF:long, p2:long)) {
                    storeelement:short(var_12_237:short[], postincrement:int(1, var_13_28C:int), i2s:short(and:int(and:int(ldc:int(12799), ldc:int(255)), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_2BF:long)))))
                    var_14_2BF = add:long(var_14_2BF:long, p3:long)
                }
                
                return:short[](var_12_237:short[])
            }
            
            var_14_2C9 = p1:long
            Label_0715:
            
            while (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0887)
                }
                
                if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_2DA = and:int(var_8_2DA:int, ldc:int(131610879))
                    goto(Label_0778)
                }
                
                var_8_2DA = and:int(var_8_2DA:int, ldc:int(-121158305))
                
                if (cmpge:boolean(var_14_2C9:long, p2:long)) {
                    goto(Label_0778)
                }
                
                storeelement:short(var_12_237:short[], postincrement:int(1, var_13_28C:int), i2s:short(and:int(and:int(ldc:int(13823), ldc:int(255)), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_2C9:long)))))
                var_14_2C9 = add:long(var_14_2C9:long, p3:long)
            }
            
            var_8_2DA = and:int(var_8_2DA:int, ldc:int(-1056606330))
            goto(Label_0950)
            Label_0887:
            
            while (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(64)), ldc:int(0))) {
                    var_8_2DA = and:int(var_8_2DA:int, ldc:int(-107992434))
                    goto(Label_0778)
                }
                
                if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0715)
                }
                
                var_8_2DA = and:int(var_8_2DA:int, ldc:int(1599834074))
                
                if (cmpge:boolean(var_14_2C9:long, p2:long)) {
                    goto(Label_0950)
                }
                
                storeelement:short(var_12_237:short[], postincrement:int(1, var_13_28C:int), i2s:short(and:int(and:int(ldc:int(4351), ldc:int(27391)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(10808), ldc:int(-11129))))))
                var_14_2C9 = add:long(var_14_2C9:long, p3:long)
            }
            
            var_8_2DA = and:int(var_8_2DA:int, ldc:int(-833862579))
            goto(Label_0950)
            Label_0778:
            
            if (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_2DA = and:int(var_8_2DA:int, ldc:int(-774570799))
                    goto(Label_0887)
                }
                
                if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(256)), ldc:int(0))) {
                    var_8_2DA = and:int(var_8_2DA:int, ldc:int(561229976))
                    goto(Label_0715)
                }
                
                return:short[](var_12_237:short[])
            }
            
            Label_0950:
            
            if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(256)), ldc:int(0))) {
                var_8_2DA = and:int(var_8_2DA:int, ldc:int(-2141660253))
                goto(Label_0887)
            }
            
            if (cmpne:boolean(and:int(var_8_2DA:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_2DA = and:int(var_8_2DA:int, ldc:int(-575787680))
                goto(Label_0778)
            }
            
            if (cmpeq:boolean(and:int(var_8_2DA:int, ldc:int(1024)), ldc:int(0))) {
                var_8_2DA = and:int(var_8_2DA:int, ldc:int(-1837960701))
                goto(Label_0715)
            }
            
            return:short[](var_12_237:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1() {
        var_1_61 : int
        var_1_132 : int
        var_3_7A : int[]
        var_4_11B : byte
        var_5_124 : int
        var_4_AE : int
        var_4_C4 : int
        
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
        var_1_61 = and:int(ldc:int(1772470331), ldc:int(2118103423))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_132 = and:int(var_1_61:int, ldc:int(-121650370))
            var_3_7A = newarray:int[](int.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_1_132:int, ldc:int(4)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(-653315329))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_4_11B = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(17511), ldc:int(-21992)))
                        var_5_124 = and:int(ldc:int(22310), ldc:int(-24359))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_132:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_132 = and:int(var_1_132:int, ldc:int(-197711618))
                                
                                if (cmplt:boolean(i2l:long(var_5_124:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                    storeelement:int(var_3_7A:int[], var_5_124:int, var_4_11B:byte[expected:int])
                                    inc:int(var_5_124, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_132:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_132 = and:int(var_1_132:int, ldc:int(-635506639))
                        }
                        
                        return:int[](var_3_7A:int[])
                    }
                } while (cmpeq:boolean(and:int(var_1_132:int, ldc:int(16)), ldc:int(0)))
                
                var_4_AE = and:int(ldc:int(-3423), ldc:int(3406))
                
                while (cmplt:boolean(i2l:long(var_4_AE:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    storeelement:int(var_3_7A:int[], var_4_AE:int, loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_AE:int))
                    inc:int(var_4_AE, ldc:int(1))
                }
            }
            else {
                var_4_C4 = and:int(ldc:int(-511), ldc:int(378))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_132:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(1795681343))
                        
                        if (cmplt:boolean(i2l:long(var_4_C4:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:int(var_3_7A:int[], var_4_C4:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_C4:int))))
                            inc:int(var_4_C4, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_132:int, ldc:int(256)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:int[](var_3_7A:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1(int[] p0, long p1, long p2, long p3) {
        var_8_79 : int
        var_8_27E : int
        var_10_245 : long
        var_12_285 : int[]
        var_8_335 : int
        var_13_2DA : int
        var_14_324 : long
        var_14_31A : long
        
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
        var_8_79 = and:int(ldc:int(322399133), ldc:int(-2040304355))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0217)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(131072)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-1515413897))
            goto(Label_0481)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2048)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(148496604))
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(16)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(2176), ldc:int(2178)))))
        }
        
        var_8_79 = and:int(var_8_79:int, ldc:int(1024170636))
        Label_0217:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0481)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(16)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(2038804247))
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_79 = and:int(var_8_79:int, ldc:int(-1437085825))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0398)
                    }
                }
            }
        }
        
        Label_0277:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(952636794))
            goto(Label_0481)
        }
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0217)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(8)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(-983198944))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(29698), ldc:int(29697)))))
        }
        
        Label_0398:
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(-1533694661))
                goto(Label_0277)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(214510839))
                goto(Label_0217)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(65536)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(1094447408))
                goto(Label_0107)
            }
            
            var_8_79 = and:int(var_8_79:int, ldc:int(131591007))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(8712), ldc:int(8716)))))
            }
        }
        
        Label_0481:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(193034402))
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(16384)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-840838025))
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(773110095))
            goto(Label_0217)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(8)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-197341461))
            goto(Label_0107)
        }
        
        var_8_27E = and:int(var_8_79:int, ldc:int(288313343))
        var_10_245 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_245:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(256)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(1956233888))
                }
                else {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(435117981))
                    
                    if (cmpne:boolean(p0:int[], aconstnull:int[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:int[])), var_10_245:long)) {
                            var_12_285 = p0:int[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(4)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(905661853))
                    var_12_285 = newarray:int[](int.class, l2i:int(var_10_245:long))
                    looporswitchbreak()
                }
            }
            
            var_8_335 = and:int(var_8_27E:int, ldc:int(-580423715))
            var_13_2DA = and:int(ldc:int(5763), ldc:int(-5764))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_335:int, ldc:int(65536)), ldc:int(0))) {
                        var_8_335 = and:int(var_8_335:int, ldc:int(1622921181))
                        
                        if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                            var_14_324 = p1:long
                            goto(Label_0945)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(1024)), ldc:int(0))) {
                        var_14_31A = p1:long
                        
                        while (cmplt:boolean(var_14_31A:long, p2:long)) {
                            storeelement:int(var_12_285:int[], postincrement:int(1, var_13_2DA:int), and:int(and:int(ldc:int(9983), ldc:int(255)), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_31A:long))))
                            var_14_31A = add:long(var_14_31A:long, p3:long)
                        }
                        
                        return:int[](var_12_285:int[])
                    }
                    
                    var_8_335 = and:int(var_8_335:int, ldc:int(-218282813))
                }
            }
            else {
                var_14_324 = p1:long
            }
            
            Label_0806:
            
            while (cmpne:boolean(and:int(var_8_335:int, ldc:int(4)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_335:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0945)
                }
                
                if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0859)
                }
                
                var_8_335 = and:int(var_8_335:int, ldc:int(-166761123))
                
                if (cmpge:boolean(var_14_324:long, p2:long)) {
                    goto(Label_0859)
                }
                
                storeelement:int(var_12_285:int[], postincrement:int(1, var_13_2DA:int), and:int(and:int(ldc:int(4351), ldc:int(1023)), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_324:long))))
                var_14_324 = add:long(var_14_324:long, p3:long)
            }
            
            var_8_335 = and:int(var_8_335:int, ldc:int(402487992))
            goto(Label_0998)
            Label_0945:
            
            while (cmpeq:boolean(and:int(var_8_335:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0859)
                }
                
                if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(16384)), ldc:int(0))) {
                    var_8_335 = and:int(var_8_335:int, ldc:int(377249215))
                    goto(Label_0806)
                }
                
                var_8_335 = and:int(var_8_335:int, ldc:int(620493181))
                
                if (cmpge:boolean(var_14_324:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:int(var_12_285:int[], postincrement:int(1, var_13_2DA:int), and:int(xor:int(ldc:int(-8065), ldc:int(-8064)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(30242), ldc:int(-30372)))))
                var_14_324 = add:long(var_14_324:long, p3:long)
            }
            
            goto(Label_0998)
            Label_0859:
            
            if (cmpne:boolean(and:int(var_8_335:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0945)
                }
                
                if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(32768)), ldc:int(0))) {
                    return:int[](var_12_285:int[])
                }
                
                goto(Label_0806)
            }
            
            Label_0998:
            
            if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(16)), ldc:int(0))) {
                var_8_335 = and:int(var_8_335:int, ldc:int(-308741920))
                goto(Label_0945)
            }
            
            if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0859)
            }
            
            if (cmpeq:boolean(and:int(var_8_335:int, ldc:int(131072)), ldc:int(0))) {
                var_8_335 = and:int(var_8_335:int, ldc:int(1175198952))
                goto(Label_0806)
            }
            
            return:int[](var_12_285:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f() {
        var_1_61 : int
        var_1_145 : int
        var_3_7A : long[]
        var_4_12D : byte
        var_5_136 : int
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
        var_1_61 = and:int(ldc:int(-2083258430), ldc:int(-1696333844))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_145 = and:int(var_1_61:int, ldc:int(-82449))
            var_3_7A = newarray:long[](long.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_145:int, ldc:int(16)), ldc:int(0))) {
                        var_1_145 = and:int(var_1_145:int, ldc:int(1533049430))
                    }
                    else {
                        var_1_145 = and:int(var_1_145:int, ldc:int(-1965574688))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_4_12D = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(19056), ldc:int(-19059)))
                        var_5_136 = and:int(ldc:int(4545), ldc:int(-4546))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_145:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_145 = and:int(var_1_145:int, ldc:int(1738440067))
                            }
                            else {
                                var_1_145 = and:int(var_1_145:int, ldc:int(-1359527985))
                                
                                if (cmplt:boolean(i2l:long(var_5_136:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                    storeelement:long(var_3_7A:long[], var_5_136:int, i2l:long(var_4_12D:byte[expected:int]))
                                    inc:int(var_5_136, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_145:int, ldc:int(4194304)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_145 = and:int(var_1_145:int, ldc:int(-659365169))
                        }
                        
                        return:long[](var_3_7A:long[])
                    }
                } while (cmpne:boolean(and:int(var_1_145:int, ldc:int(2097152)), ldc:int(0)))
                
                var_4_B7 = and:int(ldc:int(-5941), ldc:int(1844))
                
                while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    storeelement:long(var_3_7A:long[], var_4_B7:int, i2l:long(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_B7:int)))
                    inc:int(var_4_B7, ldc:int(1))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(482), ldc:int(-2531))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_145 = and:int(var_1_145:int, ldc:int(-219512861))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:long(var_3_7A:long[], var_4_CD:int, i2l:long(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_CD:int)))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_145 = and:int(var_1_145:int, ldc:int(429471825))
                }
            }
            
            return:long[](var_3_7A:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f(long[] p0, long p1, long p2, long p3) {
        var_8_F0 : int
        var_8_236 : int
        var_10_245 : long
        var_8_289 : int
        var_12_290 : long[]
        var_8_348 : int
        var_13_2E5 : int
        var_14_32F : long
        var_14_325 : long
        
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
        var_8_F0 = and:int(ldc:int(-1361997494), ldc:int(-322065414))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0503)
        }
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0410)
        }
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(131072)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(563357988))
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(16384)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(4230), ldc:int(2651)))))
        }
        
        var_8_F0 = and:int(var_8_F0:int, ldc:int(-1634893508))
        Label_0206:
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(16384)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(-782105862))
            goto(Label_0503)
        }
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(347189650))
            goto(Label_0410)
        }
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_F0 = and:int(var_8_F0:int, ldc:int(-1077741205))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0410)
                    }
                }
            }
        }
        
        Label_0277:
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0503)
        }
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(1851864049))
        }
        else {
            if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(128)), ldc:int(0))) {
                var_8_F0 = and:int(var_8_F0:int, ldc:int(1448903811))
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(32)), ldc:int(0))) {
                var_8_F0 = and:int(var_8_F0:int, ldc:int(1797412885))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(145), ldc:int(146)))))
        }
        
        Label_0410:
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(32)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(1515201911))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(67108864)), ldc:int(0))) {
                var_8_F0 = and:int(var_8_F0:int, ldc:int(-1579230820))
                goto(Label_0277)
            }
            
            if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(131072)), ldc:int(0))) {
                var_8_F0 = and:int(var_8_F0:int, ldc:int(-353659128))
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_F0 = and:int(var_8_F0:int, ldc:int(126715070))
                goto(Label_0107)
            }
            
            var_8_F0 = and:int(var_8_F0:int, ldc:int(-1650670349))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(550), ldc:int(8332)))))
            }
        }
        
        Label_0503:
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(2)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(-30617784))
            goto(Label_0410)
        }
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_8_F0:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_8_F0:int, ldc:int(524288)), ldc:int(0))) {
            var_8_F0 = and:int(var_8_F0:int, ldc:int(-1701769357))
            goto(Label_0107)
        }
        
        var_8_236 = and:int(var_8_F0:int, ldc:int(-1114397238))
        var_10_245 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_245:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_236:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_289 = and:int(var_8_236:int, ldc:int(-1880835433))
                }
                else {
                    var_8_289 = and:int(var_8_236:int, ldc:int(-308313493))
                    
                    if (cmpne:boolean(p0:long[], aconstnull:long[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:long[])), var_10_245:long)) {
                            var_12_290 = p0:long[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_289:int, ldc:int(2)), ldc:int(0))) {
                    var_8_289 = and:int(var_8_289:int, ldc:int(-1916114829))
                    var_12_290 = newarray:long[](long.class, l2i:int(var_10_245:long))
                    looporswitchbreak()
                }
                
                var_8_236 = and:int(var_8_289:int, ldc:int(1862849924))
            }
            
            var_8_348 = and:int(var_8_289:int, ldc:int(-1110905629))
            var_13_2E5 = and:int(ldc:int(8931), ldc:int(-13028))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_8_348:int, ldc:int(524288)), ldc:int(0))) {
                        var_8_348 = and:int(var_8_348:int, ldc:int(510662531))
                    }
                    else {
                        var_8_348 = and:int(var_8_348:int, ldc:int(-270861337))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_14_32F = p1:long
                        goto(Label_0980)
                    }
                } while (cmpeq:boolean(and:int(var_8_348:int, ldc:int(8388608)), ldc:int(0)))
                
                var_14_325 = p1:long
                
                while (cmplt:boolean(var_14_325:long, p2:long)) {
                    storeelement:long(var_12_290:long[], postincrement:int(1, var_13_2E5:int), i2l:long(and:int(xor:int(ldc:int(17628), ldc:int(17443)), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_325:long)))))
                    var_14_325 = add:long(var_14_325:long, p3:long)
                }
                
                return:long[](var_12_290:long[])
            }
            
            var_14_32F = p1:long
            Label_0817:
            
            while (cmpeq:boolean(and:int(var_8_348:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_348:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_348 = and:int(var_8_348:int, ldc:int(-234520155))
                    goto(Label_0980)
                }
                
                if (cmpne:boolean(and:int(var_8_348:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0870)
                }
                
                var_8_348 = and:int(var_8_348:int, ldc:int(-1629331473))
                
                if (cmpge:boolean(var_14_32F:long, p2:long)) {
                    goto(Label_0870)
                }
                
                storeelement:long(var_12_290:long[], postincrement:int(1, var_13_2E5:int), i2l:long(and:int(and:int(ldc:int(4351), ldc:int(25087)), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_32F:long)))))
                var_14_32F = add:long(var_14_32F:long, p3:long)
            }
            
            goto(Label_1045)
            Label_0980:
            
            while (cmpeq:boolean(and:int(var_8_348:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_348:int, ldc:int(16384)), ldc:int(0))) {
                    var_8_348 = and:int(var_8_348:int, ldc:int(-556160016))
                    goto(Label_0870)
                }
                
                if (cmpeq:boolean(and:int(var_8_348:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                var_8_348 = and:int(var_8_348:int, ldc:int(-39832633))
                
                if (cmpge:boolean(var_14_32F:long, p2:long)) {
                    goto(Label_1045)
                }
                
                storeelement:long(var_12_290:long[], postincrement:int(1, var_13_2E5:int), i2l:long(and:int(xor:int(ldc:int(16550), ldc:int(16473)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-13964), ldc:int(5259))))))
                var_14_32F = add:long(var_14_32F:long, p3:long)
            }
            
            var_8_348 = and:int(var_8_348:int, ldc:int(-964291646))
            goto(Label_1045)
            Label_0870:
            
            if (cmpne:boolean(and:int(var_8_348:int, ldc:int(16384)), ldc:int(0))) {
                var_8_348 = and:int(var_8_348:int, ldc:int(1209812109))
            }
            else {
                if (cmpne:boolean(and:int(var_8_348:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0980)
                }
                
                if (cmpeq:boolean(and:int(var_8_348:int, ldc:int(2)), ldc:int(0))) {
                    var_8_348 = and:int(var_8_348:int, ldc:int(-1736816764))
                    goto(Label_0817)
                }
                
                return:long[](var_12_290:long[])
            }
            
            Label_1045:
            
            if (cmpne:boolean(and:int(var_8_348:int, ldc:int(131072)), ldc:int(0))) {
                var_8_348 = and:int(var_8_348:int, ldc:int(1595724654))
                goto(Label_0980)
            }
            
            if (cmpne:boolean(and:int(var_8_348:int, ldc:int(32)), ldc:int(0))) {
                var_8_348 = and:int(var_8_348:int, ldc:int(399398554))
                goto(Label_0870)
            }
            
            if (cmpne:boolean(and:int(var_8_348:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0817)
            }
            
            return:long[](var_12_290:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a() {
        var_1_61 : int
        var_1_146 : int
        var_3_7A : float[]
        var_4_12E : byte
        var_5_137 : int
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
        var_1_61 = and:int(ldc:int(822548389), ldc:int(2014301679))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_146 = and:int(var_1_61:int, ldc:int(-1335638593))
            var_3_7A = newarray:float[](float.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_146 = and:int(var_1_146:int, ldc:int(-1687995295))
                    }
                    else {
                        var_1_146 = and:int(var_1_146:int, ldc:int(-1218984465))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_4_12E = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-11526), ldc:int(11525)))
                        var_5_137 = and:int(ldc:int(15873), ldc:int(-15874))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_146:int, ldc:int(128)), ldc:int(0))) {
                                var_1_146 = and:int(var_1_146:int, ldc:int(-1106526225))
                                
                                if (cmplt:boolean(i2l:long(var_5_137:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                    storeelement:float(var_3_7A:float[], var_5_137:int, i2f:float(var_4_12E:byte[expected:int]))
                                    inc:int(var_5_137, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_146:int, ldc:int(536870912)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:float[](var_3_7A:float[])
                    }
                } while (cmpeq:boolean(and:int(var_1_146:int, ldc:int(1)), ldc:int(0)))
                
                var_4_B6 = and:int(ldc:int(15136), ldc:int(-15137))
                
                while (cmplt:boolean(i2l:long(var_4_B6:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    storeelement:float(var_3_7A:float[], var_4_B6:int, i2f:float(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_B6:int)))
                    inc:int(var_4_B6, ldc:int(1))
                }
            }
            else {
                var_4_CC = and:int(ldc:int(-31034), ldc:int(31001))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_146:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_146 = and:int(var_1_146:int, ldc:int(2045246893))
                        
                        if (cmplt:boolean(i2l:long(var_4_CC:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:float(var_3_7A:float[], var_4_CC:int, i2f:float(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_CC:int)))))
                            inc:int(var_4_CC, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_146 = and:int(var_1_146:int, ldc:int(1534686149))
                }
            }
            
            return:float[](var_3_7A:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a(float[] p0, long p1, long p2, long p3) {
        var_8_79 : int
        var_8_224 : int
        var_10_233 : long
        var_8_277 : int
        var_12_27E : float[]
        var_8_333 : int
        var_13_2D3 : int
        var_14_310 : long
        var_14_306 : long
        
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
        var_8_79 = and:int(ldc:int(-438102115), ldc:int(-262408513))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(131072)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-1316903224))
            goto(Label_0485)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(128)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-464506078))
            goto(Label_0412)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0289)
        }
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(512)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(18432), ldc:int(18434)))))
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0485)
        }
        
        if (cmpne:boolean(and:int(var_8_79:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-1837968177))
            goto(Label_0412)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(128)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-254011776))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(16)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(2048037151))
                goto(Label_0107)
            }
            
            var_8_79 = and:int(var_8_79:int, ldc:int(1741642687))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0412)
                    }
                }
            }
        }
        
        Label_0289:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0485)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(65536)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-1777511129))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(4096)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(1134466409))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(-31611), ldc:int(-31610)))))
        }
        
        Label_0412:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(536870912)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-991298510))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(4194304)), ldc:int(0))) {
                var_8_79 = and:int(var_8_79:int, ldc:int(1936548129))
                goto(Label_0289)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_79 = and:int(var_8_79:int, ldc:int(-252208420))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(15), ldc:int(11)))))
            }
        }
        
        Label_0485:
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(-619728243))
            goto(Label_0412)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0289)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_8_79:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_79 = and:int(var_8_79:int, ldc:int(90112626))
            goto(Label_0107)
        }
        
        var_8_224 = and:int(var_8_79:int, ldc:int(2113886140))
        var_10_233 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_233:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_224:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_277 = and:int(var_8_224:int, ldc:int(673205453))
                }
                else {
                    var_8_277 = and:int(var_8_224:int, ldc:int(1901321180))
                    
                    if (cmpne:boolean(p0:float[], aconstnull:float[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:float[])), var_10_233:long)) {
                            var_12_27E = p0:float[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_277:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_277 = and:int(var_8_277:int, ldc:int(-294406497))
                    var_12_27E = newarray:float[](float.class, l2i:int(var_10_233:long))
                    looporswitchbreak()
                }
                
                var_8_224 = and:int(var_8_277:int, ldc:int(1906259097))
            }
            
            var_8_333 = and:int(var_8_277:int, ldc:int(2004614079))
            var_13_2D3 = and:int(ldc:int(-19512), ldc:int(17463))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(8192)), ldc:int(0))) {
                        var_8_333 = and:int(var_8_333:int, ldc:int(2113631165))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_14_310 = p1:long
                        goto(Label_0946)
                    }
                } while (cmpne:boolean(and:int(var_8_333:int, ldc:int(2)), ldc:int(0)))
                
                var_14_306 = p1:long
                
                while (cmplt:boolean(var_14_306:long, p2:long)) {
                    storeelement:float(var_12_27E:float[], postincrement:int(1, var_13_2D3:int), i2f:float(and:int(xor:int(ldc:int(-30506), ldc:int(-30679)), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_306:long)))))
                    var_14_306 = add:long(var_14_306:long, p3:long)
                }
                
                return:float[](var_12_27E:float[])
            }
            
            var_14_310 = p1:long
            Label_0786:
            
            while (cmpeq:boolean(and:int(var_8_333:int, ldc:int(268435456)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_333:int, ldc:int(2)), ldc:int(0))) {
                    var_8_333 = and:int(var_8_333:int, ldc:int(-43307459))
                    goto(Label_0946)
                }
                
                if (cmpne:boolean(and:int(var_8_333:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0848)
                }
                
                var_8_333 = and:int(var_8_333:int, ldc:int(-45411364))
                
                if (cmpge:boolean(var_14_310:long, p2:long)) {
                    goto(Label_0848)
                }
                
                storeelement:float(var_12_27E:float[], postincrement:int(1, var_13_2D3:int), i2f:float(and:int(xor:int(ldc:int(229), ldc:int(26)), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_310:long)))))
                var_14_310 = add:long(var_14_310:long, p3:long)
            }
            
            var_8_333 = and:int(var_8_333:int, ldc:int(-882937873))
            goto(Label_1021)
            Label_0946:
            
            while (cmpne:boolean(and:int(var_8_333:int, ldc:int(16)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(128)), ldc:int(0))) {
                    var_8_333 = and:int(var_8_333:int, ldc:int(460295440))
                    goto(Label_0848)
                }
                
                if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(131072)), ldc:int(0))) {
                    var_8_333 = and:int(var_8_333:int, ldc:int(923374289))
                    goto(Label_0786)
                }
                
                var_8_333 = and:int(var_8_333:int, ldc:int(1769411325))
                
                if (cmpge:boolean(var_14_310:long, p2:long)) {
                    goto(Label_1021)
                }
                
                storeelement:float(var_12_27E:float[], postincrement:int(1, var_13_2D3:int), i2f:float(and:int(xor:int(ldc:int(2102), ldc:int(2249)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(-2999), ldc:int(2870))))))
                var_14_310 = add:long(var_14_310:long, p3:long)
            }
            
            var_8_333 = and:int(var_8_333:int, ldc:int(-1384163149))
            goto(Label_1021)
            Label_0848:
            
            if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(16)), ldc:int(0))) {
                    var_8_333 = and:int(var_8_333:int, ldc:int(-547694112))
                    goto(Label_0946)
                }
                
                if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(2)), ldc:int(0))) {
                    return:float[](var_12_27E:float[])
                }
                
                goto(Label_0786)
            }
            
            Label_1021:
            
            if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0946)
            }
            
            if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0848)
            }
            
            if (cmpeq:boolean(and:int(var_8_333:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0786)
            }
            
            return:float[](var_12_27E:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7() {
        var_1_61 : int
        var_1_E4 : int
        var_3_7A : double[]
        var_1_145 : int
        var_4_12D : byte
        var_5_136 : int
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
        var_1_61 = and:int(ldc:int(1166671988), ldc:int(-7956302))
        
        if (cmple:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(1073741824L))) {
            var_1_E4 = and:int(var_1_61:int, ldc:int(1038969521))
            var_3_7A = newarray:double[](double.class, l2i:int(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_E4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_145 = and:int(var_1_E4:int, ldc:int(2033096453))
                    }
                    else {
                        var_1_145 = and:int(var_1_E4:int, ldc:int(-1881052681))
                        
                        if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                            var_4_12D = loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(5065), ldc:int(-5066)))
                            var_5_136 = and:int(ldc:int(4784), ldc:int(-4788))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_145:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_145 = and:int(var_1_145:int, ldc:int(971314419))
                                }
                                else {
                                    var_1_145 = and:int(var_1_145:int, ldc:int(528936575))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_136:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                                        storeelement:double(var_3_7A:double[], var_5_136:int, i2d:double(var_4_12D:byte[expected:int]))
                                        inc:int(var_5_136, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(2048)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_145:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_BF = and:int(ldc:int(-22451), ldc:int(5938))
                        
                        while (cmplt:boolean(i2l:long(var_4_BF:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:double(var_3_7A:double[], var_4_BF:int, i2d:double(loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_4_BF:int)))
                            inc:int(var_4_BF, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_145:int, ldc:int(1109931046))
                }
            }
            else {
                var_4_D5 = and:int(ldc:int(-30837), ldc:int(14388))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_E4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_E4 = and:int(var_1_E4:int, ldc:int(-1376341889))
                        
                        if (cmplt:boolean(i2l:long(var_4_D5:int), getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            storeelement:double(var_3_7A:double[], var_4_D5:int, i2d:double(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), i2l:long(var_4_D5:int)))))
                            inc:int(var_4_D5, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(16777216)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:double[](var_3_7A:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7(double[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_1F6 : int
        var_10_205 : long
        var_8_249 : int
        var_12_250 : double[]
        var_8_2FD : int
        var_13_2A5 : int
        var_14_2ED : long
        var_14_2E3 : long
        
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
        var_8_63 = and:int(ldc:int(1770294854), ldc:int(701290319))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                goto(Label_0219)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0460)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-807035250))
            goto(Label_0389)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(893713683))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(10275), ldc:int(10273)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-1044908431))
        Label_0219:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0460)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1108703417))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0389)
                    }
                }
            }
        }
        
        Label_0269:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0460)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(995633239))
                goto(Label_0219)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1955119871))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(834), ldc:int(833)))))
        }
        
        Label_0389:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0269)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(873537321))
                goto(Label_0219)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(268009332))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(2147213159))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(3092), ldc:int(20518)))))
            }
        }
        
        Label_0460:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0269)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0219)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_1F6 = and:int(var_8_63:int, ldc:int(2106847055))
        var_10_205 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_205:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_1F6:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_249 = and:int(var_8_1F6:int, ldc:int(-1123088988))
                }
                else {
                    var_8_249 = and:int(var_8_1F6:int, ldc:int(-71835834))
                    
                    if (cmpne:boolean(p0:double[], aconstnull:double[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:double[])), var_10_205:long)) {
                            var_12_250 = p0:double[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_249:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_249 = and:int(var_8_249:int, ldc:int(964872039))
                    var_12_250 = newarray:double[](double.class, l2i:int(var_10_205:long))
                    looporswitchbreak()
                }
                
                var_8_1F6 = and:int(var_8_249:int, ldc:int(-2113712251))
            }
            
            var_8_2FD = and:int(var_8_249:int, ldc:int(-372185370))
            var_13_2A5 = and:int(ldc:int(-20048), ldc:int(20045))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_8_2FD = and:int(var_8_2FD:int, ldc:int(-879141754))
                    }
                    else {
                        var_8_2FD = and:int(var_8_2FD:int, ldc:int(-1342900657))
                        
                        if (logicalnot:boolean(getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))) {
                            loopcontinue()
                        }
                        
                        var_14_2ED = p1:long
                        goto(Label_0924)
                    }
                } while (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(16777216)), ldc:int(0)))
                
                var_14_2E3 = p1:long
                
                while (cmplt:boolean(var_14_2E3:long, p2:long)) {
                    storeelement:double(var_12_250:double[], postincrement:int(1, var_13_2A5:int), i2d:double(and:int(and:int(ldc:int(16639), ldc:int(1279)), loadelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(var_14_2E3:long)))))
                    var_14_2E3 = add:long(var_14_2E3:long, p3:long)
                }
                
                return:double[](var_12_250:double[])
            }
            
            var_14_2ED = p1:long
            Label_0751:
            
            while (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_2FD = and:int(var_8_2FD:int, ldc:int(1215059556))
                    goto(Label_0924)
                }
                
                if (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0814)
                }
                
                var_8_2FD = and:int(var_8_2FD:int, ldc:int(700817238))
                
                if (cmpge:boolean(var_14_2ED:long, p2:long)) {
                    goto(Label_0814)
                }
                
                storeelement:double(var_12_250:double[], postincrement:int(1, var_13_2A5:int), i2d:double(and:int(xor:int(ldc:int(642), ldc:int(637)), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), var_14_2ED:long)))))
                var_14_2ED = add:long(var_14_2ED:long, p3:long)
            }
            
            var_8_2FD = and:int(var_8_2FD:int, ldc:int(1741492931))
            goto(Label_0988)
            Label_0924:
            
            while (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_2FD = and:int(var_8_2FD:int, ldc:int(742383787))
                    goto(Label_0814)
                }
                
                if (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0751)
                }
                
                var_8_2FD = and:int(var_8_2FD:int, ldc:int(2141513599))
                
                if (cmpge:boolean(var_14_2ED:long, p2:long)) {
                    goto(Label_0988)
                }
                
                storeelement:double(var_12_250:double[], postincrement:int(1, var_13_2A5:int), i2d:double(and:int(and:int(ldc:int(19711), ldc:int(8447)), loadelement:byte[expected:int](getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), and:int(ldc:int(25810), ldc:int(-26067))))))
                var_14_2ED = add:long(var_14_2ED:long, p3:long)
            }
            
            var_8_2FD = and:int(var_8_2FD:int, ldc:int(-1279414827))
            goto(Label_0988)
            Label_0814:
            
            if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_2FD = and:int(var_8_2FD:int, ldc:int(1250374628))
                    goto(Label_0924)
                }
                
                if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_2FD = and:int(var_8_2FD:int, ldc:int(-549049748))
                    goto(Label_0751)
                }
                
                return:double[](var_12_250:double[])
            }
            
            Label_0988:
            
            if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_2FD = and:int(var_8_2FD:int, ldc:int(-1299886596))
                goto(Label_0924)
            }
            
            if (cmpne:boolean(and:int(var_8_2FD:int, ldc:int(8192)), ldc:int(0))) {
                var_8_2FD = and:int(var_8_2FD:int, ldc:int(1525565531))
                goto(Label_0814)
            }
            
            if (cmpeq:boolean(and:int(var_8_2FD:int, ldc:int(2)), ldc:int(0))) {
                var_8_2FD = and:int(var_8_2FD:int, ldc:int(-687290195))
                goto(Label_0751)
            }
            
            return:double[](var_12_250:double[])
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
            invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, p1:Object[expected:Byte])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u62da\u40a9\u3bc9\u527a\u8389\u62da(long p0, boolean p1) {
        var_4_E1 : int
        var_4_9E : int
        stack_133_0 : byte[] [generated]
        stack_133_1 : int [generated]
        stack_133_2 : int [generated]
        stack_100_0 : Unsafe [generated]
        expr_CF : long [generated]
        stack_100_3 : int [generated]
        
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
            var_4_E1 = and:int(ldc:int(-1654843840), ldc:int(-1111153072))
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_4_E1:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_E1 = and:int(var_4_E1:int, ldc:int(-1185028665))
                        
                        if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                            athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(20557), ldc:int(5)))))
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_E1:int, ldc:int(32768)), ldc:int(0))) {
                        var_4_9E = and:int(var_4_E1:int, ldc:int(-104499477))
                        stack_133_0 = getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)
                        stack_133_1 = l2i:int(p0:long)
                        
                        if (cmpne:boolean(p1:boolean[expected:int], and:int(ldc:int(12329), ldc:int(16963)))) {
                            var_4_9E = and:int(var_4_9E:int, ldc:int(2071853036))
                            stack_133_2 = and:int[expected:byte](ldc:int(-23114), ldc:int(23113))
                        }
                        else {
                            stack_133_2 = xor:int[expected:byte](ldc:int(8211), ldc:int(8210))
                        }
                        
                        storeelement:byte(stack_133_0:byte[], stack_133_1:int, stack_133_2:byte)
                        looporswitchbreak()
                    }
                    
                    var_4_E1 = and:int(var_4_E1:int, ldc:int(-256625375))
                }
            }
            else {
                stack_100_0 = getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258)
                expr_CF = add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long)
                
                if (cmpne:boolean(p1:boolean[expected:int], xor:int(ldc:int(-28652), ldc:int(-28651)))) {
                    var_4_E1 = and:int(var_4_E1:int, ldc:int(2102206035))
                    stack_100_3 = and:int(ldc:int(19680), ldc:int(-19689))
                }
                else {
                    stack_100_3 = xor:int(ldc:int(2176), ldc:int(2177))
                }
                
                invokevirtual:void(Unsafe::putByte, stack_100_0:Unsafe, expr_CF:long, stack_100_3:byte)
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(520), ldc:int(525)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), p1:byte)
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), p1:byte)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc29a\ub70c\u7043\ubf56\u718f\u7330(long p0, short p1) {
        var_4_78 : int
        
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
            var_4_78 = and:int(ldc:int(-2008156702), ldc:int(-1879182408))
            
            if (cmpge:boolean(p1:short, ldc:short(0))) {
                if (cmple:boolean(p1:short[expected:int], and:int(ldc:int(7423), ldc:int(24831)))) {
                    goto(Label_0179)
                }
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_4_78:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_78 = and:int(var_4_78:int, ldc:int(434389460))
                goto(Label_0225)
            }
            
            if (cmpne:boolean(and:int(var_4_78:int, ldc:int(65536)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(513), ldc:int(4273)))))
            }
            
            Label_0179:
            
            if (cmpeq:boolean(and:int(var_4_78:int, ldc:int(16)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_78:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_78 = and:int(var_4_78:int, ldc:int(-2069468757))
                    goto(Label_0105)
                }
                
                var_4_78 = and:int(var_4_78:int, ldc:int(-2005947418))
                
                if (cmpne:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                    invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(p1:short[expected:int]))
                    return:void()
                }
            }
            
            Label_0225:
            
            if (cmpeq:boolean(and:int(var_4_78:int, ldc:int(65536)), ldc:int(0))) {
                var_4_78 = and:int(var_4_78:int, ldc:int(2038409976))
                goto(Label_0179)
            }
            
            if (cmpeq:boolean(and:int(var_4_78:int, ldc:int(32)), ldc:int(0))) {
                var_4_78 = and:int(var_4_78:int, ldc:int(1518531046))
                goto(Label_0105)
            }
            
            if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(5889), ldc:int(5892)))))
            }
            
            storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(p1:short[expected:int]))
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(-15296), ldc:int(-15291)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(and:int(and:int(ldc:int(28159), ldc:int(767)), p1:short[expected:int])))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(and:int(xor:int(ldc:int(-16215), ldc:int(-16298)), p1:short[expected:int])))
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(289), ldc:int(292)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(and:int(xor:int(ldc:int(22594), ldc:int(22717)), p1:int)))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(and:int(and:int(ldc:int(2815), ldc:int(16639)), p1:int)))
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), and:int(ldc:int(29), ldc:int(21765)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(l2i:int(and:long(ldc:long(255L), p1:long))))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(l2i:int(and:long(ldc:long(255L), p1:long))))
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(-15326), ldc:int(-15321)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(and:int(xor:int(ldc:int(9393), ldc:int(9294)), f2i:int(p1:float))))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(and:int(xor:int(ldc:int(16533), ldc:int(16490)), f2i:int(p1:float))))
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
            
            if (cmpeq:boolean(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), ldc:long(0L))) {
                if (getfield:boolean(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6), xor:int(ldc:int(82), ldc:int(87)))))
                }
                
                storeelement:byte(getfield:byte[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ud217\u120d\u0800\u6d69\u6ec6\u4ab3, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), l2i:int(p0:long), i2b:byte(l2i:int(and:long(ldc:long(255L), d2l:long(p1:double)))))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9), p0:long), i2b:byte(l2i:int(and:long(ldc:long(255L), d2l:long(p1:double)))))
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
            return:Object(invokevirtual:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::clone, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))
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
            return:Object(invokevirtual:byte[][expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9))
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
            return:Object(invokevirtual:Byte[expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ua068\u12cb\ubf56\u34df\u3776\u385b, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long))
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
            return:Object(invokevirtual:Short[expected:Object](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\u0800\u8413\u3bc9\u3776\u392e\u4492, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9, p0:long))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20D : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_FF_0 : byte[] [generated]
        stack_12B_0 : byte[] [generated]
        stack_220_0 : byte[] [generated]
        stack_2AF_0 : byte[] [generated]
        stack_2EA_0 : byte[] [generated]
        stack_340_0 : byte[] [generated]
        var_4_1F8 : int
        var_3_1FD : byte[]
        var_5_1FE : int
        var_0_216 : int
        expr_220 : byte [generated]
        stack_269_2 : byte [generated]
        stack_246_0 : byte [generated]
        expr_95 : int [generated]
        var_2_CB : byte[]
        expr_CF : int [generated]
        var_3_2D8 : byte[]
        var_5_2D9 : int
        expr_FF : int [generated]
        var_3_32E : byte[]
        var_5_32F : int
        expr_340 : byte [generated]
        var_3_137 : String
        stack_1F1_0 : String[] [generated]
        expr_149 : String[] [generated]
        
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
        var_0_20D = and:int(ldc:int(-236866114), ldc:int(-1319010849))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_CB_0 = stack_CD_0 = stack_FD_0 = stack_FF_0 = stack_12B_0 = stack_220_0 = stack_2AF_0 = stack_2EA_0 = stack_340_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("paW2pyE6fimfYNiC+00zzjjFXiI3xYRj1sWFOEcOp8s4f8aDtimgOADEvf6qn/6AATp+KSJ9X6G6w4Z6hv994yL/fWPWxYU4RWKf/oABOn4pIn1iVUr9gAV+NyrSTX6B4DjIWX8kpTrGATnGNyrSTX6B4TqAAOSD/ggy/qY6yDjG2AIrnIP+CDL+pznGJXx9hjJM3tgCK5yD/ggy/qY6ylh/yDn+UDIAAH/IOf5QMv6mOsg4xtgCKlh/yDn+UDL+pziBRiV8fYYyTjiBxTgmOsm3Ag==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1F8 = expr_6E:int
        var_3_1FD = newarray:byte[](byte.class, expr_6E:int)
        var_5_1FE = expr_6E:int
        Label_0512:
        
        while (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(512)), ldc:int(0))) {
            var_0_216 = and:int(var_0_20D:int, ldc:int(1374912155))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_220 = stack_269_2 = loadelement(stack_220_0, var_5_1FE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FE:int, ldc:int(1)), neg:int(var_4_1F8:int)), ldc:int(0))) {
                stack_269_2 = stack_246_0 = add:byte(expr_220:byte, loadelement:byte(var_3_1FD:byte[], add:int(var_5_1FE:int, ldc:int(1))))
                goto(Label_0598)
            }
            
            Label_0557:
            
            if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(8)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(-593549192))
            }
            else {
                var_0_216 = and:int(var_0_216:int, ldc:int(1005430173))
                stack_269_2 = stack_246_0 = add:byte(expr_220:byte, ldc:byte(1))
            }
            
            Label_0598:
            
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0557)
            }
            
            var_0_20D = and:int(var_0_216:int, ldc:int(-143409410))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, stack_269_2:byte)
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_CB_0 = stack_CD_0 = stack_FD_0 = stack_FF_0 = stack_12B_0 = stack_220_0 = stack_2AF_0 = stack_2EA_0 = stack_340_0 = var_3_1FD:byte[]
            goto(Label_0115)
        }
        
        var_0_20D = and:int(var_0_20D:int, ldc:int(929017255))
        Label_0655:
        
        while (cmpne:boolean(and:int(var_0_20D:int, ldc:int(16)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1216512833))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, xor:byte(loadelement:byte(stack_2AF_0:byte[], var_5_1FE:int), ldc:byte(99)))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_CB_0 = stack_CD_0 = stack_FD_0 = stack_FF_0 = stack_12B_0 = stack_220_0 = stack_2AF_0 = stack_2EA_0 = stack_340_0 = var_3_1FD:byte[]
            goto(Label_0154)
        }
        
        var_0_20D = and:int(var_0_20D:int, ldc:int(-1928907080))
        goto(Label_0512)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0260)
        }
        
        if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(65536)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1115967554))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_1F8 = expr_95:int
                var_3_1FD = newarray:byte[](byte.class, expr_95:int)
                var_5_1FE = expr_95:int
                goto(Label_0655)
            }
        }
        
        Label_0154:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1319638578))
            goto(Label_0260)
        }
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(1024)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1175586886))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_20D = and:int(var_0_20D:int, ldc:int(-470945829))
            var_2_CB = stack_CB_0:byte[]
            expr_CF = add:int(arraylength:int(stack_CD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CF:int, ldc:int(0))) {
                var_3_2D8 = newarray:byte[](byte.class, expr_CF:int)
                var_5_2D9 = expr_CF:int
                
                loop {
                    var_0_20D = and:int(var_0_20D:int, ldc:int(32865786))
                    var_5_2D9 = add:int(var_5_2D9:int, ldc:int(-1))
                    storeelement:byte(var_3_2D8:byte[], var_5_2D9:int, add:int(shl:int(loadelement:byte(stack_2EA_0:byte[], var_5_2D9:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_CB:byte[], add:int(var_5_2D9:int, and:int(ldc:int(4101), ldc:int(26699)))), ldc:int(3)), and:int(ldc:int(2623), ldc:int(8287)))))
                    
                    if (cmpne:boolean(var_5_2D9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_CB_0 = stack_CD_0 = stack_FD_0 = stack_FF_0 = stack_12B_0 = stack_220_0 = stack_2AF_0 = stack_2EA_0 = stack_340_0 = var_3_2D8:byte[]
            }
        }
        
        Label_0212:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1783514739))
        }
        else {
            if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0154)
            }
            
            if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_20D = and:int(var_0_20D:int, ldc:int(-973261316))
            expr_FF = arraylength:int(stack_FF_0:byte[])
            
            if (cmpne:boolean(expr_FF:int, ldc:int(0))) {
                var_3_32E = newarray:byte[](byte.class, expr_FF:int)
                var_5_32F = expr_FF:int
                
                loop {
                    var_0_20D = and:int(var_0_20D:int, ldc:int(795555000))
                    var_5_32F = add:int(var_5_32F:int, ldc:int(-1))
                    expr_340 = loadelement:byte(stack_340_0:byte[], var_5_32F:int)
                    storeelement:byte(var_3_32E:byte[], var_5_32F:int, add:int(or:int(and:int(shl:int(expr_340:byte, xor:int(ldc:int(74), ldc:int(78))), ldc:int(-16)), and:int(shr:int(expr_340:byte[expected:int], and:int(ldc:int(29708), ldc:int(2663))), ldc:int(15))), ldc:int(111)))
                    
                    if (cmpne:boolean(var_5_32F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_CB_0 = stack_CD_0 = stack_FD_0 = stack_FF_0 = stack_12B_0 = stack_220_0 = stack_2AF_0 = stack_2EA_0 = stack_340_0 = var_3_32E:byte[]
            }
        }
        
        Label_0260:
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_20D = and:int(var_0_20D:int, ldc:int(-1657362505))
            goto(Label_0212)
        }
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(1)), ldc:int(0))) {
            var_3_137 = initobject:String(String::<init>, stack_12B_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1F1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2070), ldc:int(17670)))
            expr_149 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8), ldc:int(14)))
            storeelement:String(expr_149:String[], and:int(ldc:int(19492), ldc:int(-19493)), invokevirtual:String[expected:String](String::substring, var_3_137:String, and:int(ldc:int(-32550), ldc:int(15909)), xor:int(ldc:int(259), ldc:int(286))))
            storeelement:String(expr_149:String[], xor:int(ldc:int(1059), ldc:int(1062)), invokevirtual:String[expected:String](String::substring, var_3_137:String, xor:int(ldc:int(4171), ldc:int(4182)), and:int(ldc:int(4932), ldc:int(114))))
            storeelement:String(expr_149:String[], and:int(ldc:int(16449), ldc:int(1025)), invokevirtual:String[expected:String](String::substring, var_3_137:String, xor:int(ldc:int(-31681), ldc:int(-31617)), and:int(ldc:int(12407), ldc:int(1150))))
            storeelement:String(expr_149:String[], and:int(ldc:int(22531), ldc:int(83)), invokevirtual:String[expected:String](String::substring, var_3_137:String, xor:int(ldc:int(16519), ldc:int(16625)), and:int(ldc:int(16638), ldc:int(1704))))
            storeelement:String(expr_149:String[], and:int(ldc:int(8330), ldc:int(327)), invokevirtual:String[expected:String](String::substring, var_3_137:String, and:int(ldc:int(6314), ldc:int(25004)), xor:int(ldc:int(2450), ldc:int(2392))))
            storeelement:String(expr_149:String[], and:int(ldc:int(196), ldc:int(4644)), invokevirtual:String[expected:String](String::substring, var_3_137:String, and:int(ldc:int(2267), ldc:int(17354)), xor:int(ldc:int(-14660), ldc:int(-14738))))
            putstatic:String[](\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9::\ufcaf\u8df4\u8258\ufe34\ud171\uc9f6, expr_149:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub32d\ub171\u3711\u76bc\u7c6b\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(1361249062), ldc:int(2015516460))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(1697002789))
        }
        else {
            var_3_653 = and:int(var_3_653:int, ldc:int(1107778494))
            var_5_8A = and:int(ldc:int(-3703), ldc:int(3702))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28650), ldc:int(19561)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_653:int, ldc:int(-435804179))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(7233), ldc:int(43)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-32736), ldc:int(-32735)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_E3:int, ldc:int(-821348444))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1339), ldc:int(24577)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-682910901))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-579103472))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-581351155))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(458865643))
                    }
                    else {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1369339711))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(419085038))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2123775881))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1656137511))
                            var_11_F4 = and:int(ldc:int(19650), ldc:int(-19659))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0561:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2112216321))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1880077468))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1743352997))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1943309915))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1040230612))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1094157117))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(701451387))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1426776617))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1716986609))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(2014290817))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-560726226))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0820:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1457718720))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-970334517))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1887717923))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(256)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-641241902))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1622579865))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1072271499))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(3), ldc:int(12489))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1903236996))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-2121066679))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(437879224))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1148740997))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-147429441))
                        var_11_F4 = and:int(ldc:int(-6595), ldc:int(6594))
                    }
                    
                    Label_1104:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1390316808))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1993330872))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(37134175))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(345156676))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-642063617))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-612954243))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1355)
                            }
                        }
                    }
                    
                    Label_1233:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1801853607))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-575992698))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1104)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0820)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1230905235))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1707487076))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1355:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2077034030))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-944306240))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1264624106))
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(-843063498))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1122563458))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(142493697))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1953285186))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(336573937))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1548247207))
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(256)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1402325487))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1178009380))
                        var_17_65E = add:int(var_16_122:int, and:int(ldc:int(1025), ldc:int(23049)))
                        looporswitchbreak()
                    }
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(1186681663))
                
                if (cmple:boolean(var_5_8A = var_17_65E:int, sub:int(var_6_91:int, xor:int(ldc:int(14848), ldc:int(14849))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(503932358))
            goto(Label_0108)
        }
    }
}
