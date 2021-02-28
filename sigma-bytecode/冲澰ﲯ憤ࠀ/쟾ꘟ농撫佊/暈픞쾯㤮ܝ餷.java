public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uf9c5\ud51e\ucfaf\u392e\u071d\u9937 {
    public void \uf9c5\ud51e\ucfaf\u392e\u071d\u9937() {
        var_3_80 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_4_88 : int
        var_5_12C : int
        
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
            invokespecial:Object(Object::<init>, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937)
            putfield:\u5140\u4ab3\u183a\ud523\u071d\u983f(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937, initobject:\u5140\u4ab3\u183a\ud523\u071d\u983f(\u5140\u4ab3\u183a\ud523\u071d\u983f::<init>, ldc:int(16), ldc:int(16), and:int[expected:boolean](ldc:int(-19258), ldc:int(19257))))
            var_3_80 = invokevirtual:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\uc31c\u97b7\u7049\ub19c\u56bd\u3e2a, getfield:\u5140\u4ab3\u183a\ud523\u071d\u983f(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937))
            var_4_88 = and:int(ldc:int(-16047), ldc:int(15906))
            
            while (cmplt:boolean(var_4_88:int, ldc:int(16))) {
                var_5_12C = and:int(ldc:int(-13990), ldc:int(12964))
                
                while (cmplt:boolean(var_5_12C:int, ldc:int(16))) {
                    if (cmpge:boolean(var_4_88:int, ldc:int(8))) {
                        invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u36d3\u59ec\u8640\u392e\u3dd3\ub32d, var_3_80:\u5db4\ud523\u7043\u6c52\u8308\u8350, var_5_12C:int, var_4_88:int, or:int(shl:int(f2i:int(mul:float(sub:float(ldc:float(1.0f), mul:float(div:float(i2f:float(var_5_12C:int), ldc:float(15.0f)), ldc:float(0.75f))), ldc:float(255.0f))), ldc:int(24)), ldc:int(16777215)))
                    }
                    else {
                        invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u36d3\u59ec\u8640\u392e\u3dd3\ub32d, var_3_80:\u5db4\ud523\u7043\u6c52\u8308\u8350, var_5_12C:int, var_4_88:int, ldc:int(-1308622593))
                    }
                    
                    inc:int(var_5_12C, ldc:int(1))
                }
                
                inc:int(var_4_88, ldc:int(1))
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u839e\ua562\u5f50\u4f4a\u3e2a\u983f, ldc:int(33985))
            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u0800\u6b5f\u4cd9\u0c95\u6cfe, getfield:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a](\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, xor:int(ldc:int(7272), ldc:int(2922)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, ldc:float(0.06666667f), ldc:float(0.06666667f), ldc:float(0.06666667f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, xor:int(ldc:int(-28780), ldc:int(-26476)))
            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u0800\u6b5f\u4cd9\u0c95\u6cfe, getfield:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a](\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937))
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, var_3_80:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(5413), ldc:int(-5416)), and:int(ldc:int(21070), ldc:int(-21071)), and:int(ldc:int(20448), ldc:int(-20454)), and:int(ldc:int(21650), ldc:int(-22163)), and:int(ldc:int(18986), ldc:int(-18987)), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_3_80:\u5db4\ud523\u7043\u6c52\u8308\u8350), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_3_80:\u5db4\ud523\u7043\u6c52\u8308\u8350), and:int[expected:boolean](ldc:int(-3163), ldc:int(3098)), and:int[expected:boolean](ldc:int(8323), ldc:int(4129)), and:int[expected:boolean](ldc:int(-27306), ldc:int(10921)), and:int[expected:boolean](ldc:int(11528), ldc:int(-11577)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u839e\ua562\u5f50\u4f4a\u3e2a\u983f, ldc:int(33984))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokevirtual:void(\u5140\u4ab3\u183a\ud523\u071d\u983f::close, getfield:\u5140\u4ab3\u183a\ud523\u071d\u983f(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8bb0\u965f\uc29a\u4975\uc229\ub32d() {
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
            
            if (logicalnot:boolean(invokestatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u4179\u8d90\u718f\uf995\u92ff\u12cb))) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uf9c5\u983f\u8308\ud4fe\u7c6b\uae5d, invokedynamic:IntSupplier(getAsInt:(L\ubcb0\ud12e\u51fa\u8aa5\u0c95/\u5140\u4ab3\u183a\ud523\u071d\u983f;)Ljava/util/function/IntSupplier;, getfield:\u5140\u4ab3\u183a\ud523\u071d\u983f(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u9033\uceb8\u5d20\u5db4\u9af2\ud158, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937)), ldc:int(16))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u416d\u3504\u183a\u3e75\u5db4\u8413(float p0) {
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
            return:int(f2i:int(mul:float(p0:float, ldc:float(15.0f))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u7ce1\u5f50\u3bc9\u59ec\ucfaf\u5bc4(boolean p0) {
        var_1_5F : int
        stack_7E_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1894286642), ldc:int(2052842970))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1979317214))
                stack_7E_0 = ldc:int(10)
            }
            else {
                stack_7E_0 = xor:int(ldc:int(8226), ldc:int(8225))
            }
            
            return:int(stack_7E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static int \u760c\ufcaf\u6b5f\ubb2b\ud36e\u9255(int p0, int p1) {
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
            return:int(or:int(p0:int, shl:int(p1:int, ldc:int(16))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u760c\ufcaf\u6b5f\ubb2b\ud36e\u9255(float p0, boolean p1) {
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
            return:int(invokestatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u760c\ufcaf\u6b5f\ubb2b\ud36e\u9255, invokestatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u416d\u3504\u183a\u3e75\u5db4\u8413, p0:float), invokestatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u7ce1\u5f50\u3bc9\u59ec\ucfaf\u5bc4, p1:boolean)))
        }
        
        goto(Label_0006)
    }
    
    public void \u446c\ub1b9\uf9c5\ua068\u0c95\u76bc() {
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
            
            if (logicalnot:boolean(invokestatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u4179\u8d90\u718f\uf995\u92ff\u12cb))) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71ae\u16f6\u6d69\uc238\u56bd\u1833)
            }
            
            return:void()
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
            putstatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u624e\u516c\u6cfe\u4c04\u8753\u120d, invokestatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u760c\ufcaf\u6b5f\ubb2b\ud36e\u9255, and:int(ldc:int(-24835), ldc:int(24834)), ldc:int(10)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud12e\ubff1\u0800\u6cfe\u8d90\u8753(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_600 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60B : int
        
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
        var_3_600 = and:int(ldc:int(315684946), ldc:int(-547695393))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\ud51e\ucfaf\u392e\u071d\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(-77865222))
            var_5_7D = and:int(ldc:int(-29192), ldc:int(29187))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13353), ldc:int(13352)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_600:int, ldc:int(2136577246))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(321), ldc:int(2185)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(18720), ldc:int(18721)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_600 = and:int(var_3_D2:int, ldc:int(1600049750))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(12337), ldc:int(16651)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1887723262))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1705198472))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(2099497666))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-685375428))
                    }
                    else {
                        var_3_600 = and:int(var_3_600:int, ldc:int(981194711))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1660900672))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1022031721))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-586261207))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(550944373))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1964927644))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(177357680))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-142683526))
                            var_11_E3 = and:int(ldc:int(16633), ldc:int(-18174))
                            goto(Label_1410)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1790977932))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-297956540))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1935022810))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1037734182))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(1526438362))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-98000069))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-927119104))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1855461139))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(376888154))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0793:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1682966328))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(762663301))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1220045580))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1159989249))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(21), ldc:int(24577))
                                goto(Label_1039)
                            }
                        }
                    }
                    
                    Label_0904:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-1669307978))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1158697414))
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-16786817))
                        var_11_E3 = and:int(ldc:int(3611), ldc:int(-3612))
                    }
                    
                    Label_1039:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1536790770))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-144297537))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-239750790))
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1256940535))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_600 = and:int(var_3_600:int, ldc:int(-757792906))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1279)
                            }
                        }
                    }
                    
                    Label_1159:
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1039)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(1177562825))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_600:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-72445296))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-2116528319))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_600 = and:int(var_3_600:int, ldc:int(-8873129))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1410)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1279:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1123462109))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1557181058))
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1975010192))
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(973632174))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(402561490))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1410:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1421:
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-185569585))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-1627936365))
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(1543144913))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-25325800))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_600:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_600 = and:int(var_3_600:int, ldc:int(-539062182))
                        var_17_60B = add:int(var_16_111:int, xor:int(ldc:int(6276), ldc:int(6277)))
                        looporswitchbreak()
                    }
                    
                    var_3_600 = and:int(var_3_600:int, ldc:int(623678124))
                }
                
                var_3_600 = and:int(var_3_600:int, ldc:int(-564800394))
                
                if (cmple:boolean(var_5_7D = var_17_60B:int, sub:int(var_6_84:int, and:int(ldc:int(14601), ldc:int(17607))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_600:int, ldc:int(4096)), ldc:int(0))) {
            var_3_600 = and:int(var_3_600:int, ldc:int(-1266170621))
            goto(Label_0106)
        }
    }
}
