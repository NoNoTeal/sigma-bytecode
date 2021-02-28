public class \ub113\uc4d2\u183a\u527a\u6435.\u4bc8\ub32d\u4daf\u759a\u9033\u7043 {
    public void \u4bc8\ub32d\u4daf\u759a\u9033\u7043(java.io.InputStream p0) {
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
        invokespecial:Object(Object::<init>, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)
        putfield:PushbackInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u40a9\ub1b9\u416d\ud171\uc2e8\u6b0d, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043, initobject:PushbackInputStream(PushbackInputStream::<init>, p0:InputStream))
        putfield:DataInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u8709\u12b2\u61a4\ucb79\u8350\u6c52, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043, initobject:DataInputStream(DataInputStream::<init>, getfield:PushbackInputStream[expected:InputStream](\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u40a9\ub1b9\u416d\ud171\uc2e8\u6b0d, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
        putfield:boolean(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u64ab\u183a\u6cfe\u16f6\u36d3\u759a, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043, and:int[expected:boolean](ldc:int(26337), ldc:int(2317)))
        
        if (invokespecial:boolean(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u5d20\u7ce1\ufcaf\u5245\u0800\u3dd3, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)) {
            return:void()
        }
        
        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\uc3e3\u5f50\uc4d2\u9255\ua562\u527a), and:int(ldc:int(-15259), ldc:int(7066)))))
    }
    
    public byte[] \u64ab\u873d\uf94d\u88c5\u516c\uc29a() {
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
            return:byte[](invokevirtual:byte[](\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u97e6\u927d\u98a4\ubefe\u392e\u927d, getfield:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u516c\u56bd\u3dd3\u8640\u647c\u9937, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u1833\u40a9\u7e3f\u98a4\uc84e\ub7dc() {
        var_1_5F : int
        var_3_91 : byte[]
        
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
            var_1_5F = and:int(ldc:int(2036814889), ldc:int(588184827))
            
            if (logicalnot:boolean(getfield:boolean(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u64ab\u183a\u6cfe\u16f6\u36d3\u759a, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-274760279))
                invokespecial:boolean(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u5d20\u7ce1\ufcaf\u5245\u0800\u3dd3, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)
            }
            else {
                putfield:boolean(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u64ab\u183a\u6cfe\u16f6\u36d3\u759a, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043, and:int[expected:boolean](ldc:int(-24663), ldc:int(16470)))
            }
            
            var_3_91 = newarray:byte[](byte.class, invokevirtual:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u61a4\u8709\u67d0\u4f52\ub70c\u6d99, getfield:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u516c\u56bd\u3dd3\u8640\u647c\u9937, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
            invokevirtual:void(DataInputStream::readFully, getfield:DataInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u8709\u12b2\u61a4\ucb79\u8350\u6c52, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043), var_3_91:byte[])
            return:byte[](var_3_91:byte[])
        }
        
        goto(Label_0006)
    }
    
    private boolean \u5d20\u7ce1\ufcaf\u5245\u0800\u3dd3() {
        var_1_9A : int
        var_3_67 : int
        var_4_6F : int
        var_5_DB : int
        var_5_FA : int
        
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
            var_1_9A = and:int(ldc:int(-995275876), ldc:int(-4206679))
            var_3_67 = and:int(ldc:int(-9680), ldc:int(9671))
            var_4_6F = xor:int(ldc:int(-27720), ldc:int(-29768))
            
            loop {
                if (cmpne:boolean(and:int(var_1_9A:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0159)
                }
                
                if (cmpeq:boolean(and:int(var_1_9A:int, ldc:int(32)), ldc:int(0))) {
                    var_1_9A = and:int(var_1_9A:int, ldc:int(-19321110))
                    
                    if (cmpeq:boolean(var_3_67:int, ldc:int(0))) {
                        if (cmpgt:boolean(var_4_6F:int, ldc:int(0))) {
                            var_5_DB = invokevirtual:int(PushbackInputStream::read, getfield:PushbackInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u40a9\ub1b9\u416d\ud171\uc2e8\u6b0d, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043))
                            inc:int(var_4_6F, ldc:int(-1))
                            
                            if (cmpne:boolean(var_5_DB:int, and:int(ldc:int(255), ldc:int(12799)))) {
                                loopcontinue()
                            }
                            
                            var_5_FA = invokevirtual:int(PushbackInputStream::read, getfield:PushbackInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u40a9\ub1b9\u416d\ud171\uc2e8\u6b0d, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043))
                            
                            if (cmpeq:boolean(and:int(shr:int(var_5_FA:int, xor:int(ldc:int(4145), ldc:int(4149))), ldc:int(15)), ldc:int(15))) {
                                var_3_67 = xor:int(ldc:int(4352), ldc:int(4353))
                            }
                            
                            var_1_9A = and:int(var_1_9A:int, ldc:int(1958349755))
                            invokevirtual:void(PushbackInputStream::unread, getfield:PushbackInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u40a9\ub1b9\u416d\ud171\uc2e8\u6b0d, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043), var_5_FA:int)
                            loopcontinue()
                        }
                    }
                }
                
                Label_0136:
                
                if (cmpne:boolean(and:int(var_1_9A:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_9A:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_9A = and:int(var_1_9A:int, ldc:int(2006751983))
                    
                    if (cmpne:boolean(var_3_67:int, ldc:int(0))) {
                        putfield:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u516c\u56bd\u3dd3\u8640\u647c\u9937, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043, initobject:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::<init>, getfield:DataInputStream(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u8709\u12b2\u61a4\ucb79\u8350\u6c52, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
                    }
                }
                
                Label_0159:
                
                if (cmpne:boolean(and:int(var_1_9A:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_9A = and:int(var_1_9A:int, ldc:int(1065046820))
                    goto(Label_0136)
                }
                
                if (cmpne:boolean(and:int(var_1_9A:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_9A = and:int(var_1_9A:int, ldc:int(1853102346))
            }
            
            return:boolean(var_3_67:boolean)
        }
        
        goto(Label_0006)
    }
    
    public int \u36d3\u4daf\ud523\ucfaf\u3776\uc246() {
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
            return:int(invokevirtual:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\ua6bd\u1833\ubefe\ua3b4\ud36e\ubff1, getfield:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u516c\u56bd\u3dd3\u8640\u647c\u9937, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
        }
        
        goto(Label_0006)
    }
    
    public int \u0b8e\u8df4\u4492\u47c2\u5bc4\u9a18() {
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
            return:int(invokevirtual:int(\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523::\u5fe1\ub113\u88c5\u3dd3\u8258\u51b2, getfield:\uae5d\u7006\uc3e3\u4f52\u3d4b\ud523(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u516c\u56bd\u3dd3\u8640\u647c\u9937, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_17F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_191_0 : byte[] [generated]
        stack_1E1_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_191 : byte [generated]
        var_0_233 : int
        expr_23D : byte [generated]
        stack_281_2 : byte [generated]
        stack_260_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1D0 : byte[]
        var_5_1D1 : int
        expr_D3 : int [generated]
        expr_FE : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_17F = and:int(ldc:int(-301688604), ldc:int(1829505398))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("cOecDn96dieAAgDueu6qjnSsszkM")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-38387995))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_191 = loadelement:byte(stack_191_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, or:int(and:int(shl:int(expr_191:byte, xor:int(ldc:int(-32489), ldc:int(-32493))), ldc:int(-16)), and:int(shr:int(expr_191:byte[expected:int], xor:int(ldc:int(4676), ldc:int(4672))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        var_0_17F = and:int(var_0_17F:int, ldc:int(-1366173428))
        Label_0552:
        
        while (cmpne:boolean(and:int(var_0_17F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_233 = and:int(var_0_17F:int, ldc:int(1705396854))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_23D = stack_281_2 = loadelement(stack_23D_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(3)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_281_2 = stack_260_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(3))))
                goto(Label_0624)
            }
            
            Label_0586:
            
            if (cmpeq:boolean(and:int(var_0_233:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_233 = and:int(var_0_233:int, ldc:int(-1066509025))
            }
            else {
                var_0_233 = and:int(var_0_233:int, ldc:int(1948162814))
                stack_281_2 = stack_260_0 = add:byte(expr_23D:byte, ldc:byte(3))
            }
            
            Label_0624:
            
            if (cmpeq:boolean(and:int(var_0_233:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0586)
            }
            
            var_0_17F = and:int(var_0_233:int, ldc:int(-546891524))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_281_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0216)
        }
        
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(256)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1382619044))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-805426714))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1D0 = newarray:byte[](byte.class, expr_98:int)
                var_5_1D1 = expr_98:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-268969481))
                    var_5_1D1 = add:int(var_5_1D1:int, ldc:int(-1))
                    storeelement:byte(var_3_1D0:byte[], var_5_1D1:int, add:int(shl:int(loadelement:byte(stack_1E1_0:byte[], var_5_1D1:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1D1:int, and:int(ldc:int(6321), ldc:int(1539)))), ldc:int(3)), xor:int(ldc:int(2091), ldc:int(2100)))))
                    
                    if (cmpne:boolean(var_5_1D1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_1D0:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-265235974))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-211546952))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(1985084806))
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-812312324))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_16C = expr_D3:int
                var_3_171 = newarray:byte[](byte.class, expr_D3:int)
                var_5_172 = expr_D3:int
                goto(Label_0552)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(1120615435))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-995701401))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2A5 = expr_FE:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-16466572))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, add:byte(xor:byte(loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int), ldc:byte(105)), ldc:byte(82)))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-769201527))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_165_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32764), ldc:int(-32763)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17), ldc:int(16)))
            storeelement:String(expr_144:String[], and:int(ldc:int(30856), ldc:int(-32457)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-19567), ldc:int(19530)), xor:int(ldc:int(17037), ldc:int(17049))))
            putstatic:String[](\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\uc3e3\u5f50\uc4d2\u9255\ua562\u527a, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u3711\u600f\u12b2\u34df\u61a4\u9af2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_627 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_632 : int
        
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
        var_3_627 = and:int(ldc:int(-1928696312), ldc:int(-2118226414))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4bc8\ub32d\u4daf\u759a\u9033\u7043[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2048)), ldc:int(0))) {
            var_3_627 = and:int(var_3_627:int, ldc:int(-334824453))
            var_5_7D = and:int(ldc:int(-16328), ldc:int(15300))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31748), ldc:int(-32069)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_627:int, ldc:int(-1715569946))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(18450), ldc:int(18451)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-32064), ldc:int(-32063)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_627 = and:int(var_3_D2:int, ldc:int(-1153795134))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(19393), ldc:int(1065)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1528138738))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1102495026))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1850784554))
                        goto(Label_0551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1779052841))
                    }
                    else {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-485524236))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0551)
                            }
                            
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-663871899))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1141184858))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1897751872))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(2104128421))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-1560286417))
                            var_11_E3 = and:int(ldc:int(10568), ldc:int(-27497))
                            goto(Label_1477)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0551:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(719821063))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1054513672))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-829445205))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(1287475474))
                            loopcontinue()
                        }
                        
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1507164825))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(64)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-927823974))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1119871983))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(64)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-252875137))
                            goto(Label_0551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-65010429))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_627 = and:int(var_3_627:int, ldc:int(-128190174))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0796:
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1408018500))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1603043925))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1329947165))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-600672178))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(256)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-1597867413))
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(256)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-431511776))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-2010844106))
                            loopcontinue()
                        }
                        
                        var_3_627 = and:int(var_3_627:int, ldc:int(-711012378))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(4097), ldc:int(4096))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(554269434))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1148874420))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(831544747))
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_627 = and:int(var_3_627:int, ldc:int(-45168333))
                        var_11_E3 = and:int(ldc:int(25626), ldc:int(-25627))
                    }
                    
                    Label_1085:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1567049746))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(64)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1359904292))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-367445610))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-233298669))
                            loopcontinue()
                        }
                        
                        var_3_627 = and:int(var_3_627:int, ldc:int(-984881027))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(1321008213))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(1397991456))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_627 = and:int(var_3_627:int, ldc:int(-1129350789))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1477)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1002883237))
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1731051957))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(564127429))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1414009732))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(881321718))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1050017521))
                        goto(Label_0551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(32)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(1516119994))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_627 = and:int(var_3_627:int, ldc:int(-986788149))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1477:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_632 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1488:
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(4)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-299108586))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1984130275))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_627:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_627 = and:int(var_3_627:int, ldc:int(-1495572836))
                        var_17_632 = add:int(var_16_111:int, and:int(ldc:int(1395), ldc:int(8325)))
                        looporswitchbreak()
                    }
                }
                
                var_3_627 = and:int(var_3_627:int, ldc:int(-909484089))
                
                if (cmple:boolean(var_5_7D = var_17_632:int, sub:int(var_6_84:int, xor:int(ldc:int(6147), ldc:int(6146))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_627:int, ldc:int(131072)), ldc:int(0))) {
            var_3_627 = and:int(var_3_627:int, ldc:int(1685066643))
            goto(Label_0106)
        }
    }
}
